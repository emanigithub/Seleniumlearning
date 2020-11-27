  /* * 1.Launch the website - https://www.flipkart.com/ 2.Search any product and
	 * put implicit wait 3.Add the product to the cart 4.Assert the product name
	 * 5.Assert the product price 6.Close the browser  */

package com.TestNG;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FlipkartSearchProduct {
	WebDriver driver;
	@BeforeTest
	public void LaunchApp() {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("https://www.flipkart.com/");
	driver.findElement(By.xpath("/html/body/div[2]/div/div/button")).click(); //closing popup window
	}

	@Test(priority=1)
	public void verifyTitle() {
		String expectedTitle = "Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);				
	}
	
	/*@Test(priority=2) //Different way
	public void search() {
		driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[2]/form/div/div/input")).sendKeys("Laptops");
		driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[2]/form/div/button")).click();
	}*/
	
	@Test(priority=2)
	public void search( ) throws InterruptedException {
		WebElement ele = driver.findElement(By.name("q")); //Storing the element
		ele.sendKeys("laptops");
		Thread.sleep(2000);
		ele.submit();
	}
	
	@Test(priority=3)
	public void selectProduct() {
	Actions action = new Actions(driver);
	action.click(driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[2]/div[1]/div[2]/div[2]/div/div/div/a/div[2]/div[1]/div[1]"))).build().perform();
		//driver.findElement(By.xpath(xpathExpression))
	}
		
	@Test(priority=4)
	public void addProduct() throws InterruptedException {
	Set<String> windows = driver.getWindowHandles();
	Iterator<String> it = windows.iterator();
	String parent = it.next();  // Storing the Parent Window
	String child = it.next();   // Storing the Parent Window
	driver.switchTo().window(child); // Switching to Child Window 
	Thread.sleep(1000);
	driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[1]/div[2]/div/ul/li[1]/button")).click();
	
	}
	
	@Test(priority=5)
		
	public void assertProduct() {
	String actualProduct=driver.findElement(By.partialLinkText("MSI GP65 Leopard Core i7 10th")).getText();
	System.out.println(actualProduct);	
	String expectedProduct="MSI GP65 Leopard Core i7 10th Gen - (32 GB/1 TB HDD/512 GB SSD/Wi...";
	Assert.assertEquals(actualProduct, expectedProduct); // Comparing the product
	}
	
	@Test(priority=6)
	public void assertPrice() throws InterruptedException {
	String actualprice=driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[2]/div[2]/div/div[3]/div[1]/div/div[1]")).getText();
	Thread.sleep(3000);
	System.out.println(actualprice);
	String expectedPrice = "₹1,49,990";
	Assert.assertEquals(actualprice, expectedPrice);
	
	}
	
	@AfterTest
	public void tearDown() {
		driver.close();
		driver.quit();
	}
	
	
}
