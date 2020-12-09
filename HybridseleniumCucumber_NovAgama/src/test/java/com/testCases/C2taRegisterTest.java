package com.testCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.baseClasses.Library;
import com.pages.C2taRegisterPage;
import com.pages.FacebookLoginPage;
import com.reusableFunctions.SeleniumUtilities;

public class C2taRegisterTest extends Library {
	
	@BeforeTest
	public void stratUp() {
		//launchApplication("chrome","https://c2ta.co.in/register/");
		
	}
	
	@Test
	public void register() {
		C2taRegisterPage rpage = new C2taRegisterPage(driver);
		rpage.registerToApp_username("ABCD");
		rpage.registerToApp_email("abc@xyz.com");
		rpage.registerToApp_password("Test12345678@");
		rpage.registerToApp_register();
				
	}
	
	@AfterTest
	public void close() throws IOException {
		SeleniumUtilities selUtil = new SeleniumUtilities(driver);
		selUtil.to_take_screenshot("src/test/resources/Screenshots/c2taregister.png");
		//quit();
		
	}

}
