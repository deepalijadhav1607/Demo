package Iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewPractice2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Installer\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Frames.html");
		
		driver.findElement(By.partialLinkText("Iframe with in an Iframe")).click();
		
		//WebElement Innerframe  = driver.findElement(By.xpath("//div[@class=\"container iframes-page-container\"]"));
}
}
