package net.angrynut.captcha.util;

import java.awt.Font;

public final class FontUtil {
	
	public static final int DEFAULT_FONT_SIZE = 40;
	
	public static final Font[] DEFAULT_FONTS = new Font[] {
			new Font("Arial", Font.BOLD, DEFAULT_FONT_SIZE), 
			new Font("Courier", Font.BOLD, DEFAULT_FONT_SIZE)
	};
	
	/**
	 * <pre>
	 * stringToFonts("Arial,Courier");
	 * </pre>
	 */
	public static Font[] stringToFonts(String fontNamesStr) {
		if ("".equals(fontNamesStr) || fontNamesStr == null) {
			return DEFAULT_FONTS;
		}
		
		Font[] fonts;
		String[] fontNames = fontNamesStr.split(",");
		fonts = new Font[fontNames.length];
		for (int i = 0; i < fontNames.length; i++) {
			fonts[i] = new Font(fontNames[i], Font.BOLD, DEFAULT_FONT_SIZE);
		}
		return fonts;
	}
	
	/**
	 * <pre>
	 * toFonts(DEFAULT_FONTS);
	 * toFonts(new Font("Arial", Font.BOLD, DEFAULT_FONT_SIZE));
	 * toFonts("Arial,Courier");
	 * </pre>
	 */
	public static Font[] toFonts(Object fonts) {
		if (fonts instanceof Font[]) {
			return (Font[])fonts;
		}
		
		if (fonts instanceof Font) {
			return new Font[] { (Font) fonts };
		}
		
		if (fonts instanceof String) {
			return stringToFonts((String) fonts);
		}
		
		throw new IllegalArgumentException("Only support instances of Font[], Font or String");
	}
}
