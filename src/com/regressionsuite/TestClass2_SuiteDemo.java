package com.regressionsuite;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.BeforeAfter_SuiteTestDemo;


public class TestClass2_SuiteDemo extends BeforeAfter_SuiteTestDemo {
	@BeforeClass
	public void setUp() {
		System.out.println("TestClass2_SuiteDemo > before class");
	}
	
	@AfterClass
	public void cleanUp() {
		System.out.println("TestClass2_SuiteDemo > after class");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("TestClass2_SuiteDemo > before every method");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("TestClass2_SuiteDemo > after every method");
	}
	
	@Test
	public void testMethod1() {
		System.out.println("TestClass2_SuiteDemo > testMethod1");
	}
	
	@Test
	public void testMethod2() {
		System.out.println("TestClass2_SuiteDemo > testMethod2");
	}
	
}
