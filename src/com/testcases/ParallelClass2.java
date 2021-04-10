package com.testcases;

import org.testng.annotations.Test;

public class ParallelClass2 {

	@Test
	public void testMethod1() throws InterruptedException {
		System.out.println("ParallelClass2 -> testMethod1");
		Thread.sleep(6000);
		System.out.println("ParallelClass2 -> testMethod1 -> More Steps");
	}
	
	@Test
	public void testMethod2() throws InterruptedException {
		System.out.println("ParallelClass2 -> testMethod2");
		Thread.sleep(6000);
		System.out.println("ParallelClass2 -> testMethod2 -> More Steps");
	}

}