package Actions_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBackSpace {

public static void main (String []  args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://the-internet.herokuapp.com/key_presses?");
		Thread.sleep(3000);
		
		Actions Act = new Actions(driver);
		
		//driver.findElement(By.xpath("//input[@id=\"target\"]"));
		
		Act.sendKeys(Keys.BACK_SPACE).build().perform();
		Thread.sleep(3000);
		
		System.out.println(driver.findElement(By.xpath("//p[@id=\"result\"]")).getText());
		
		Thread.sleep(3000);
		Act.sendKeys(Keys.ESCAPE).build().perform();
		System.out.println(driver.findElement(By.xpath("//p[@id=\"result\"]")).getText());
		
		
}
}
