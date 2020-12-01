package com.TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDrop {

	@Test
	public void actionOn() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		//driver.manage().window().maximize(); //Maximizing the browser getting error
		driver.get("https://jqueryui.com/droppable");
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		WebElement dragelement = driver.findElement(By.id("draggable"));
		WebElement dropelement = driver.findElement(By.id("droppable"));
		Thread.sleep(3000);
		Actions actions = new Actions(driver);
		actions.dragAndDrop(dragelement, dropelement).build().perform();
		
	} 
}
