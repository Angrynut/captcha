package net.angrynut.captcha.comps.noise;

import java.awt.image.BufferedImage;

/**
 * 本接口用于为图片添加噪声。
 */
public interface INoiseProducer {
	/**
	 * 往图片中添加噪声。使用四个参数来决定噪声曲线。
	 */
	public void makeNoise(BufferedImage image, float factorOne, float factorTwo, float factorThree, float factorFour);
}