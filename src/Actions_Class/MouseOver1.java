package Actions_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOver1 {

	public static void main (String []  args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.xpath("//button[@class=\"_2KpZ6l _2doB4z\"]")).click();
		
		   Actions act = new Actions(driver);
		   
			 // WebElement  Login=  driver.findElement(By.xpath("//a[contains(text(),'Login')]"));
			   WebElement More=driver.findElement(By.xpath("//div[@class=\"exehdJ\"]"));
			   
			    act.moveToElement(More).build().perform();

	}
}
