package net.angrynut.captcha.comps.noise;

import java.awt.image.BufferedImage;

/**
 * 不产生噪声的 {@link INoiseProducer}}
 * 
 * @author Yuxing Wang
 */
public class NoNoise implements INoiseProducer {

	public void makeNoise(BufferedImage image, float factorOne, float factorTwo, float factorThree, float factorFour) {
		// Do nothing.
	}
}
