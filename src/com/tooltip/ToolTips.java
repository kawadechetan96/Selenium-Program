package com.tooltip;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToolTips {
	
	
	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "E:/SetUp/Selenium/Driver's/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		/*driver.get("https://demoqa.com/tool-tips");
		driver.findElement(By.cssSelector(".btn.btn-success")).click();
		String tooltips=driver.findElement(By.cssSelector(".tooltip-inner")).getText();
		System.out.println(tooltips);*/
		
		driver.get("https://demoqa.com/books");
		driver.findElement(By.cssSelector(".form-control")).sendKeys("git");
		//driver.findElement(By.xpath("//div[@class='auto-complete__menu css-26l3qy-menu']//descendant::div[@id='react-select-2-option-1']")).click();
	}
}
