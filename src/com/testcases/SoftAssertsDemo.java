package com.testcases;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import com.appcode.MethodClass;

public class SoftAssertsDemo {
  @Test
	public void test_sumIntegers() {
		System.out.println("\nRunning test > test_sumIntegers");
		SoftAssert sa = new SoftAssert();
		MethodClass obj = new MethodClass();
		int result = obj.sumOfIntegers(5, 8);
		int expectedResult = 13;
		sa.assertEquals(result, 11);
		System.out.println("\nLine after assert 1");
		sa.assertEquals(result, expectedResult);
		System.out.println("\nLine after assert 2");
		sa.assertAll();
}
}
