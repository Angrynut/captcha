package net.angrynut.captcha.comps.text.renderer;

import java.awt.image.BufferedImage;

/**
 * 本接口负责渲染字符串。
 */
public interface ITextRenderer {

	/**
	 * 创建一个具有指定宽度和高度的图片，并把指定文字渲染进去。
	 * 
	 * @param word 生成的图片中的文字
	 * @param width 生成的图片宽度
	 * @param height 生成的图片高度
	 * @return 具有指定宽高的、拥有指定文字的图片
	 */
	public BufferedImage renderWord(String word, int width, int height);
}
