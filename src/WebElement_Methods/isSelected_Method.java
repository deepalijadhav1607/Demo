package WebElement_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class isSelected_Method {

	
	public static void main(String[] args) throws InterruptedException {

	    System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");
			
				WebDriver driver = new ChromeDriver();
				
				driver.manage().window().maximize();
				Thread.sleep(3000);
				driver.get("https://www.facebook.com/");
				
			    driver.findElement(By.xpath("//a[@class=\"_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy\"]")).click();
			    Thread.sleep(3000);
	            
		 	    
			    boolean b=driver.findElement(By.xpath("//label[@class=\"_58mt\"]")).isSelected();
			    System.out.println(b);
			    
			    Thread.sleep(3000);
			    driver.findElement(By.xpath("//label[@class=\"_58mt\"]")).click();
			    
			    boolean b1 = driver.findElement(By.xpath("//label[@class=\"_58mt\"]")).isSelected();
			    System.out.println(b1);
			    
			    driver.findElement(By.id("u_c_o_a1")).isSelected();
			    
			    driver.close();
	}
	


	}
	
	

