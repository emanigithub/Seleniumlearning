package com.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class locators {

	public static void main(String[] args) {
		// Different locators setup in WebDriver under Maven project.
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		// Using the Xpath locator....
		//driver.findElement(By.xpath("//*[@id=\"btnLogin\"]")).click();
		
		// Using the LinkText locator....
		driver.findElement(By.linkText("Forgot your password?")).click();
		
		// Using the Partial LinkText locator....
		//driver.findElement(By.partialLinkText("Forgot your")).click();
	}

}
