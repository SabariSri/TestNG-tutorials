package com.testcases;

import org.testng.annotations.Test;
import com.appcode.MethodClass;

public class AnnotationsDemo {
	
	@Test
	public void testMethod1() {
		MethodClass obj = new MethodClass();
		int result = obj.sumOfIntegers(5, 8);
		System.out.println("Running > Test Method 1");
	}
	
	@Test
	public void testMethod2() {
		System.out.println("Running > Test Method 2");
	}
	
	@Test
	public void testMethod3() {
		System.out.println("Running > Test Method 3");
	}
}
