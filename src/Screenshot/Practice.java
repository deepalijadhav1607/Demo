package Screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Practice {

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Installer\\chromedriver.exe");
				
				WebDriver driver = new ChromeDriver();
				
				driver.get("https://www.facebook.com/");
				
				WebElement data = driver.findElement(By.xpath("//img[@class=\"fb_logo _8ilh img\"]"));
				
				File Source = ((TakesScreenshot)data).getScreenshotAs(OutputType.FILE);
				
				File Destination = new File ("C:\\Users\\Admin\\Desktop\\Screenshot/facebook.png");
				
				FileHandler.copy(Source, Destination);

	}
	
	
}
