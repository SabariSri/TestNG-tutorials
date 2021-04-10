package com.testcases;

import org.testng.annotations.Test;
import com.base.TestData_DataProvider;

public class DataProvidersDemo {

//	@DataProvider(name="inputs")
//	public Object[][] getData() {
//		return new Object[][] {
//			{"bmw", "m3"},
//			{"audi", "a6"},
//			{"benz", "c300"}
//		};
//	}
	
	@Test(dataProvider="inputs",dataProviderClass=TestData_DataProvider.class)
	public void testMethod1(String input1, String input2) {
		System.out.println("Input 1: " + input1);
		System.out.println("Input 2: " + input2);
	}
}