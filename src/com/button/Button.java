package com.button;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Button {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:/SetUp/Selenium/Driver's/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		
		//driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]")).click();;
		driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("kolhapur");
		
		driver.findElement(By.xpath("//input[@class='gNO89b']")).click();
		
		driver.get("https://www.eventbrite.com/signin/?referrer=%2F");
		String title =driver.getTitle();
		System.out.println(title);
		
		driver.navigate().to("https://www.google.com/");
		WebElement clickOnImage=driver.findElement(By.xpath("//a[text()='Images']"));
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", clickOnImage);
		
		String text=js.executeScript("return document.documentElement.innerText;").toString();
		System.out.println(text);
		
		
	}

}
