package POM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Kite_Test {

	
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Installer\\chromedriver.exe");
		
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		
		driver.get("https://kite.zerodha.com/");
		
		//ChromeOptions option = new ChromeOptions();
		//option.addArguments("--disable-notifications");
		
		Kite_Page1 KP1 = new Kite_Page1(driver);
		KP1.userid();
		Thread.sleep(2000);
		KP1.password();
		Thread.sleep(2000);
		KP1.Submit();
		Thread.sleep(2000);
		
		Kite_Page2 KP2 = new Kite_Page2(driver);
		KP2.password();
		Thread.sleep(2000);
		KP2.submit2();
		Thread.sleep(2000);
		
		Kite_Page3 KP3 = new Kite_Page3(driver);
		KP3.Home();
		
		
	}
}
