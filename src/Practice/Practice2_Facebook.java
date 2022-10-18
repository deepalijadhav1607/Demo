package Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Practice2_Facebook {

public static void main (String [] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");
     	WebDriver driver = new ChromeDriver();
	
        driver.get("https://www.facebook.com");
        
        driver.findElement(By.xpath("(//a[@role=\"button\"])[2]")).click();
        Thread.sleep(2000);
	
        WebElement Day = driver.findElement(By.id("day"));
        Thread.sleep(2000);
        
        Select Select1 = new Select(Day);
        List<WebElement> Listday = Select1.getOptions();
	    System.out.println(Listday.size());
	    
	    for (int i=0;i<Listday.size();i++) {
	    	System.out.println(Listday.get(i).getText());
	    	
	    	if (Listday.get(i).getText().equals("16")) {
	    		Listday.get(i).click();
	    			
	    	}
	    }
	   WebElement month = driver.findElement(By.id("month"));
	   
	   Select S2 = new Select (month);
	   List<WebElement> Listmonth = S2.getOptions();
	   System.out.println(Listmonth.size());
	   
	   for (int i=0;i<Listmonth.size();i++) {
		   System.out.println(Listmonth.get(i).getText());
		   
		   if (Listmonth.get(i).getText().equals("Jan")) {
			   Listmonth.get(i).click();
		   }
	   }
}
}
