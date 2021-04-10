package com.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.appcode.MethodClass;

public class AssertsDemo {
	@Test
	public void test_sumIntegers() {
		System.out.println("\nRunning test > test_sumIntegers");
		MethodClass obj = new MethodClass();
		int result = obj.sumOfIntegers(5, 8);
		int expectedResult = 13;
		Assert.assertEquals(result, expectedResult);
	}
	
	@Test
	public void test_sumStrings() {
		System.out.println("\nRunning test > test_sumStrings");
		String a = "Hello";
		String b = "World";
		String expectedString = "Hello World";
		MethodClass obj = new MethodClass();
		String result = obj.sumOfStrings(a, b);
		Assert.assertEquals(result, expectedString);
	}
	
	@Test
	public void test_arrayExample() {
		System.out.println("\nRunning test > test_arrayExample");
		int[] expectedArray = {1, 2, 3, 4};
		MethodClass obj = new MethodClass();
		int[] result = obj.getArray();
		Assert.assertEquals(result, expectedArray);
	}
}
