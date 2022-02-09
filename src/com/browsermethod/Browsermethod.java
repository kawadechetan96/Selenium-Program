package com.browsermethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browsermethod {

	public static void main(String[] args) {
	
		
		System.setProperty("webdriver.chrome.driver", "E:/SetUp/Selenium/Driver's/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com");       // open specified url in browser window
		String title=driver.getTitle();                       // return title of browser
		System.out.println("Title is:-"+title);
		
		String url=driver.getCurrentUrl();              //return current url of browser
		System.out.println("Current URL:-"+url);
		
/*		String pagesource=driver.getPageSource();  //return html page source
		System.out.println("HTML page source:-"+pagesource);
		
		/* Browser Nevigation method */
		
		driver.navigate().to("https://www.yahoo.com");
		System.out.println("Current URL:-"+driver.getCurrentUrl());
		
		driver.navigate().back();
		System.out.println("Current URL:-"+driver.getCurrentUrl());
		
		driver.navigate().forward();
		System.out.println("Current URL:-"+driver.getCurrentUrl());
		
		driver.navigate().refresh();
		
		driver.close();
	}

}
