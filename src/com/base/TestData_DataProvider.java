package com.base;

import org.testng.annotations.DataProvider;

public class TestData_DataProvider {
	
	@DataProvider(name="inputs")
	public Object[][] getData() {
		return new Object[][] {
			{"bmw", "m3"},
			{"audi", "a6"},
			{"benz", "c300"}
		};
	}
}
