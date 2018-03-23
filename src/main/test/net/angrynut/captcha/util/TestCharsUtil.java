package net.angrynut.captcha.util;

import org.junit.Assert;
import org.junit.Test;

public class TestCharsUtil {

	@Test
	public void test_toChars() {
		Assert.assertNull(CharsUtil.toChars(null));
		Assert.assertArrayEquals(CharsUtil.toChars("123"), new char[] { '1', '2', '3' });
		Assert.assertArrayEquals(CharsUtil.toChars(new StringBuffer("123")),  new char[] { '1', '2', '3' });
		Assert.assertArrayEquals(CharsUtil.toChars(new char[] { '1', '2', '3' }),  new char[] { '1', '2', '3' });
	}
	
}
