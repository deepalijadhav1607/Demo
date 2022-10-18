package JavaExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickOption {

	
	public static void main(String[] args) throws InterruptedException {

		
		 System.setProperty("webdriver.chrome.driver","C:\\Installer\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.get("https://www.facebook.com/");
			
			Thread.sleep(3000); 
			
			WebElement email = driver.findElement(By.xpath("//input[@id=\"email\"]"));
			WebElement Pass = driver.findElement(By.xpath("//input[@id=\"pass\"]"));
			
			JavascriptExecutor Js =(JavascriptExecutor) driver;
			
		    WebElement Click=driver.findElement(By.xpath("//button[@name=\"login\"]"));
		
	    	Js.executeScript("arguments[0].click()", Click);

	}

}


