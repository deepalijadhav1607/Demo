package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class get_current_url {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in//");
		
		String URL = driver.getCurrentUrl();
		if (URL.equals("https://www.amazon.in//")) {
		System.out.println("Correct URL");
		}
		else {
			System.out.println("Incorrect URL");
		}
		
		
		driver.close();
	}
}
