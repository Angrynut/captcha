package net.angrynut.captcha;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;
import java.awt.image.BufferedImage;

import lombok.Setter;
import net.angrynut.captcha.comps.background.DefaultBackgroundProducer;
import net.angrynut.captcha.comps.background.IBackgroundProducer;
import net.angrynut.captcha.comps.gimpy.IGimpyEngine;
import net.angrynut.captcha.comps.gimpy.WaterRippleGimpy;
import net.angrynut.captcha.comps.text.producer.ITextProducer;
import net.angrynut.captcha.comps.text.renderer.DefaultTextRenderer;
import net.angrynut.captcha.comps.text.renderer.ITextRenderer;

/**
 * Default {@link ICaptchaProducer} implementation which draws a captcha image
 * using {@link ITextRenderer}, {@link IGimpyEngine},
 * {@link IBackgroundProducer}. Text creation uses {@link ITextProducer}.
 */
public class DefaultCaptchaProducer implements ICaptchaProducer {

	private int width = 200;
	private int height = 50;

	private boolean borderDrawn = true;

	private Color borderColor = Color.BLACK;
	private int borderThickness = 1; // positive

	@Setter
	private ITextRenderer textRenderer = new DefaultTextRenderer();
	
	@Setter
	private IGimpyEngine gimpyEngine = new WaterRippleGimpy();
	
	@Setter
	private IBackgroundProducer backgroundProducer = new DefaultBackgroundProducer();
	
	/**
	 * Create an image which will have written a distorted text.
	 * 
	 * @param text
	 *            the distorted characters
	 * @return image with the text
	 */
	public BufferedImage createImage(String text) {
		BufferedImage bi = textRenderer.renderWord(text, width, height);
		bi = gimpyEngine.getDistortedImage(bi);
		bi = backgroundProducer.addBackground(bi);
		Graphics2D graphics = bi.createGraphics();
		if (borderDrawn) {
			drawBox(graphics);
		}
		return bi;
	}

	private void drawBox(Graphics2D graphics) {
		graphics.setColor(borderColor);

		if (borderThickness != 1) {
			BasicStroke stroke = new BasicStroke((float) borderThickness);
			graphics.setStroke(stroke);
		}

		Line2D line1 = new Line2D.Double(0, 0, 0, width);
		graphics.draw(line1);
		Line2D line2 = new Line2D.Double(0, 0, width, 0);
		graphics.draw(line2);
		line2 = new Line2D.Double(0, height - 1, width, height - 1);
		graphics.draw(line2);
		line2 = new Line2D.Double(width - 1, height - 1, width - 1, 0);
		graphics.draw(line2);
	}

}
