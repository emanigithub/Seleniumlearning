package com.TestNG;

import org.testng.annotations.Test;

public class DependsOnGroups {
	 @Test(groups = {"Smoke Testing","Regression Tesing"})
	  public void tc001() {
		  System.out.println("Test Case 001");
	  }
	  @Test(groups = {"Smoke Testing","Sanity Tesing"})
	  public void tc002() {
		  System.out.println("Test Case 002");
	  }
	  @Test(groups = {"Functional Testing","ReTesing"})
	  public void tc003() {
		  System.out.println("Test Case 003");
	  }
	  
	 }
