package JavaExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollByElement {

public static void main (String [] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Installer\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.w3schools.com/");
		
	WebElement Section = driver.findElement(By.xpath("//h2[contains(text(),\"How To Section\")]"));
		JavascriptExecutor Js= (JavascriptExecutor)driver;
		
		Js.executeScript("arguments[0].scrollIntoView();",Section);
		
	
}
}
