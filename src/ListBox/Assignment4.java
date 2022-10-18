package ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment4 {
public static void main(String[] args) throws InterruptedException {

System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.redbus.in/");
	Thread.sleep(3000);
	

	
	driver.findElement(By.xpath("//input[@id=\"src\"]")).sendKeys("Pune");
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("//input[@id=\"dest\"]")).sendKeys("Mumbai");
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("//input[@id=\"onward_cal\"]")).click();
	
	while(true) {
		String s= driver.findElement(By.xpath("//td[@class='monthTitle']")).getText();
		System.out.println("Current Title is" +s);
		if(!s.equalsIgnoreCase("May 2023")) {
		driver.findElement(By.xpath("//td[@class='next']")).click();
		}
		else {
			break;
		}
	}
	driver.findElement(By.xpath("//div[@class='rb-calendar']//tbody//tr//td[text()='9']")).click();
}
}


