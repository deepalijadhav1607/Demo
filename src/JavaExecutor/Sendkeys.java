package JavaExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sendkeys {

public static void main (String [] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Installer\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		
		WebElement email = driver.findElement(By.xpath("//input[@name=\"email\"]"));
		
		WebElement Pass = driver.findElement(By.xpath("//input[@name=\"pass\"]"));
		
		JavascriptExecutor Js = (JavascriptExecutor)driver;
		
		Js.executeScript("arguments[0].value='Selenium';", email);
		Js.executeScript("arguments[0].value='Java';", Pass);
}
}
