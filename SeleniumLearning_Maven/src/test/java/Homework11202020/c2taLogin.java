package Homework11202020;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class c2taLogin {

	public static void main(String[] args) {
		// Login And Logout to https://c2ta.co.in Site after Registration.
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://c2ta.co.in/login/");
		driver.findElement(By.id("username")).sendKeys("emani_sree");
		driver.findElement(By.id("password")).sendKeys("Myc2ta123@");
		driver.findElement(By.xpath("//*[@id=\"post-305\"]/div/div/div/div/div/form/p[2]/button")).click();
		driver.findElement(By.xpath("//*[@id=\"masthead\"]/div[1]/div/div/div[2]/div/a[1]")).click();
	}

}
