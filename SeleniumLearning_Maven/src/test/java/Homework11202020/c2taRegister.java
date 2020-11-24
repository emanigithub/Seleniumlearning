package Homework11202020;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class c2taRegister {

	public static void main(String[] args) {
		// Registering to https://c2ta.co.in Site ..... Do not Register Again
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.get("https://c2ta.co.in/register/");
		driver.findElement(By.id("reg_username")).sendKeys("emani_sree");
		driver.findElement(By.id("reg_email")).sendKeys("emani_sree@yahoo.com");
		driver.findElement(By.id("reg_password")).sendKeys("Myc2ta123@");	
		driver.findElement(By.xpath("//*[@id=\"post-306\"]/div/div/div/div/div/form/p/button")).click();

	}

}
