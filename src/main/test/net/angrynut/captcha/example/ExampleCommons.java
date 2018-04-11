package net.angrynut.captcha.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import lombok.val;

public class ExampleCommons {

	public static String getOSShortName() {
		val osname = System.getProperty("os.name").toLowerCase();
		if (osname.contains("mac") && osname.contains("os")) {
			return "Mac";
		}

		if (osname.contains("Windows")) {
			return "Windows";
		}

		return "linux";
	}

	public static String exampleDirectory() {
		val exampleDir = System.getProperty("user.home") + "/captcha-examples/";
		val path = Paths.get(exampleDir);
		if (!Files.exists(path)) {
			try {
				Files.createDirectories(path);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		System.out.println("示例产生的文件在此目录下：" + exampleDir);
		return exampleDir;
	}

}
