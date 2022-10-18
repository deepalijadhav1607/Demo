package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class List {

	public static void main (String [] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");
     	WebDriver driver = new ChromeDriver();
	
     	driver.get("https://www.facebook.com");
	    driver.manage().window().maximize();
	
	    Thread.sleep(3000);
	
	    driver.findElement(By.xpath("(//a[@role=\"button\"])[2]")).click();
	    Thread.sleep(3000);
	    
	    driver.findElement(By.xpath("//input[@name=\"firstname\"]")).sendKeys("Deepali");
	    driver.findElement(By.xpath("//input[@name=\"lastname\"]")).sendKeys("Salunkhe");
	    driver.findElement(By.xpath("//input[@name=\"reg_email__\"]")).sendKeys("986045475");
	    driver.findElement(By.id("password_step_input")).sendKeys("Pinky@143");
	    
	    Thread.sleep(3000);
	    
	    WebElement Day = driver.findElement(By.id("day"));
	    WebElement Month =  driver.findElement(By.id("month"));
	    WebElement Year =  driver.findElement(By.id("year"));
	   
	    Thread.sleep(3000);
	    
	    String Dob = ("16/11/1992");
	    String[] Date = Dob.split("/");
	    
	    
        assignment(Day,Date[0]);
        assignment(Month,Date[1]);
        assignment (Year,Date[2]);
	    
	}
	     
	    public static void assignment(WebElement element , String Value) {
	    
	    	Select S1 = new Select (element);
	    	S1.selectByValue(Value);
	    }

}
