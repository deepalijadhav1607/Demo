package WebElement_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Click_Method {


		public static void main(String[] args) throws InterruptedException {
			
			System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://www.facebook.com/");
			Thread.sleep(3000);
			
			driver.findElement(By.xpath("//button[@class = \"_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy\"]")).click();
			Thread.sleep(3000);
			
			driver.close();
			
		}	
}

