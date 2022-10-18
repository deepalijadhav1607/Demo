package Practice;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlers {
public static void main(String[] args) throws InterruptedException  {
		
		System.setProperty("webdriver.chrome.driver","C:\\Installer\\chromedriver.exe");
				
				WebDriver driver = new ChromeDriver();
				
				driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");	
				Thread.sleep(3000);
				
				driver.findElement(By.xpath("//a[contains(text(),\"OrangeHRM, Inc\")]")).click();
				Thread.sleep(3000);
				
				Set <String> WindowID = driver.getWindowHandles();
				
				System.out.println(WindowID);
				
				
				ArrayList <String> Window = new ArrayList(WindowID );
				
				String Parent  = Window.get(0);
				String Child = Window.get(1);
				
				System.out.println("Parent ID :"+ Parent);
				System.out.println("Child ID :"+ Child);
}
}
