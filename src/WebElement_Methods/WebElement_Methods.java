package WebElement_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElement_Methods {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		//1) Sendkey Method
		
		driver.findElement(By.xpath("//input[@class=\"inputtext _55r1 _6luy\"]")).sendKeys("Dipu@gmail.com");
	    Thread.sleep(3000);
	    
	    
		//2) Clear Method
	    driver.findElement(By.xpath("//input[@class=\"inputtext _55r1 _6luy\"]")).clear();
	    Thread.sleep(3000);
		
	    //3) Click Method
	    driver.findElement(By.xpath("//button[@class=\"_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy\"]")).click();
	    Thread.sleep(3000);
	    
	    //4) get text Method
	    
	    String Expected = "Facebook helps you connect and share with the people in your life.";
	    String Result = driver.findElement(By.xpath("//h2[text()=\"Facebook helps you connect and share with the people in your life.\"]")).getText();
	    System.out.println(Result);
	    
	    if (Result.equals(Expected)) {
	    	System.out.println("Correct Statement");
	    }
	    	else {
	    		System.out.println("Incorrect Statement");
	    	}

	    //5 isenabled
	    
	     Boolean B =  driver.findElement(By.name("login")).isEnabled();
	   
	    System.out.println(B);
	  
	    //6 isselected 
	    
	driver.findElement(By.xpath(".//a[@class=\"_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy\"]")).click();
	
	Boolean B1 = driver.findElement(By.name("firstname")).isSelected();
	System.out.println(B1);
	
	driver.findElement(By.name("firstname")).click();
	    driver.close(); 
	
	     driver.quit();
	
	 
	}
}
