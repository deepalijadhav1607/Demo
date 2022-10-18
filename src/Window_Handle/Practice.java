package Window_Handle;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {

public static void main(String[] args) throws InterruptedException  {
		
		System.setProperty("webdriver.chrome.driver","C:\\Installer\\chromedriver.exe");
				
				WebDriver driver = new ChromeDriver();
				
				driver.manage().window().maximize();
			
				driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
				Thread.sleep(3000);
				
				driver.findElement(By.xpath("//a[contains(text(),\"OrangeHRM, Inc\")]")).click();

                Set<String> WindowID = driver.getWindowHandles();
 
                System.out.println(WindowID);
                
                ArrayList<String> WindowList = new ArrayList(WindowID);
                String Parent = WindowList.get(0);
                String Child = WindowList.get(1);
                
                System.out.println("Parent WindowID :"+ Parent);
                System.out.println("Child WindowID :"+ Child);
        
}		
}
