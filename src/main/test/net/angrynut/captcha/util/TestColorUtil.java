package net.angrynut.captcha.util;

import java.awt.Color;

import org.junit.Test;

import static net.angrynut.captcha.util.ColorUtil.*;
import static org.junit.Assert.*;

public class TestColorUtil {

	@Test
	public void test_intToRGBColor() {
		Color red = intToRGBColor(0xFF0000);
		assertEquals(red, Color.red);
		
		Color green = intToRGBColor(0x00FF00);
		assertEquals(green, Color.green);
		
		Color blue = intToRGBColor(0x0000FF);
		assertEquals(blue, Color.blue);
	}
	
	@Test
	public void test_stringToRGBColor() {
		Color red = stringToRGBColor("#FF0000");
		assertEquals(red, Color.red);
		
		Color black = stringToRGBColor("black");
		assertEquals(black, Color.black);
		
		Color blue = stringToRGBColor("bLuE");
		assertEquals(blue, Color.blue);
	}
	
	@Test
	public void test_toColor() {
		Color red = toColor(0xFF0000);
		assertEquals(red, Color.red);
		
		Color green = toColor(0x00FF00);
		assertEquals(green, Color.green);
		
		Color blue = toColor(0x0000FF);
		assertEquals(blue, Color.blue);
		
		red = toColor("#FF0000");
		assertEquals(red, Color.red);
		
		Color black = toColor("black");
		assertEquals(black, Color.black);
		
		blue = toColor(Color.blue);
		assertEquals(blue, Color.blue);
	}
	
}
