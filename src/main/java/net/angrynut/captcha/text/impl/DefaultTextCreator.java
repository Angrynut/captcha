package net.angrynut.captcha.text.impl;

import java.util.Random;

import net.angrynut.captcha.text.TextProducer;
import net.angrynut.captcha.util.Configurable;

/**
 * {@link DefaultTextCreator} creates random text from an array of characters
 * with specified length.
 */
public class DefaultTextCreator extends Configurable implements TextProducer
{
	/**
	 * @return the random text
	 */
	public String getText()
	{
		int length = getConfig().getTextProducerCharLength();
		char[] chars = getConfig().getTextProducerCharString();
		Random rand = new Random();
		StringBuffer text = new StringBuffer();
		for (int i = 0; i < length; i++)
		{
			text.append(chars[rand.nextInt(chars.length)]);
		}

		return text.toString();
	}
}
