package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator_Attribute {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Installer\\chromedriver.exe\\");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com//");
		
		Thread.sleep(3000);
		
		// x path by attribute = //tagname[@attributename = "attributevalue"]
		
		driver.findElement(By.xpath("//input[@class = \"inputtext _55r1 _6luy\"]")).sendKeys("bcf@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id = \"pass\"]")).sendKeys("123");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[@class =\"_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy\"]")).click();
		
		
		
		// x path by text = 
	
	}
}
