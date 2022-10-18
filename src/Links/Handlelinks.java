package Links;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handlelinks {

	public static void main (String [] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com/");
		
	//	driver.findElement(By.xpath("(//a[contains(text(),\"Best Sellers\")])[1]")).click();
		
		//Print the No of Link Present in the webpage
		List<WebElement> Link1 = driver.findElements(By.tagName("a"));
	  System.out.println(Link1.size());
	 
	  
	  // Print the links present in the webpage
	
	  for (WebElement link : Link1) {
		  System.out.println(link.getAttribute("href"));
	  }
	}
	
	
}
