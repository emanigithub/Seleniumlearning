package com.TestNG;

import org.testng.annotations.Test;

public class PriorityTestCases {
	@Test(priority =2)
	public void tc001() {
		  System.out.println("Test Case 1: This is Priority 1");
	}
	@Test(priority =3)
	public void tc002() {
		  System.out.println("Test Case 2: This is Priority 2");
	}
	@Test(priority =1)
	public void tc003() {
		  System.out.println("Test Case 3: This is Priority 3");
	}
}
