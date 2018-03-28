package net.angrynut.captcha;

import java.awt.image.BufferedImage;

import net.angrynut.captcha.comps.background.IBackgroundProducer;
import net.angrynut.captcha.comps.gimpy.IGimpyEngine;
import net.angrynut.captcha.comps.text.renderer.ITextRenderer;

/**
 * Responsible for creating captcha image with a text drawn on it.
 */
public interface ICaptchaProducer {
	/**
	 * Create an image which will have written a distorted text.
	 * 
	 * @param text
	 *            the distorted characters
	 * @return image with the text
	 */
	BufferedImage createImage(String text);

	void setBackgroundProducer(IBackgroundProducer producer);

	void setGimpyEngine(IGimpyEngine engine);

	void setTextRenderer(ITextRenderer renderer);
}