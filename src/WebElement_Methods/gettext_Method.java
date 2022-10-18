package WebElement_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class gettext_Method {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		
		String Expected = "Facebook helps you connect and share with the people in your life.";
		
		String Result = driver.findElement(By.xpath("//h2[text()=\"Facebook helps you connect and share with the people in your life.\"]")).getText();
		System.out.println(Result);
		
		if (Result.equals(Expected)) {
			System.out.println("Correct Statement");
		}
		else {
			System.out.println("Incorrect Statement");
		}
		driver.close();
	}
}
