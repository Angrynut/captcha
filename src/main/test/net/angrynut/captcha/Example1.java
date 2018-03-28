package net.angrynut.captcha;

import java.io.FileOutputStream;
import java.io.IOException;

import javax.imageio.ImageIO;

import lombok.val;
import net.angrynut.captcha.comps.text.producer.DefaultTextProducer;

public class Example1 {

	public static void main(String[] args) throws IOException {
		val captchaProducer = new DefaultCaptchaProducer();
		val textProducer = new DefaultTextProducer();
		val text = textProducer.getText();
		System.out.println(text);
		String filename = "D:\\captcha-" + text + ".jpg";
		val bi = captchaProducer.createImage(text);
		val out = new FileOutputStream(filename);
		ImageIO.write(bi, "jpg", out);
	}
}
