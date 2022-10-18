package Iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframe1 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Installer\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Frames.html");
		
		driver.manage().window().maximize();
	
		//driver.switchTo().frame("Iframe with in an Iframe");
		
		driver.findElement(By.xpath("//a[text()=\"Iframe with in an Iframe\"]")).click();
		
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("Welcome");
		
		
		
		
	}
}
