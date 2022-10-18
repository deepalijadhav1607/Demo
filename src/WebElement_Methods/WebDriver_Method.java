package WebElement_Methods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriver_Method {

	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Installer\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		//1) get Title Method
		driver.get("https://www.facebook.com/");
		
		//2) Thread Sleep Method
		Thread.sleep(3000);
		
		//3) getTitle Method
		String Title = driver.getTitle();
		System.out.println(Title);
		
		//4) getcurrenturl Method
		
         String url = driver.getCurrentUrl();
		 System.out.println(url);
         
         //5) Maximize Method
		 driver.manage().window().maximize();
		 
		 //6) Navigate Method
		 driver.navigate().to("https://www.facebook.com/");
		 driver.navigate().forward();
		 driver.navigate().back();
		 driver.navigate().refresh();
		 
		 //7) .set size
		 
		 Dimension d = new Dimension(300,400);
		 driver.manage().window().setSize(d);
		 
		 //8 .get size
		 
		 driver.manage().window().getSize();
		 System.out.println( driver.manage().window().getSize());
		 
		 
		 //9 .setposition
		 
		 Point p = new Point (450,500);
		 driver.manage().window().setPosition(p);
		 
		 //10) .getposition
		 
		 driver.manage().window().getPosition();
		 System.out.println( driver.manage().window().getPosition());
		 
		 Thread.sleep(3000);
		
		 //11) Close Method
		 driver.close();
		
		 //12) Quit Method
		 driver.quit();
	}
}
