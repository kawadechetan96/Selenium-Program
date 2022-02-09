package com.amazon.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
	
	public static void main(String args[])
	{
		System.setProperty("webdriver.chrome.driver", "E:/SetUp/Selenium/Driver's/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.cssSelector("i.hm-icon.nav-sprite")).click();
		driver.findElement(By.cssSelector("a.hmenu-item[data-menu-id='2']")).click();
		driver.findElement(By.cssSelector("ul.hmenu.hmenu-visible.hmenu-translateX>li:nth-of-type(4)")).click();
	}
	
	
	
	
	

}
