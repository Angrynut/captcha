package net.angrynut.captcha.comps.text;

import java.awt.image.BufferedImage;

/**
 * 本接口负责渲染字符串。
 */
public interface IWordRenderer {
	
	/**
	 * TODO: 添加注释
	 */
	public BufferedImage renderWord(String word, int width, int height);
}
