package com.TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DeppendsOnMethods {

	 @Test
	  public void tc001() {
		  System.out.println("Test Case 001");
	  }
	  @Test(dependsOnMethods ="tc001")
	  public void tc002() {
		  System.out.println("Test Case 002");
		  Assert.assertEquals("abc", "xyz");
	  }
	  
	  @Test(dependsOnMethods ="tc002",alwaysRun=true)
	  public void tc003() {
		  System.out.println("Test Case 003");
		 
	  }
}
