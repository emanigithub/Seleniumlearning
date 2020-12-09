package com.testCases;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.baseClasses.Library;
import com.pages.OrangeHrmLoginPage;
import com.reusableFunctions.SeleniumUtilities;

public class OrangeHRMLoginTest extends Library{

	@BeforeTest
	public void stratUp() {
		//launchApplication("chrome","https://opensource-demo.orangehrmlive.com/");
		//launchApplication("firefox","https://opensource-demo.orangehrmlive.com/");
		//launchApplication("Edge","https://opensource-demo.orangehrmlive.com/");
		
	}
	@Test
	public void login() {
		OrangeHrmLoginPage lpage = new OrangeHrmLoginPage(driver);
		lpage.loginToApp_username("Admin");
		lpage.loginToApp_password("admin123");
		lpage.loginToApp_loginbutton();
		
	}
	@AfterTest
	public void close() throws IOException {
		SeleniumUtilities selUtil = new SeleniumUtilities(driver);
		selUtil.to_take_screenshot("src/test/resources/Screenshots/OrangeHRMlogin.png");
		//quit();
		
	}

}
