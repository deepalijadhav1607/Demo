package JavaExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HighLight_Border {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Installer\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.redbus.in/");
		
		WebElement Search = driver.findElement(By.xpath("//img[@src=\"https://mmt.servedbyadbutler.com/getad.img/;libID=3436715\"]"));
		Thread.sleep(3000);
		
		JavascriptExecutor Js = (JavascriptExecutor)driver;
		
	    Js.executeScript("arguments[0].style.border ='5px solid Yellow'", Search);
		
		
	}
	
}
