package Actions_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {
public static void main (String []  args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		
		Actions act = new Actions(driver);
		
		WebElement Button = driver.findElement(By.xpath("//span[contains(text(),\"right click me\")]"));
		Thread.sleep(3000);
		
		act.contextClick(Button).build().perform();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("(//span[contains(text(),\"Copy\")])[2]")).click();
		Thread.sleep(3000);
		
	       System.out.println(driver.switchTo().alert().getText());
	       
		driver.switchTo().alert().accept();
		
}
}
