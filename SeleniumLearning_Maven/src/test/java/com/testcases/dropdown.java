package com.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dropdown {

	public static void main(String[] args) {
	// Drop down-Multiple values selection
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://output.jsbin.com/osebed/2");
		
		WebElement fruits = driver.findElement(By.id("fruits"));
		Select obj = new Select(fruits);
	// Drop down-Multiple values selection with Value option
		obj.selectByValue("banana");
		obj.selectByValue("orange");
	// Drop down- Selection by visible text option
		obj.selectByVisibleText("Grape");

	}

}
