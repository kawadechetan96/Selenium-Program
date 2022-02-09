package com.readproperty;

import java.io.File;
import java.io.FileInputStream;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Readproperty {

	public static void main(String[] args) throws Exception {
		
		
		File source=new File("E:/Selenium Program/Selenium/src/com/config/config.property");
		FileInputStream fis=new FileInputStream(source);
		Properties pro=new Properties();
		pro.load(fis);
		System.setProperty("webdriver.chrome.driver", "E:\\SetUp\\Selenium\\Driver's\\chromedriver94\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get(pro.getProperty("url"));
		driver.close();
		
	}

}
