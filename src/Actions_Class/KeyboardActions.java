package Actions_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.interactions.Actions;



public class KeyboardActions {

public static void main (String []  args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://text-compare.com/");
		Thread.sleep(3000);
		
		WebElement input1 = driver.findElement(By.xpath("//textarea[@id=\"inputText1\"]"));
		WebElement input2 = driver.findElement(By.xpath("//textarea[@id=\"inputText2\"]"));
		input1.sendKeys("Java is Object Oriented Programming Language");
		
		//Select All 
		
		Actions action = new Actions(driver);
		action.keyDown(Keys.CONTROL);
	    action.sendKeys("a");
	    action.keyDown(Keys.CONTROL);
		action.build().perform();
		
		
		// Copy
		action.keyDown(Keys.CONTROL);
		action.sendKeys("c");
		action.keyDown(Keys.CONTROL);
		action.build().perform();
		
		//TAB
		
		//action.sendKeys(Keys.TAB);
		//action.build().perform();
		
		driver.findElement(By.xpath("//textarea[@id=\"inputText2\"]")).click();
		
		//Paste
		
		action.keyDown(Keys.CONTROL);
		action.sendKeys("v");
		action.keyDown(Keys.CONTROL);
		action.build().perform();
		
		if(input1.getAttribute("value").equals(input2.getAttribute("value")))
			System.out.println("Correct copied");
		else
			System.out.println("Incorrect");

		}
}		




