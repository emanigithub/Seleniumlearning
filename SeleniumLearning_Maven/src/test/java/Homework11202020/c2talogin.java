package Homework11202020;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class c2talogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://c2ta.co.in/login/");
		driver.findElement(By.id("Username or email")).sendKeys("emani_sree");
		driver.findElement(By.id("Password")).sendKeys("Myc2ta1");
		driver.findElement(By.xpath("//*[@id=\"post-305\"]/div/div/div/div/div/form/p[2]/button")).click();
	}

}
