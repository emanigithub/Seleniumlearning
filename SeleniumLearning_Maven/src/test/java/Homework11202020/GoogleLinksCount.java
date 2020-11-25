package Homework11202020;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleLinksCount {

	public static void main(String[] args) {
		// Google Page links count by typing the search key as "testing"
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/"); 
		driver.findElement(By.name("q")).sendKeys("testing" + "\n");
		List<WebElement> links = driver.findElements(By.tagName("a"));		
		System.out.println("Total number of links are = " + links.size());
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
		driver.close();

		
	
	}

}
