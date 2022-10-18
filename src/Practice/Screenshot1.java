package Practice;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot1 {

public static void main (String [] args) throws IOException  {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");
     	WebDriver driver = new ChromeDriver();
	
        driver.get("https://www.facebook.com");
        
        
       WebElement text =  driver.findElement(By.xpath("//h2[@class=\"_8eso\"]"));
       System.out.println(text.getText());
       
        File Source = ((TakesScreenshot)text).getScreenshotAs(OutputType.FILE);
       
        File Destination = new File ("C:\\Users\\Admin\\Desktop\\Screenshot/fc.jpg");
        
        FileHandler.copy(Source,Destination);
        
        
}
}
