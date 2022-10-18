package ListBox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Installer\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//a[@class=\"_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy\"]")).click();
		Thread.sleep(3000);
		
		WebElement day = driver.findElement(By.id("day"));
		 WebElement month = driver.findElement(By.id("month"));
		WebElement year =  driver.findElement(By.id("year"));
		 
	// 1)Print the size of the list 
		Select Select1 = new Select(day);
		List<WebElement>Listday= Select1.getOptions();
		 System.out.println(Listday.size());
		 
		 //2 ) Print all the values of the day
		 for (int i =0;i<Listday.size();i++) {
			String dayvalue =  Listday.get(i).getText();
			System.out.println(dayvalue);
		 
		 
		 //3) Print the specific day from the list
	
		if(dayvalue.equals("15")) {		
				Listday.get(i).click();
				  break;
		}
	}
}
}

