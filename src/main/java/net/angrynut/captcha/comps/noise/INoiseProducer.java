package net.angrynut.captcha.comps.noise;

import java.awt.image.BufferedImage;

/**
 * {@link INoiseProducer} is responsible for adding noise to an image.
 */
public interface INoiseProducer
{
	/**
	 * Adds noise to an image. It uses four factor values to determine the noise
	 * curve.
	 * 
	 * @param image
	 *            the image to add the noise to
	 * @param factorOne
	 * @param factorTwo
	 * @param factorThree
	 * @param factorFour
	 */
	public void makeNoise(BufferedImage image, float factorOne,
			float factorTwo, float factorThree, float factorFour);
}