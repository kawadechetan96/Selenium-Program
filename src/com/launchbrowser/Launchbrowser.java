package com.launchbrowser;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launchbrowser {

	public static void main(String[] args) throws Exception {
		
		
		System.setProperty("webdriver.chrome.driver", "E:/SetUp/Selenium/Driver's/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();  // webdriver is interface to create instance and assign chromedriver object
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com");
		
		Thread.sleep(1000);
		Point p=new Point(50,50);
		driver.manage().window().setPosition(p);
		
		driver.close();
		
	}

}
