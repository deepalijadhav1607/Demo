package ListBox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment {

		
public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver","C:\\Installer\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://demo.automationtesting.in/Register.html");
	
	driver.manage().window().maximize();
	
	Thread.sleep(2000);

 WebElement Year =  driver.findElement(By.xpath("//select[@placeholder=\"Year\"]"));
 WebElement Month = driver.findElement(By.xpath("//select[@placeholder=\"Month\"]"));
 WebElement Day = driver.findElement(By.xpath("//select[@placeholder=\"Day\"]"));
  
 String Dob = ("1992/July/16");
 String[] Date = Dob.split("/");
 
 assignment(Year, Date[0]);
 assignment(Month, Date[1]);
 assignment(Day, Date[2]);
 
    		}
public static void assignment (WebElement element , String value) {
Select S1 = new Select(element);
S1.selectByValue(value);
    	
}
   }

