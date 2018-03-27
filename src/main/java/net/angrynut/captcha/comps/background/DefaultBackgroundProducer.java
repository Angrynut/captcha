package net.angrynut.captcha.comps.background;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;

import lombok.val;

import static java.awt.RenderingHints.*;

/**
 * 接口 {@link IBackgroundProducer} 的默认实现，用于为图像提供渐变背景。
 * <p>
 * 渐变色是斜对角的，从左上角到右下角。
 */
public class DefaultBackgroundProducer implements IBackgroundProducer {

	private Color colorFrom;
	private Color colorTo;

	public DefaultBackgroundProducer() {
		this(Color.LIGHT_GRAY, Color.WHITE);
	}

	public DefaultBackgroundProducer(Color colorFrom, Color colorTo) {
		super();
		this.colorFrom = colorFrom;
		this.colorTo = colorTo;
	}

	public BufferedImage addBackground(BufferedImage baseImage) {

		int width = baseImage.getWidth();
		int height = baseImage.getHeight();

		// 创建一个不透明的图像
		val imageWithBackground = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);

		val graph = (Graphics2D) imageWithBackground.getGraphics();
		val hints = new RenderingHints(KEY_ANTIALIASING, VALUE_ANTIALIAS_OFF);

		hints.add(new RenderingHints(KEY_COLOR_RENDERING, VALUE_COLOR_RENDER_QUALITY));
		hints.add(new RenderingHints(KEY_ALPHA_INTERPOLATION, VALUE_ALPHA_INTERPOLATION_QUALITY));

		hints.add(new RenderingHints(KEY_RENDERING, VALUE_RENDER_QUALITY));

		graph.setRenderingHints(hints);

		val paint = new GradientPaint(0, 0, colorFrom, width, height, colorTo);
		graph.setPaint(paint);
		graph.fill(new Rectangle2D.Double(0, 0, width, height));

		// 把透明图像画在背景上
		graph.drawImage(baseImage, 0, 0, null);

		return imageWithBackground;
	}
}
