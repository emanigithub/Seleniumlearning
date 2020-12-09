package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.baseClasses.Library;

public class OrangeHrmLoginPage extends Library{
	WebDriver driver;
	By username=By.id("txtUsername");
	By password=By.id("txtPassword");
	By loginbutton=By.id("btnLogin");
	//By loginbutton=By.xpath("//*[@id=\"u_0_b\"]");
	
	public OrangeHrmLoginPage(WebDriver driver) {
		this.driver=driver;
		
	}
	public void loginToApp_username(String userid) {
		driver.findElement(username).sendKeys(userid);
	}
	public void loginToApp_password(String pass) {
		driver.findElement(password).sendKeys(pass);
	}
	public void loginToApp_loginbutton() {
		driver.findElement(loginbutton).click();
	}

}
