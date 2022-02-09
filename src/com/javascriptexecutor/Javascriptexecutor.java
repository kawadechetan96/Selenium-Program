package com.javascriptexecutor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javascriptexecutor {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:/SetUp/Selenium/Driver's/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com/");
		/*driver.findElement(By.cssSelector("#email")).sendKeys("chetankavade@gmail.com");
		driver.findElement(By.cssSelector("#pass")).sendKeys("123");
		driver.findElement(By.cssSelector("._42ft._4jy0._6lth._4jy6._4jy1.selected._51sy")).click();*/
		WebElement login=driver.findElement(By.xpath("//button[@type='submit']"));
		WebElement email=driver.findElement(By.cssSelector("#email"));
		WebElement createpage=driver.findElement(By.cssSelector("ul.uiList.localeSelectorList._2pid._509-._4ki._6-h._6-j._6-i>li:first-of-type"));
		
		//highlight the element
		flash(login,driver); 		
		
		//draw border
		drawBorder(login,driver);    
		
		//generate alert
		generateAlert("Thers is issue with login button", driver);   
		
		//click on element using JS
		clickElementByJS(login,driver);      
		
		//send data using JS
		sendValueByJS(email,driver);
		
		//refershbrowser using JS
		refershBrowserByJS(driver);		
		
		//Get Title using JS
		System.out.println(getTitleByJS(driver));    
		
		//Get All Text into Webpage using JS
		System.out.println(getPageInnerText(driver));   
		
		//Scroll down
		scrollPageDown(driver);
		
		//Scroll particular element
		scrollIntoView(createpage,driver);
		}
	
	/******************************HighLight Element*******************************/
	
	public static void flash(WebElement element ,WebDriver driver){
		String bgcolor=element.getCssValue("backgroundColor");
					for(int i=0; i<20; i++){
						changeColor("rgb(0,200,0)",element, driver);
						changeColor(bgcolor,element, driver);
					}
		}
	
	public static void changeColor(String color, WebElement element, WebDriver driver){
		JavascriptExecutor js=((JavascriptExecutor)driver);
		js.executeScript("arguments[0].style.backgroundColor =' "+ color +" ' ", element);
		
		try{
			Thread.sleep(20);
		}catch(Exception e){}
	}
	
/*********************************Highlight Border*********************************/

	public static void drawBorder(WebElement element, WebDriver driver){
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].style.border=' 3px solid red' ", element);		
	}
	
/*********************************Generate Alert************************************/	
	
	public static void generateAlert(String message, WebDriver driver){
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("alert(' "+message+" ');");
	}

/********************************Click on Element************************************/
	
	public static void clickElementByJS(WebElement element, WebDriver driver){
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();",element);
	}
	
/*********************************Send value**************************************/
	
	public static void sendValueByJS(WebElement element, WebDriver driver){
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].value='chetankavade' ",element);
	}
	
/***************************************Refresh browser***************************/	
	
	public static void refershBrowserByJS(WebDriver driver){
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("history.go(0)");
	}
	
/**************************************GetTitle***********************************/
	
	public static String getTitleByJS(WebDriver driver){
		JavascriptExecutor js=(JavascriptExecutor)driver;
		String title =js.executeScript("return document.title;").toString();
		return title;
	}
/*****************************************Get All Text In Page ***********************/	
	
	public static String getPageInnerText(WebDriver driver){
		JavascriptExecutor js=(JavascriptExecutor)driver;
		String pagetext=js.executeScript("return document.documentElement.innerText;").toString();
		return pagetext;
	}
/*****************************************Scroll Page Down**************************/	
	public static void scrollPageDown(WebDriver driver){
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");	
	}
/****************************************Scroll to particular element*******************/	
	public static void scrollIntoView(WebElement element, WebDriver driver){
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true);",element);	
	}
	
}
