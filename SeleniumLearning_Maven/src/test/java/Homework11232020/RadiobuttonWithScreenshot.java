package Homework11232020;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RadiobuttonWithScreenshot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://c2ta.co.in/");
		driver.findElement(By.xpath("//*[@id=\"masthead\"]/div[1]/div/div/div[2]/div/a[1]")).click();
		driver.findElement(By.id("username")).sendKeys("emani_sree");
		driver.findElement(By.id("password")).sendKeys("Myc2ta123@");
		driver.findElement(By.xpath("//*[@id=\"post-305\"]/div/div/div/div/div/form/p[1]/label/input")).click();
		driver.findElement(By.xpath("//*[@id=\"post-305\"]/div/div/div/div/div/form/p[2]/button")).click();
		driver.findElement(By.xpath("//*[@id=\"menu-item-995\"]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"post-1398\"]/div/div[2]/h2/a")).click();
		driver.findElement(By.xpath("//*[@id=\"section-form-input-type-learning-37\"]/ul/li[1]/a/span")).click();
		driver.findElement(By.name("radioButton")).click();	
		TakesScreenshot ts = (TakesScreenshot)driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(source,new File(("src/test/resources/Screenshot/radiobutton.png")));
		
	}

}
