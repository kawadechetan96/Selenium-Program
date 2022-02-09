import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Irctc {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "E:\\SetUp\\Selenium\\Driver's\\chromedriver94\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.irctc.co.in/nget/train-search");
		
		
		driver.findElement(By.cssSelector(".ng-tns-c58-9")).click();
		
	List<WebElement> ele=	driver.findElements(By.xpath("//ul[@role='listbox']//li[@role='option']"));
	
	//int list=ele.size();
	for(WebElement ele1: ele)
	{
		String all=ele1.getText();
		System.out.println(all);
	}
	driver.findElement(By.cssSelector(".ng-tns-c66-11")).click();

	List<WebElement> ele1=	driver.findElements(By.xpath("//ul[@role='listbox']//descendant::li"));
	for(WebElement ele2: ele1)
	{
		String all1=ele2.getText();
		System.out.println(all1);
	}
	
	}

}
