package com.testCases;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.baseClasses.Library;
import com.pages.FacebookLoginPage;
import com.reusableFunctions.SeleniumUtilities;

public class FacebookLoginTest extends Library {
	@BeforeTest
	public void stratUp() {
		browserSetUp();
		logger.info("********Browser has been launched******");
		//launchApplication("chrome","https://facebook.com");
		
	}
	@Test
	public void login() {
		//FacebookLoginPage lpage = new FacebookLoginPage(driver);
		FacebookLoginPage lpage=new FacebookLoginPage(driver);
		lpage.loginToApp_username(properties.getProperty("username"));
		lpage.loginToApp_password(properties.getProperty("password"));
		lpage.loginToApp_loginbutton();
		logger.info("**Login Successful****");
				
		
	}
	@AfterTest
	public void close() throws IOException {
		SeleniumUtilities selUtil = new SeleniumUtilities(driver);
		selUtil.to_take_screenshot("src/test/resources/Screenshots/facebooklogin.png");
		logger.info("**Took Screenshot****");
		
	}

}
