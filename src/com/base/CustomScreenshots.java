package com.base;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class CustomScreenshots {
	
	public static String takeScreenshot(WebDriver driver, String fileName) throws IOException {
		String fileName2 = fileName + ".png";
		String directory = "D:\\MyFiles\\Eclipse_Selenium\\EclipseWorkbook\\TestNGTutorials\\screenshots\\";
		File sourceFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(sourceFile, new File(directory + fileName2));
		String destination = directory + fileName2;
		return destination;
	}
}