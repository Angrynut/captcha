package net.angrynut.captcha.util;


/**
 * A utility class to help to create {@code char} array.
 */
public final class CharsUtil {

	/**
	 * @param obj which type is {@code char[]} or {@link CharSequence}
	 * @return {@code char[]}
	 */
	public static char[] toChars(Object obj) {
		if (obj == null)
			return null;
		
		if (obj instanceof char[]) 
			return (char[]) obj;
		
		if (obj instanceof CharSequence) 
			return ((CharSequence) obj).toString().toCharArray();
		
		throw new IllegalArgumentException("Only support instances of char[] or CharSequence.");
	}

}
