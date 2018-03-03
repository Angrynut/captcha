package net.angrynut.captcha.util;

public final class CharsUtil {
	
	public static char[] toChars(Object obj) {
		if (obj instanceof char[]) 
			return (char[]) obj;
		
		if (obj instanceof CharSequence) 
			return ((CharSequence) obj).toString().toCharArray();
		
		throw new IllegalArgumentException("Only support instances of char[] or CharSequence.");
	}

}
