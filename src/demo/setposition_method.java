package demo;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class setposition_method {

	public static void main(String[] args) throws InterruptedException {
		
	
	System.setProperty("webdriver.chrome.driver","C:\\Installer\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.amazon.in/");
	
	driver.manage().window().maximize();
	
	
	Thread.sleep(3000);
	
	
	Point p = new Point (700,900);
	driver.manage().window().setPosition(p);
	

	Thread.sleep(8000);
	
	driver.manage().window().getPosition();
	System.out.println(driver.manage().window().getPosition());
	
	driver.close();
}
}