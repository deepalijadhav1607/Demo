	package JavaExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multiple_Highlight {

	public static void main (String [] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Installer\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		
		WebElement Facebook = driver.findElement(By.xpath("//img[@class=\"fb_logo _8ilh img\"]"));
		WebElement Create = driver.findElement(By.xpath("//a[@id=\"u_0_0_ua\"]"));
		
		Highlight(Facebook,driver);
		Highlight(Create,driver);
		
	}
	
	public static void Highlight (WebElement element,WebDriver driver) {
		JavascriptExecutor Js = (JavascriptExecutor)driver;
		Js.executeScript("arguments[0].style.border='10px solid Yellow'", element);
	}
}
