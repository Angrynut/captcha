package net.angrynut.captcha.example.gimpy;

import java.io.FileOutputStream;
import java.io.IOException;

import javax.imageio.ImageIO;

import lombok.val;
import net.angrynut.captcha.DefaultCaptchaProducer;
import net.angrynut.captcha.comps.gimpy.FishEyeGimpy;
import net.angrynut.captcha.comps.text.producer.DefaultTextProducer;
import net.angrynut.captcha.example.ExampleCommons;

public class FishEyeGimpyExample {
	
	public static void main(String[] args) throws IOException {
		val captchaProducer = new DefaultCaptchaProducer();
		
		val gimpyEngine = new FishEyeGimpy();
		captchaProducer.setGimpyEngine(gimpyEngine);
		
		val textProducer = new DefaultTextProducer();
		val text = textProducer.getText();
		System.out.println(text);
		String filename = ExampleCommons.exampleDirectory() + text + ".jpg";
		val bi = captchaProducer.createImage(text);
		val out = new FileOutputStream(filename);
		ImageIO.write(bi, "jpg", out);
	}
}
