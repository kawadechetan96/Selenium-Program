package com.dyanamicwebtable;

import java.util.*;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dyanamicwebtable {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:/SetUp/Selenium/Driver's/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("http://seleniumpractise.blogspot.com/");
		
		
		System.out.println("--------------------For Header----------------");
		List<WebElement> allheaders=driver.findElements(By.xpath("//table[@name='cust_123']//th"));            //to get allheaders
		
		System.out.println("Total headers is:-"+allheaders.size());
		
		for(WebElement ele : allheaders)
		{
			System.out.println(ele.getText());
			
		}
		
		System.out.println("--------------------For Get all Data----------------");
		List<WebElement> Data=driver.findElements(By.xpath("//table[@name='cust_123']//td"));
		System.out.println("Total Data is:-"+Data.size());
		
		for(WebElement data : Data)
		{
			System.out.println(data.getText());
		}
	
		
		System.out.println("--------------------For Finding  Data----------------");
		List<WebElement> Data1=driver.findElements(By.xpath("//table[@name='cust_123']//td"));
		System.out.println("Total Data is:-"+Data1.size());
		boolean flag=false;
		for(WebElement data : Data1)
		{
			String value=data.getText();
			if(value.contains("Ola"));
			{
				System.out.println("Record is  Avaiable");
				flag=true;
				break;
			}

		}

		driver.close();
	}

}
