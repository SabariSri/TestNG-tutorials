package com.extentreports;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class LoginTest_POmodel {
	
	private WebDriver driver;
	private String baseUrl;
	ExtentReports report;
	ExtentTest test;
	HomePage_Methods perform;

	@BeforeClass
	public void beforeClass() {
		baseUrl = "http://www.letskodeit.com/";
		report = ExtentFactory.getInstance();
		test = report.startTest("Verify Welcome Text");
		System.setProperty("webdriver.gecko.driver", "D:\\MyFiles\\Eclipse_Selenium\\Jars_Drivers\\geckodriver.exe");
		driver = new FirefoxDriver();
		perform = new HomePage_Methods(driver, test);
		test.log(LogStatus.INFO, "Browser Started...");

		// Maximize the browser's window
		driver.manage().window().maximize();
		test.log(LogStatus.INFO, "Browser Maximized");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(baseUrl);
		test.log(LogStatus.INFO, "Web application opened");
	}
	
	@Test
	public void test1_validLoginTest() throws Exception {
		perform.login("test@email.com", "abcabc");
		
		Thread.sleep(3000);
		
		boolean result = perform.isWelcomeTextPresent();

		Assert.assertTrue(result);
		test.log(LogStatus.PASS, "Verified Welcome Text");
	}
	
	@AfterClass
	public void afterClass() {
		driver.quit();
		report.endTest(test);
		report.flush();
	}
}