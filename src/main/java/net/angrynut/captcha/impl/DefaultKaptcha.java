package net.angrynut.captcha.impl;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;
import java.awt.image.BufferedImage;

import net.angrynut.captcha.BackgroundProducer;
import net.angrynut.captcha.CaptchaProducer;
import net.angrynut.captcha.GimpyEngine;
import net.angrynut.captcha.text.TextProducer;
import net.angrynut.captcha.text.WordRenderer;
import net.angrynut.captcha.util.Configurable;

/**
 * Default {@link CaptchaProducer} implementation which draws a captcha image using
 * {@link WordRenderer}, {@link GimpyEngine}, {@link BackgroundProducer}.
 * Text creation uses {@link TextProducer}.
 */
public class DefaultKaptcha extends Configurable implements CaptchaProducer
{
	private int width = 200;

	private int height = 50;

	/**
	 * Create an image which will have written a distorted text.
	 * 
	 * @param text
	 *            the distorted characters
	 * @return image with the text
	 */
	public BufferedImage createImage(String text)
	{
		WordRenderer wordRenderer = getConfig().getWordRendererImpl();
		GimpyEngine gimpyEngine = getConfig().getObscurificatorImpl();
		BackgroundProducer backgroundProducer = getConfig().getBackgroundImpl();
		boolean isBorderDrawn = getConfig().isBorderDrawn();
		this.width = getConfig().getWidth();
		this.height = getConfig().getHeight();

		BufferedImage bi = wordRenderer.renderWord(text, width, height);
		bi = gimpyEngine.getDistortedImage(bi);
		bi = backgroundProducer.addBackground(bi);
		Graphics2D graphics = bi.createGraphics();
		if (isBorderDrawn)
		{
			drawBox(graphics);
		}
		return bi;
	}

	private void drawBox(Graphics2D graphics)
	{
		Color borderColor = getConfig().getBorderColor();
		int borderThickness = getConfig().getBorderThickness();

		graphics.setColor(borderColor);

		if (borderThickness != 1)
		{
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

	/**
	 * @return the text to be drawn
	 */
	public String createText()
	{
		return getConfig().getTextProducerImpl().getText();
	}
}
