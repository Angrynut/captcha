package net.angrynut.captcha.comps.noise;

import java.awt.image.BufferedImage;

/**
 * Imlemention of NoiseProducer that does nothing.
 * 
 * @author Yuxing Wang
 */
public class NoNoise implements INoiseProducer {
	/**
	 */
	public void makeNoise(BufferedImage image, float factorOne, float factorTwo, float factorThree, float factorFour) {
		// Do nothing.
	}
}
