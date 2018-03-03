package net.angrynut.captcha;


import org.junit.Test;

import static org.junit.Assert.*;

public class TestCommon {
	
	@Test
	public void testParseInt() {
		assertTrue(Integer.parseInt("FF", 16) == 255);
		assertTrue(Integer.parseInt("0f", 16) == 15);
		assertTrue(Integer.parseInt("Ff", 16) == 255);
	}
	
	@Test
	public void testRegex() {
		assertTrue("#FFee11".matches("#[0-9A-Fa-f]{6}"));
		assertFalse("1#FFee11".matches("#[0-9A-Fa-f]{6}"));
		assertFalse("#FFee111".matches("#[0-9A-Fa-f]{6}"));
	}

}
