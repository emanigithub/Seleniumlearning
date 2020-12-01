package com.TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUpload {
	
	@Test
	public void upload() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://filebin.net/");
		driver.findElement(By.xpath("//*[@id=\"fileField\"]")).sendKeys("C:\\Users\\emani\\Desktop\\Fileupload.txt");
					
	}
	

}
