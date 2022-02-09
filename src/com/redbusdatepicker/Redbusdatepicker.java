package com.redbusdatepicker;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Redbusdatepicker {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "E:\\SetUp\\Selenium\\Driver's\\chromedriver94\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.redbus.in/");
		driver.findElement(By.xpath("//input[@id='onward_cal']")).click();
		
		String date=driver.findElement(By.xpath("//td[@class='monthTitle']")).getText();
		String month=date.split(" ")[0];
		String year=date.split(" ")[1];
	
		
		while(!(month.equals("Mar") && year.equals("2023")))
		{
			driver.findElement(By.xpath("//td[@class='next']")).click();
			
			date=driver.findElement(By.xpath("//td[@class='monthTitle']")).getText();
			System.out.println(date);
			 month=date.split(" ")[0];
			 year=date.split(" ")[1];
			
		}
			driver.findElement(By.xpath(" //td[text()='25']")).click();
			driver.close();
	}

}
