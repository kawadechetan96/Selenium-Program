package com.texttbox;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Textbox {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "E:\\SetUp\\Selenium\\Driver's\\chromedriver94\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		
		WebElement text=driver.findElement(By.xpath("//input[@name='q']"));
		
		text.sendKeys("Youtube");
		
		String t=text.getText();
		System.out.println("Text is:-"+t);
		
		text.clear();
		
		boolean dis=text.isDisplayed();
		System.out.println(dis);
		
		boolean enable=text.isEnabled();
		System.out.println(enable);
		driver.close();
		
		
	}

}
