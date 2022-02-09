package com.datepickergenricmethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class Datepickergenricmethod {
	public static WebDriver driver;
	public static void main(String[] args) throws Exception {
	
		System.setProperty("webdriver.chrome.driver", "E:/SetUp/Selenium/Driver's/chromedriver_win32/chromedriver.exe");
       driver=new ChromeDriver();
		 
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 driver.manage().window().maximize();
		 
		 driver.get("https://www.redbus.in/");
		 driver.findElement(By.xpath("//input[@id='onward_cal']"));
		 setdate("10", "May", "2022");
		
	}
	public static String[] getspiltdate(String datevalue)
	{
		return datevalue.split(" ");
	}
	 public static void setdate(String exday, String exmonth, String exyear) throws Exception
	 {
		 String datevalue=driver.findElement(By.xpath("//td[@class='monthTitle']")).getText();
		 
		 while(!(getspiltdate(datevalue)[0].equals(exmonth) && (getspiltdate(datevalue)[1].equals(exyear))))
				 {
			
			 	driver.findElement(By.xpath("//td[@class='next']")).click();
				
			 	datevalue=driver.findElement(By.xpath("//td[@class='monthTitle']")).getText();
				
				 }
		 		driver.findElement(By.xpath(" //td[text()="+exday+"]")).click();
		 		Thread.sleep(3000);
		 		driver.close();
	 }
}
