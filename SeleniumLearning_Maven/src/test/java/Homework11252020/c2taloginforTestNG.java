package Homework11252020;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class c2taloginforTestNG {
	WebDriver driver;
	
	@BeforeTest
	public void MultiTcs() {
	//public void LoginApp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://c2ta.co.in/home/");
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	}
	
	@Test(description ="c2ta login", priority=2)
	public void loginapp( ) {
		driver.findElement(By.xpath("//*[@id=\"masthead\"]/div[1]/div/div/div[2]/div/a[1]")).click();
		driver.findElement(By.id("username")).sendKeys("emani_sree");
		driver.findElement(By.id("password")).sendKeys("Myc2ta123@");
		driver.findElement(By.xpath("//*[@id=\"post-305\"]/div/div/div/div/div/form/p[2]/button")).click();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}
	
	@Test(description ="c2ta registration", priority=1)
	public void registerapp() {
		driver.findElement(By.xpath("//*[@id=\"masthead\"]/div[1]/div/div/div[2]/div/a[2]")).click();
		driver.findElement(By.id("reg_username")).sendKeys("emani.sree");
		driver.findElement(By.id("reg_email")).sendKeys("emani.sree@gmail.com");
		driver.findElement(By.id("reg_password")).sendKeys("Myc2tqa123@");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}
	
	@Test(description ="c2ta different tabs clicking", priority=3)
	public void topnavigation() {
		driver.findElement(By.xpath("//*[@id=\"menu-item-512\"]/a")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"menu-item-894\"]/a")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"menu-item-906\"]/a")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@AfterTest
	public void closeApp() {
		driver.close();
		
	}

}
