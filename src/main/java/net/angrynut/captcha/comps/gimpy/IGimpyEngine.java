package net.angrynut.captcha.comps.gimpy;

import java.awt.image.BufferedImage;

/**
 * {@link IGimpyEngine} is responsible for applying image distortion.
 */
public interface IGimpyEngine {
	/**
	 * @param baseImage
	 *            the base image
	 * @return the image with distortion applied to the base image
	 */
	public BufferedImage getDistortedImage(BufferedImage baseImage);
}