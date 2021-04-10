package com.extentreports;

import com.relevantcodes.extentreports.ExtentReports;

public class ExtentFactory {
	public static ExtentReports getInstance() {
		ExtentReports extent;
		String Path = "D:\\MyFiles\\Eclipse_Selenium\\EclipseWorkbook\\TestNGTutorials\\extent_report\\result.html";
		extent = new ExtentReports(Path, false);
		extent
	     .addSystemInfo("Selenium Version", "2.52")
	     .addSystemInfo("Platform", "Windows");

		return extent;
	}
}
