package com.sibling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sibling {

	 public static void main(String[] args) throws Exception {
		 
		 
		 System.setProperty("webdriver.chrome.driver", "E:\\SetUp\\Selenium\\Driver's\\chromedriver94\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("http://seleniumpractise.blogspot.com/");
		 System.out.println("-----for preceding sibling---------");
		 driver.findElement(By.xpath("//table[@name='cust_123']//td[text()='Jenkins']//preceding-sibling::td//input[@type='checkbox']")).click();
		 Thread.sleep(3000);
		 
		 System.out.println("-------for following sibling--------");
		 driver.findElement(By.xpath("//table[@name='cust_123']//td[text()='Jenkins']//following-sibling::td//a[text()='Know More']")).click();
		 Thread.sleep(3000);
		 driver.close();
	 }
}
