package com.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {
	// Different type of Alert or window boxes
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
	//Accepting the Alert box//
		driver.findElement(By.xpath("//*[@id=\'easycont\']/div/div[2]/div[1]/div[2]/button")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
	//Confirming the Alert box (Cancel)
		driver.findElement(By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[2]/div[2]/button")).click();
		driver.switchTo().alert().dismiss();
	//Entering some text in the Alert box and accepting//
		driver.findElement(By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[3]/div[2]/button")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().sendKeys("Srinivasa................");
		Thread.sleep(2000);
		String errormessage = driver.switchTo().alert().getText();
		System.out.println(errormessage);
		driver.switchTo().alert().accept();
	}

}
