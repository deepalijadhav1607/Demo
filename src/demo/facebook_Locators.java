package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebook_Locators {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Installer\\chromedriver.exe\\");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com//");
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@class=\"inputtext _55r1 _6luy\"]")).sendKeys("Rahul123@gmail.com");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@class=\"inputtext _55r1 _6luy _9npi\"]")).sendKeys("2672575");
		
		Thread.sleep(3000);
		
		driver.findElement(By.name("login")).click();
		
		Thread.sleep(3000);
		
		driver.navigate().back();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[text()=\"Forgotten password?\"]")).click();
		
		Thread.sleep(3000);
		
		driver.navigate().back();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[@class=\"_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy\"]")).click();
		
		Thread.sleep(3000);
		//driver.findElement(By.name("firstname")).click();
		driver.findElement(By.name("firstname")).sendKeys("Deepali");
		driver.findElement(By.name("lastname")).sendKeys("Salunkhe");
		driver.findElement(By.xpath("//input[@class=\"inputtext _58mg _5dba _2ph-\"]")).sendKeys("98675533");
		
		Thread.sleep(3000);
		driver.close();
		driver.quit();
	}
}
