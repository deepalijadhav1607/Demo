package WebElement_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo {

public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Register.html");
		
	boolean b=	driver.findElement(By.xpath("//input[@value=\"Male\"]")).isSelected();
	
    System.out.println(b);
    
    Thread.sleep(4000);
    driver.findElement(By.xpath("//input[@value=\"Male\"]")).click();
    
    boolean b1=	driver.findElement(By.xpath("//input[@value=\"Male\"]")).isSelected();
	
    System.out.println(b1);
    
    boolean b2=   driver.findElement(By.xpath("//input[@id=\"checkbox1\"]")).isSelected();
  
    System.out.println(b2);
}
}
