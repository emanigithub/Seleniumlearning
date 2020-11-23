package com.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class edgebrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		String title=driver.getTitle();
		System.out.println(title);
		
	}

}
