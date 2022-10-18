package ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SplitMethod {

public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//a[@class=\"_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy\"]")).click();
	    Thread.sleep(5000);

	       WebElement day = driver.findElement(By.xpath("//select[@id=\"day\"]"));
		   WebElement month = driver.findElement(By.xpath("//select[@id=\"month\"]"));
		   WebElement year= driver.findElement(By.xpath("//select[@id=\"year\"]"));
	    
		   String dob = "20.05.2022";
		   
		   String date[] = dob.split(".");
		   
		  Listbox(day,date[0]);
		  Listbox(month,date[1]);
		  Listbox(year,date[2]);
}
	public static void Listbox(WebElement element,String value) {
		Select Select1 = new Select(element);
		
		Select1.selectByValue(value);
		
	}
}
