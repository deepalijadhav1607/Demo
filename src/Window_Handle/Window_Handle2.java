package Window_Handle;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window_Handle2 {
public static void main(String[] args) throws InterruptedException  {
		
		System.setProperty("webdriver.chrome.driver","C:\\Installer\\chromedriver.exe");
				
				WebDriver driver = new ChromeDriver();
				
				driver.manage().window().maximize();
				
				driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");	
				Thread.sleep(3000);
				
				driver.findElement(By.xpath("//a[contains(text(),\"OrangeHRM, Inc\")]")).click();
				Thread.sleep(3000);

				Set<String>WindowID =driver.getWindowHandles();
				
				//First method
				Iterator<String> it = WindowID.iterator();
				String ParentWindow= it.next();
				String ChildWindow = it.next();

				System.out.println("Parent Window :"+ParentWindow);  
				// Go to Parent Window & then child window
				driver.switchTo().window(ParentWindow);
				
				Thread.sleep(5000);
				
				driver.switchTo().window(ChildWindow);
				Thread.sleep(5000);

				// Print the Title of the Windows
				
				System.out.println(driver.getTitle());
				
				
				driver.findElement(By.xpath("//input[@id=\"myText\"]")).sendKeys("Rkendre007@gamil.com");
				
				driver.findElement(By.xpath("//button[@id=\"linkadd\"]")).click();

				Thread.sleep(5000);
	           
				//driver.close();
				//Second option
				
				for(String WinID : WindowID) {
					String Title =driver.switchTo().window(WinID).getTitle();
					if(Title.equals("OrangeHRM")|| Title.equals("Sign Up for a Free HR Software Trial | OrangeHRM | OrangeHRM\n")) {
						
						driver.close();
					}
					System.out.println(Title);

				
				}		
}
}
