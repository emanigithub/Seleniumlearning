package com.TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseHandling {

	WebDriver driver;
	
	@BeforeTest
	public void LoginApp() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/");
	}
	
	@Test(description ="login to Orange HRM") //Mouse clicking particular selection,
	public void loginapp() {
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		driver.findElement(By.xpath("//*[@id=\'menu_admin_viewAdminModule\']/b")).click();
		Actions actions = new Actions(driver);
		WebElement job = driver.findElement(By.id("menu_admin_Job"));
		WebElement payGrade =driver.findElement(By.id("menu_admin_viewPayGrades"));
		actions.moveToElement(job).moveToElement(payGrade).click().build().perform();
	
	}
}
