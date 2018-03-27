package net.angrynut.captcha.comps.text;

import java.util.Random;

import lombok.val;
import net.angrynut.captcha.util.CharsUtil;

/**
 * {@link DefaultTextProducer} creates random text from an array of characters
 * with specified length.
 */
public class DefaultTextProducer implements ITextProducer {

	private static int DEFAULT_LEN = 4;
	private static char[] DEFAULT_CHARS = CharsUtil.toChars("abcdefghijklmnopqrstuvwxyz123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ");

	private int length;
	private char[] chars;
	private Random rand = new Random();

	public DefaultTextProducer() {
		this(DEFAULT_LEN, DEFAULT_CHARS);
	}

	public DefaultTextProducer(int length, char[] chars) {
		this.length = length;
		this.chars = chars;
	}

	/**
	 * @return the random text
	 */
	public String getText() {
		val text = new StringBuilder();
		for (int i = 0; i < length; i++) {
			text.append(chars[rand.nextInt(chars.length)]);
		}
		return text.toString();
	}
}
