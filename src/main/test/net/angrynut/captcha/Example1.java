package net.angrynut.captcha;

import java.io.FileOutputStream;
import java.io.IOException;

import javax.imageio.ImageIO;

import lombok.val;

public class Example1 {

	public static void main(String[] args) throws IOException {
		val captchaProducer = new DefaultCaptchaProducer();
		val text = captchaProducer.createText();
		System.out.println(text);
		String filename = "D:\\captcha-" + text + ".jpg";
		val bi = captchaProducer.createImage(text);
		val out = new FileOutputStream(filename);
		ImageIO.write(bi, "jpg", out);
	}
}
