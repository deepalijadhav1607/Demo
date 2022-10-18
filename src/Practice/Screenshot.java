package Practice;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {

public static void main (String [] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");
     	WebDriver driver = new ChromeDriver();
	
        driver.get("https://www.facebook.com");
        
       File Source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
       
       File Destination = new File ("C:\\Users\\Admin\\Desktop\\Screenshot/fac.png");
       
       FileHandler.copy(Source, Destination);
}
}
