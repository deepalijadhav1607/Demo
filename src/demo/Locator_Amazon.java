package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator_Amazon {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Installer\\chromedriver.exe\\");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[text() = \"Today's Deals\"]")).click();
		
		Thread.sleep(3000);
		
		
		driver.findElement(By.xpath("//span[@class = \"nav-a-content\"]")).click();
		
		Thread.sleep(3000);
		driver.close();
		
		
	}
}
