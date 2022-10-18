package Iframe;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewPractice {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Installer\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
		
		//List<WebElement> Count = driver.findElements(By.tagName("iframe"));
		//System.out.println(Count.size());
		
		driver.switchTo().frame("iframeResult");
		
		driver.findElement(By.xpath("//button[@type=\"button\"]")).click();
		
		
	}
}
