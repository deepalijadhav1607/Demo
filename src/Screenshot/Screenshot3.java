package Screenshot;

import java.io.File;
import java.io.IOException;

import javax.print.attribute.standard.Destination;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot3 {

	public static void main(String[] args) throws IOException {
		

		System.setProperty("webdriver.chrome.driver","C:\\Installer\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://www.shadi.com/");
			
			File Source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			
		    File  Destination = new File("C:\\Users\\Admin\\Desktop\\Screenshot/Shadi.png");
		    
		    FileHandler.copy(Source, Destination);
	}
}
