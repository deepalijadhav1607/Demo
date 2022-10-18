package Popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Jacascriptalertpopoup2 {

public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Installer\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		driver.findElement(By.xpath("//button[@onclick=\"jsConfirm()\"]")).click();
		Thread.sleep(3000);
		
		
		//driver.switchTo().alert().accept();
		
		driver.switchTo().alert().dismiss();
		
		
		
		
		
}
}
