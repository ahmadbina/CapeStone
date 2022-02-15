package Utilites;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import core.Base;

public class Screenshot extends Base {
	public static void takeScreenShot(String fileName) throws IOException {
		
		String path = ".\\output\\screenShots";
		File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File(path + fileName + ".png"));
	}


}
