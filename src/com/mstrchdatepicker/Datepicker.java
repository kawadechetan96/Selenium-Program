package com.mstrchdatepicker;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Datepicker {

	public static void main(String[] args) {
		  System.setProperty("webdriver.chrome.driver", "E:\\SetUp\\Selenium\\Driver's\\chromedriver94\\chromedriver.exe");
		  
		  WebDriver driver =new ChromeDriver();
		  
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  driver.manage().window().maximize();
		  
		  driver.get("https://msrtc.maharashtra.gov.in/");
		  
		  driver.findElement(By.xpath("//input[@name='journeydate']")).click();
		  
		  Select sel1=new Select(driver.findElement(By.xpath("//select[@class='datepick-new-month']")));
		  sel1.selectByIndex(7);
		  
		  Select sel2=new Select(driver.findElement(By.xpath("//select[@class='datepick-new-year']")));
		  sel2.selectByValue("2027");
		  
		  String date="32-August-2027";
		  String day=date.split("-")[0];
		  String month=date.split("-")[1];
		  String year=date.split("-")[2];
	
		  //	  /html[1]/body[1]/div[2]/div[3]/table[1]/tbody[1]/tr[4]/td[6]
		  // /html[1]/body[1]/div[2]/div[3]/table[1]/tbody[1]/tr[1]/td[1]
		  String beforexpath="/html[1]/body[1]/div[2]/div[3]/table[1]/tbody[1]/tr[";
		  String afterxpath="]/td[";
		  boolean flag=false;
		  final int week=7;
		  String datevalue=null;
		  for(int row=1; row<=6; row++)
		  {
			  for(int column=1; column<=week; column++)
			  {
				  
				  try{
				      datevalue=driver.findElement(By.xpath(beforexpath+row+afterxpath+column+"]")).getText();
				  }catch(Exception e)
				  {
					  System.out.println("Enter correct day");
					  flag=false;
					   break;
				  }
				  System.out.println(datevalue);
				 if(datevalue.equals(day))
				  {
					  driver.findElement(By.xpath(beforexpath+row+afterxpath+column+"]")).click();
					  flag=true;
					  break;
				  }
			  }
			  if(flag)
			  {
				  break;
			  }
		  }
		  driver.close();
	}

}
