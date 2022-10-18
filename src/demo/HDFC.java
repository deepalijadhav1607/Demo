package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HDFC {

public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Installer\\chromedriver.exe\\");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://netbanking.hdfcbank.com//");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@name=\"fldLoginUserId\"]")).click();
		
		driver.findElement(By.xpath("//input[@name=\"fldLoginUserId\"]")).sendKeys("3267567457");
		
		Thread.sleep(3000);
		driver.close();
	
		driver.quit();
}
}
