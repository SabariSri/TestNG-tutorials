package com.base;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.relevantcodes.extentreports.ExtentReports;

public class CustomReportName {
	
	public static ExtentReports getInstance(String fileName) throws IOException {
		String fileName2 = fileName + ".html";
		String reportFilePath = "D:\\MyFiles\\Eclipse_Selenium\\EclipseWorkbook\\TestNGTutorials\\extent_report\\" + fileName2;
		ExtentReports extent;
		extent = new ExtentReports(reportFilePath, false);
		return extent;
	}
}