package Homework11202020;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class c2taRegister {

	public static void main(String[] args) {
		// Registering to https://c2ta.co.in Site
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.get("https://c2ta.co.in/register/");
		

	}

}
