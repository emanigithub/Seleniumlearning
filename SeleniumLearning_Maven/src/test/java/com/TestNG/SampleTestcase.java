package com.TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class SampleTestcase {
  @Test
  public void tc001() {
	  System.out.println();
  }
  @Test
  public void tc002() {
	  System.out.println();
  }
  @Test
  public void tc003() {
	  System.out.println();
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Before method : login");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("After method : close App");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("Before class : Prepare test data");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("After class : clear test data");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("Before Test : Open db connection");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("After Test : Close db connection");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("Before Suite : Smoke testing");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("After Suite : Generating Report");
  }

}
