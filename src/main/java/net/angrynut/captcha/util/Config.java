package net.angrynut.captcha.util;

import java.awt.Color;
import java.awt.Font;

import lombok.Getter;
import net.angrynut.captcha.BackgroundProducer;
import net.angrynut.captcha.CaptchaProducer;
import net.angrynut.captcha.Constants;
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
	private String sessionKey = Constants.KAPTCHA_SESSION_KEY;
	// TODO  干啥用的?
	private String sessionDate = Constants.KAPTCHA_SESSION_DATE;
	

	private CaptchaProducer captchaProducer = new DefaultCaptchaProducer();
	private TextProducer textProducer = new DefaultTextCreator();
	private NoiseProducer noiseProducer = new DefaultNoiseProducer();
	private GimpyEngine gimpyEngine = new WaterRipple();
	private WordRenderer wordRenderer = new DefaultWordRenderer();
	private BackgroundProducer backgroundProducer = new DefaultBackgroundProducer();
	
}
