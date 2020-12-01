package com.TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClickAndHold {
	@Test(description= "Selecting more than one item")
	public void actionOn() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/selectable/");
		JavascriptExecutor js = (JavascriptExecutor)driver; //need to use this java script due to 
		js.executeScript("window.scrollBy(0,1600)");        // due to some compatibility issue 
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		WebElement item1 = driver.findElement(By.xpath("//*[@id=\"selectable\"]/li[1]"));
		//WebElement item2 = driver.findElement(By.xpath("//*[@id=\"selectable\"]/li[2]"));
		//WebElement item3 = driver.findElement(By.xpath("//*[@id=\"selectable\"]/li[3]"));
		WebElement item4 = driver.findElement(By.xpath("//*[@id=\"selectable\"]/li[4]"));
		Actions actions = new Actions(driver);
		actions.clickAndHold(item1).clickAndHold(item4).build().perform();
}
}
