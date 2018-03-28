package net.angrynut.captcha.comps.text.producer;

import java.util.Random;

import lombok.val;
import net.angrynut.captcha.util.CharsUtil;

/**
 * 此类用于获取具有指定长度的字符串。
 */
public class DefaultTextProducer implements ITextProducer {

	/**
	 * 生成字符串的默认长度
	 */
	private static int DEFAULT_LEN = 4;
	
	/**
	 * 用于随机字符的默认字符源数组
	 */
	private static char[] DEFAULT_CHARS = CharsUtil.toChars("abcdefghijklmnopqrstuvwxyz123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ");


	/**
	 * 生成字符串的长度
	 */
	private int length;
	
	/**
	 * 用于随机字符的字符源数组，所有的字符都从此数组中获取。
	 */
	private char[] chars;
	
	/**
	 * 随机数生成器
	 */
	private Random rand = new Random();

	public DefaultTextProducer() {
		this(DEFAULT_LEN, DEFAULT_CHARS);
	}

	public DefaultTextProducer(int length, char[] chars) {
		this.length = length;
		this.chars = chars;
	}

	/**
	 * @return 随机字符串
	 */
	public String getText() {
		val text = new StringBuilder();
		for (int i = 0; i < length; i++) {
			text.append(chars[rand.nextInt(chars.length)]);
		}
		return text.toString();
	}
}
