package net.angrynut.captcha;

import java.awt.image.BufferedImage;

import net.angrynut.captcha.comps.background.IBackgroundProducer;
import net.angrynut.captcha.comps.gimpy.IGimpyEngine;
import net.angrynut.captcha.comps.text.ITextProducer;
import net.angrynut.captcha.comps.text.IWordRenderer;

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

	/**
	 * @return the text to be drawn
	 */
	String createText();

	void setBackgroundProducer(IBackgroundProducer producer);

	void setTextProducer(ITextProducer producer);

	void setGimpyEngine(IGimpyEngine engine);

	void setWordRenderer(IWordRenderer renderer);
}