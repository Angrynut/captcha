package net.angrynut.captcha.util;

import java.awt.Font;

import org.junit.Assert;
import org.junit.Test;

public class TestFontUtil {
	
	public static final Font[] DEFAULT_FONTS = new Font[] {
			new Font("Arial", Font.BOLD, 40), 
			new Font("Courier", Font.BOLD, 40)
	};
	
	@Test
	public void test_stringToFonts() {
		Assert.assertNull(FontUtil.stringToFonts(null));
		Assert.assertArrayEquals(DEFAULT_FONTS, FontUtil.stringToFonts("Arial,Courier"));
	}
 
}
