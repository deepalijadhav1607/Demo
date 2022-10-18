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

import net.bytebuddy.utility.RandomString;

public class Random_Screenshot {

	public static void main(String[] args) throws IOException {
		
System.setProperty("webdriver.chrome.driver","C:\\Installer\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.shadi.com/");
		
		WebElement Text = driver.findElement(By.xpath("//h2[@style=\"text-align:center;color:#D20200;\"]"));
		File Source = ((TakesScreenshot)Text).getScreenshotAs(OutputType.FILE);
		
		String Random = RandomString.make();
				
				String Filename = "Shadi";
				
		System.out.println(Source);
		
	
		
		File Destination = new File("C:\\Users\\Admin\\Desktop\\Screenshot/"+Filename+""+Random+".jpg");
		
		FileHandler.copy(Source, Destination);
	}
	
}
