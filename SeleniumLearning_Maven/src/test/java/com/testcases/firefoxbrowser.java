package com.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class firefoxbrowser {

	public static void main(String[] args) {
		//FirefoxBrowser setup in Webdriver under Maven project 11/23/2020
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.eenadu.net/");
		String title = driver.getTitle();
		System.out.println(title);

	}

}
