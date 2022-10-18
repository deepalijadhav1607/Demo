package WebElement_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Clear_Method {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		
		WebElement email = driver.findElement(By.name("email"));
		email.sendKeys("dia@gmail.com");
		email.clear();
		
		Thread.sleep(3000);
		email.sendKeys("amu@gmail.com");
		Thread.sleep(3000);
		
		
		driver.close();
	}		
}
	
