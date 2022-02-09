package com.searchgoogle;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class Searchgoogle {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "E:\\SetUp\\Selenium\\Driver's\\chromedriver94\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("https://msrtc.maharashtra.gov.in/");
		driver.findElement(By.xpath("//input[@class='journey ac_input']")).sendKeys("pune");
		
		
	}

}
