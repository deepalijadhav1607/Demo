package ListBox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Practice {

	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[@class=\"_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy\"]")).click();
		Thread.sleep(3000);
		
		WebElement day = driver.findElement(By.id("day"));
		Thread.sleep(3000);
		
		// Print the size of the day
		Select S1 = new Select(day);
		List<WebElement>Listday = S1.getOptions();
	    System.out.println(Listday.size());
	
	    //Print the no in the day
	    
	    for (int i=0;i<Listday.size();i++) {
	    	System.out.println(Listday.get(i).getText());
	    	
	    //Print the specific no of the day
	    	
	    	if (Listday.get(i).getText().equals("16")) {
	    		Listday.get(i).click();
	    	}
	    }
	    System.out.println("============================================================");
	    
	   WebElement Month =  driver.findElement(By.id("month"));
	    Thread.sleep(3000);
	    
	   Select S2 = new Select(Month);
	   List<WebElement>ListMonth = S2.getOptions();
	   System.out.println(ListMonth.size());
	   
	   for (int i=0;i<ListMonth.size();i++) {
		  System.out.println(ListMonth.get(i).getText());
		   
		  if (ListMonth.get(i).getText().equals("Jul")) {
		  ListMonth.get(i).click();
		  
	   }
	   }
	   
		  Thread.sleep(3000);
		  System.out.println("============================================================");
		  WebElement Year = driver.findElement(By.id("year"));
		  Thread.sleep(3000);
		  
		  Select S3 = new Select(Year);
		  List <WebElement> ListYear = S3.getOptions();
		  System.out.println(ListYear.size());
		  
		  for (int i=0;i<ListYear.size();i++) {
			 System.out.println( ListYear.get(i).getText());
			 
			 if (ListYear.get(i).getText().equals("1992")) {
				 ListYear.get(i).click();
			 }
		  }
		  Thread.sleep(3000);
		driver.close();
	
	}
}
