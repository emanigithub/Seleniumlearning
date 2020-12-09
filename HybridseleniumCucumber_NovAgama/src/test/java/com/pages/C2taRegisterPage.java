package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class C2taRegisterPage {

	WebDriver driver;
	By username = By.id("reg_username");
	By email = By.id("reg_email");
	By password = By.id("reg_password");
	By registerbutton = By.xpath("//*[@id=\"post-306\"]/div/div/div/div/div/form/p/button");

	public C2taRegisterPage(WebDriver driver) {
		this.driver = driver;

	}

	public void registerToApp_username(String userid) {
		driver.findElement(username).sendKeys(userid);
	}

	public void registerToApp_email(String emailid) {
		driver.findElement(email).sendKeys(emailid);
	}

	public void registerToApp_password(String pass) {
		driver.findElement(password).sendKeys(pass);
	}

	public void registerToApp_register(){
		driver.findElement(registerbutton).click();
	}

}
