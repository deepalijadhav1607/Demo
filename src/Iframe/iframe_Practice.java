package Iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframe_Practice {
public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver","C:\\Installer\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
	
	Thread.sleep(3000);
	
	driver.switchTo().frame("iframeResult");
	driver.findElement(By.xpath("//button[@type=\"button\"]")).click();
	
	driver.switchTo().defaultContent();
	
	Thread.sleep(3000);
	driver.findElement(By.xpath("//button[@id=\"runbtn\"]")).click();
	
}
	
	
}
