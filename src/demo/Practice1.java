package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice1 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Installer\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in//");
		
		Thread.sleep(3000);
	
    	driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]")).sendKeys("Mobile");
    	Thread.sleep(3000);
    	
    	driver.findElement(By.xpath("//a[text()=\"Today's Deals\"]")).click();
    	Thread.sleep(3000);
    	
    	driver.findElement(By.xpath("//span[contains(@class,'nav-a-content')]")).click();
    	Thread.sleep(3000);
    	
    	driver.findElement(By.name("field-keywords")).sendKeys("Beauty & Makeup");
    	
    	
    	Thread.sleep(3000);
    	driver.navigate().back();
    	Thread.sleep(3000);
    	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("shoes");
    	driver.navigate().back();
    	Thread.sleep(3000);
    	
    	driver.findElement(By.className("nav-input nav-progressive-attribute")).sendKeys("headphone");
    	Thread.sleep(3000);
    	driver.close();
	}
	
	
		
	
	
}