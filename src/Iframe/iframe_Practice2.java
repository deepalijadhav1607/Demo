package Iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframe_Practice2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Installer\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Frames.html");
		
	//	driver.switchTo().frame("singleframe");
	//	driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("Welcome");
		
		
		driver.findElement(By.xpath("(//a[@class=\"analystic\"])[2]")).click();
		
		Thread.sleep(3000);
		WebElement Outerframe = driver.findElement(By.xpath("//div[@id=\"Multiple\"]//iframe"));
		driver.switchTo().frame(Outerframe);
		
		WebElement Innerframe = driver.findElement(By.xpath("(iframe[src=\"SingleFrame.html\"])[2]"));
		driver.switchTo().frame(Innerframe);
		
		driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("Welcome");
		
		driver.switchTo().defaultContent();

	}

}
