package Synchronization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Implicit_Weight {

public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Installer\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
				
	    driver.get("https://www.redbus.in/");
		
		driver.findElement(By.xpath("//input[@id=\"src\"]")).sendKeys("Pune");
		
		driver.findElement(By.xpath("//input[@id=\"dest\"]")).sendKeys("Mumbai");
		
		
		
}
}
