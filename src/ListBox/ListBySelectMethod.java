package ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBySelectMethod {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//a[@class=\"_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy\"]")).click();
	    Thread.sleep(5000);
	
	    
	   WebElement day = driver.findElement(By.xpath("//select[@id=\"day\"]"));
	   WebElement month = driver.findElement(By.xpath("//select[@id=\"month\"]"));
	   WebElement year= driver.findElement(By.xpath("//select[@id=\"year\"]"));
	    
	   Select Select1 = new Select(day);
	   Select1.selectByVisibleText("10");
	   
	   Select Select2 = new Select(month);
	   Select2.selectByVisibleText("May");
	   
	   Select Select3 = new Select(year);
	   Select3.selectByVisibleText("2022");
	   
	   Thread.sleep(5000);
	   
		driver.close();
		driver.quit();
	}
}
