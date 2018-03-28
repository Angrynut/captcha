package net.angrynut.captcha.comps.text.producer;

/**
 * 本接口负责生成字符文本。
 */
public interface ITextProducer {
	
	/**
	 * 获取一个非空字符串。
	 */
	public String getText();
}