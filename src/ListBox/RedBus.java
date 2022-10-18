package ListBox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedBus {
public static void main(String[] args) throws InterruptedException {
	
	 System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.redbus.in/");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@id=\"src\"]")).sendKeys("Pune");
		
		Thread.sleep(3000);
		
	    List<WebElement> City = driver.findElements(By.xpath("//ul[@class=\"autoFill homeSearch\"]//li"));
		
		System.out.println("Total count :"+City.size());
		
		for (int i=0;i<City.size();i++) {
			City.get(i).getText();
			
			if (City.get(i).getText().equals("Wakad, Pune")) {
				System.out.println(City.get(i).getText());
				City.get(i).click();
			}
		}
		

}
}
