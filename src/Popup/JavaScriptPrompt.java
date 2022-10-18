package Popup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptPrompt {

public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Installer\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[@onclick=\"jsPrompt()\"]")).click();
		
		Alert text = driver.switchTo().alert();
		System.out.println(text.getText());
		text.sendKeys("Welcome");
		
		driver.switchTo().alert().accept();
		
		//without putting text if we pass dismiss it will show null
		
}
}
