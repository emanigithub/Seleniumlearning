package com.TestNG;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeyBoardHandling {
	WebDriver driver;
	
	@BeforeTest
	public void  lauchApp() {
		
		WebDriverManager.chromedriver().setup();
		driver =  new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
	}
		
	@Test(description ="login to Orange HRM by sending the Key board keys",priority=1)
	public void loginapp() throws InterruptedException {
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		Actions action = new Actions(driver);
		Thread.sleep(3000);
		action.sendKeys(Keys.TAB).perform();
		Thread.sleep(3000);
		action.sendKeys("admin123").perform();
		Thread.sleep(3000);
		action.sendKeys(Keys.TAB).perform();
		Thread.sleep(3000);
		action.sendKeys(Keys.ENTER).perform();
				
	}
	
	@Test(description ="login to Red bus and selecting the list FROM test box", priority=2) //Selecting from the Text box list, 
	public void listDisplay() {
		
		driver.navigate().to("https://www.redbus.in/");
		driver.findElement(By.id("src")).sendKeys("c");
		List<WebElement>list= driver.findElements(By.xpath("//*[@id=\"search\"]/div/div[1]/div/ul"));
		for(WebElement mylist:list) {
			System.out.println(mylist.getText());
		}	
	}

}

