package net.angrynut.captcha.comps.background;

import java.awt.image.BufferedImage;

/**
 * 本接口负责为指定图像添加背景。
 */
public interface IBackgroundProducer {
	/**
	 * 往指定图像上添加背景。
	 * 
	 * @param image
	 *            要添加背景的图像
	 * @return 添加过背景后的图像
	 */
	BufferedImage addBackground(BufferedImage image);
}
