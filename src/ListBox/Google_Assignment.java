package ListBox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Google_Assignment {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.co.in/");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@class=\"gLFyf gsfi\"]")).sendKeys("Selenium");
		Thread.sleep(2000);
		
		List<WebElement> Data = driver.findElements(By.xpath("//span[contains(text(),\"selenium\")]"));
	
		System.out.println(Data.size());
		
		for(int i=0;i<Data.size();i++) {
			System.out.println(Data.get(i).getText());
		
			if(Data.get(i).getText().equals("selenium download")) {
				Data.get(i).click();
				
				break;
			}
	}
	
	}
}


