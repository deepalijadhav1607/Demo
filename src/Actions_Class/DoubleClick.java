package Actions_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

	public static void main (String [] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		
		Actions action = new Actions(driver);
		
		//Store the Element in Webelement with reference Double
		WebElement Double = driver.findElement(By.xpath("//button[contains(text(),\"Double-Click Me To See Alert\")]"));
		
		Thread.sleep(3000);
		
		action.doubleClick(Double).build().perform();
		
		Thread.sleep(3000);
		
		driver.switchTo().alert().accept();
		
	}
}
