package com.testcases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Enabled_TimeoutDemo {


	@BeforeClass
	public void setUp() {
		System.out.println("before class");
	}

	@AfterClass
	public void cleanUp() {
		System.out.println("after class");
	}

	@Test(enabled = false)
	public void testMethod1() {
		System.out.println("testMethod1");
	}

	@Test(timeOut=100)
	public void testMethod2() throws Exception {
		System.out.println("testMethod2");
		Thread.sleep(50);
	}

}