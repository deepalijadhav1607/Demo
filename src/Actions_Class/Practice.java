package Actions_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Practice {

public static void main (String []  args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://the-internet.herokuapp.com/key_presses?");
		
		Actions act = new Actions(driver);
		
		
		
		act.sendKeys(Keys.BACK_SPACE).build().perform();
		System.out.println(driver.findElement(By.xpath("//input[@id=\"target\"]")).getText());
}
}
