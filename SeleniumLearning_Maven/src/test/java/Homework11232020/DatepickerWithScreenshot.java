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

public class DatepickerWithScreenshot {

	public static void main(String[] args) throws IOException {
		// Datepicker with Screenshot save
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.redbus.com/");
		driver.findElement(By.xpath("//*[@id=\"search\"]/div/div[3]/div/label")).click();
		driver.findElement(By.xpath("//*[@id=\"rb-calendar_onward_cal\"]/table/tbody/tr[8]/td[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"search\"]/div/div[4]/div/label")).click();
		driver.findElement(By.xpath("//*[@id=\"rb-calendar_return_cal\"]/table/tbody/tr[1]/td[3]/button")).click();
		driver.findElement(By.xpath("//*[@id=\"rb-calendar_return_cal\"]/table/tbody/tr[7]/td[4]")).click();
		TakesScreenshot ts = (TakesScreenshot)driver;
			File source = ts.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(source,new File("src/test/resources/Screenshot/datepicker.png"));
		
	}

}
