package ListBox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Practice1 {

	public static void main(String[]args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.redbus.in/");
		Thread.sleep(2000);
		
	    driver.findElement(By.xpath("//input[@id=\"src\"]")).sendKeys("Pune");
		Thread.sleep(2000);
		
		List<WebElement>Loc = driver.findElements(By.xpath("//ul[@class=\"autoFill homeSearch\"]//li"));
		
		System.out.println(Loc.size());
	
		for(int i=0;i<Loc.size();i++) {
			Loc.get(i).getText();
			System.out.println(Loc.get(i).getText());
			
			if (Loc.get(i).getText().equals("Wakad, Pune")) {
				Loc.get(i).click();
				
			}
		}
	}
}
	


