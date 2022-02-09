package com.alertpopupwindow;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertpopupwindow {

	public static void main(String[] args) throws Exception {
		
		
		System.setProperty("webdriver.chrome.driver", "E:/SetUp/Selenium/Driver's/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("https://ksrtc.in/oprs-web/");
		
		WebElement search=driver.findElement(By.xpath("//button[contains(text(), 'Search for Bus')]"));
		search.click();
		//Thread.sleep(2000);
		Alert al=driver.switchTo().alert();       //alert is interface to assign reference of driver object 
		al.accept();
		al.dismiss();
		driver.close();
		
		
		
	
	}

}
