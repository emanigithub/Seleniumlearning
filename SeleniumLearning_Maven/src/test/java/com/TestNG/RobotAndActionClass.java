package com.TestNG;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RobotAndActionClass {
	public static void main(String[] args) throws AWTException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.zillow.com/");
		Robot robot = new Robot();
		Actions actions = new Actions(driver);
		//Using Robot class
		
		  robot.keyPress(KeyEvent.VK_CONTROL); 
		  robot.keyPress(KeyEvent.VK_T);
		  robot.keyRelease(KeyEvent.VK_CONTROL); 
		  robot.keyRelease(KeyEvent.VK_T);
	}
}
