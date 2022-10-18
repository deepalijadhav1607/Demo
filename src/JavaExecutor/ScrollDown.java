package JavaExecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollDown {

public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Installer\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		
		JavascriptExecutor Js = (JavascriptExecutor)driver;
		//take execute (string,arg) for scroll
		
		//To scroll Down
		//Js.executeScript("window.scrollBy(0,2000)","");
		
		Js.executeScript("window.scrollBy(0,-1000)", "");
		
}
}
