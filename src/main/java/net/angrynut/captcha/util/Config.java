package net.angrynut.captcha.util;

import java.awt.Color;
import java.awt.Font;

import lombok.Getter;
import net.angrynut.captcha.BackgroundProducer;
import net.angrynut.captcha.CaptchaProducer;
import net.angrynut.captcha.GimpyEngine;
import net.angrynut.captcha.NoiseProducer;
import net.angrynut.captcha.impl.DefaultBackgroundProducer;
import net.angrynut.captcha.impl.DefaultCaptchaProducer;
import net.angrynut.captcha.impl.DefaultNoiseProducer;
import net.angrynut.captcha.impl.WaterRipple;
import net.angrynut.captcha.text.TextProducer;
import net.angrynut.captcha.text.WordRenderer;
import net.angrynut.captcha.text.impl.DefaultTextCreator;
import net.angrynut.captcha.text.impl.DefaultWordRenderer;

/**
 * {@link Config} retrieves configuration values from properties file and
 * specifies default values when no value is specified.
 */
@Getter
public class Config
{
	
	public final static String CAPTCHA_SESSION_KEY = "CAPTCHA_SESSION_KEY";

	public final static String CAPTCHA_SESSION_DATE = "CAPTCHA_SESSION_DATE";
	
	private Color borderColor = Color.BLACK;
	private Color textProducerFontColor = Color.BLACK;
	private Color noiseColor = Color.BLACK;
	private Color backgroundColorFrom = Color.LIGHT_GRAY;
	private Color backgroundColorTo = Color.WHITE;
	private boolean borderDrawn = true;
	private int borderThickness = 1; // positive
	private int textProducerCharLength = 5; // positive
	private int textProducerCharSpace = 2; // positive
	private int textProducerFontSize = FontUtil.DEFAULT_FONT_SIZE; // positive
	private Font[] textProducerFonts;
	private int width = 200; // positive
	private int height = 50; // positive
	private char[] textProducerCharString = "abcde2345678gfynmnpwx".toCharArray();
	private String sessionKey = CAPTCHA_SESSION_KEY;
	// TODO  干啥用的?
	private String sessionDate = CAPTCHA_SESSION_DATE;

	private CaptchaProducer captchaProducer = new DefaultCaptchaProducer();
	private TextProducer textProducer = new DefaultTextCreator();
	private NoiseProducer noiseProducer = new DefaultNoiseProducer();
	private GimpyEngine gimpyEngine = new WaterRipple();
	private WordRenderer wordRenderer = new DefaultWordRenderer();
	private BackgroundProducer backgroundProducer = new DefaultBackgroundProducer();
	
	public Config setBorderColor(Object borderColor) {
		this.borderColor = ColorUtil.toColor(borderColor);
		return this;
	}
	
	public Config setTextProducerFontColor(Object textProducerFontColor) {
		this.textProducerFontColor = ColorUtil.toColor(textProducerFontColor);
		return this;
	}
	
	public Config setNoiseColor(Object noiseColor) {
		this.noiseColor = ColorUtil.toColor(noiseColor);
		return this;
	}
	
	public Config setBackgroundColorFrom(Object backgroundColorFrom) {
		this.backgroundColorFrom = ColorUtil.toColor(backgroundColorFrom);
		return this;
	}
	
	public Config setBackgroundColorTo(Object backgroundColorTo) {
		this.backgroundColorTo = ColorUtil.toColor(backgroundColorTo);
		return this;
	}
	
	public Config setBorderDrawn(boolean borderDrawn) {
		this.borderDrawn = borderDrawn;
		return this;
	}
	
	public Config setBorderThickness(int borderThickness) {
		if (borderThickness < 1)
			throw new IllegalArgumentException("borderThickness should be a positive Integer.");
		
		this.borderThickness = borderThickness;
		return this;
	}
	
	public Config setTextProducerCharLength(int textProducerCharLength) {
		if (textProducerCharLength < 1)
			throw new IllegalArgumentException("textProducerCharLength should be a positive Integer.");
		
		this.textProducerCharLength = textProducerCharLength;
		return this;
	}
	
	public Config setTextProducerCharSpace(int textProducerCharSpace) {
		if (textProducerCharSpace < 1)
			throw new IllegalArgumentException("textProducerCharSpace should be a positive Integer.");
		
		this.textProducerCharSpace = textProducerCharSpace;
		return this;
	}
	
	public Config setTextProducerFontSize(int textProducerFontSize) {
		if (textProducerFontSize < 1)
			throw new IllegalArgumentException("textProducerFontSize should be a positive Integer.");
		
		this.textProducerFontSize = textProducerFontSize;
		return this;
	}
	
	public Config setTextProducerFonts(Object textProducerFonts) {
		this.textProducerFonts = FontUtil.toFonts(textProducerFonts);
		return this;
	}
	
	public Config setWidth(int width) {
		if (width < 1)
			throw new IllegalArgumentException("width should be a positive Integer.");
		
		this.width = width;
		return this;
	}
	
	public Config setHeight(int height) {
		if (height < 1)
			throw new IllegalArgumentException("height should be a positive Integer.");
		
		this.height = height;
		return this;
	}
	
	public Config setTextProducerCharString(Object textProducerCharString) {
		this.textProducerCharString = CharsUtil.toChars(textProducerCharString);
		return this;
	}
	
	public Config setSessionKey(String sessionKey) {
		this.sessionKey = sessionKey;
		return this;
	}
	
	public Config setSessionDate(String sessionDate) {
		this.sessionDate = sessionDate;
		return this;
	}
	
	public Config setCaptchaProducer(CaptchaProducer captchaProducer) {
		this.captchaProducer = captchaProducer;
		return this;
	}
	
	public Config setTextProducer(TextProducer textProducer) {
		this.textProducer = textProducer;
		return this;
	}
	
	public Config setNoiseProducer(NoiseProducer noiseProducer) {
		this.noiseProducer = noiseProducer;
		return this;
	}
	
	public Config setGimpyEngine(GimpyEngine gimpyEngine) {
		this.gimpyEngine = gimpyEngine;
		return this;
	}
	
	public Config setWordRenderer(WordRenderer wordRenderer) {
		this.wordRenderer = wordRenderer;
		return this;
	}
	
	public Config setBackgroundProducer(BackgroundProducer backgroundProducer) {
		this.backgroundProducer = backgroundProducer;
		return this;
	}
	
	
	
	
}
