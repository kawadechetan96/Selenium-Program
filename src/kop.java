import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class kop {

	
	
	
	public static void main(String[] args) {
									
											System.setProperty("webdriver.chrome.driver", "E:\\SetUp\\Selenium\\Driver's\\chromedriver94\\chromedriver.exe");
											
											WebDriver driver =new ChromeDriver();
											driver.get("https://kolhapur.gov.in/en/std-pin-codes/");
											List<WebElement> li=driver.findElements(By.xpath("//div[@class='wpb_wrapper']//table//tr//td"));
											int listsize=li.size();
											System.out.println(listsize);
											for(int i=0; i<listsize; i++)
											{
										
											System.out.println(li.get(i).getText());
											}
}
	
}
