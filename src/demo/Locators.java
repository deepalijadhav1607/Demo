package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
	
public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver","C:\\Installer\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.amazon.in/");
	
	Thread.sleep(3000);
	
    //Xpath by attribute
	driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]")).sendKeys("Realme 2 Pro");
	Thread.sleep(3000);
	
		
	//xpath by text
	driver.findElement(By.xpath("//a[text()=\"Customer Service\"]")).click();
	Thread.sleep(3000);
	driver.close();
			
		//x path by contains
	
}

	}
	
	
	
