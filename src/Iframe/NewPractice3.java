package Iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewPractice3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Installer\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_iframe_height_width");
		
		Thread.sleep(3000);
		
		driver.switchTo().frame("iframeResult");
		
		driver.switchTo().frame(0);
		
		Thread.sleep(3000);
		
		System.out.println(driver.findElement(By.xpath("//h1[contains(text(),\"This page is displayed in an iframe\")]")).getText());
	   
	    driver.switchTo().parentFrame();
	
	    System.out.println(driver.findElement(By.xpath("//p[contains(text(),\"You can use the height and width attributes to specify the size of the iframe:\")]")).getText());
	
	    driver.switchTo().defaultContent();
	}
	
}
