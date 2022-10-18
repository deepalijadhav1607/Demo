package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Current_Title {

public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in//");
		
		String page = driver.getTitle();
		System.out.println(page);
		//String ExpectedResult = "https://www.amazon.in//";
		//if (Title.equals(ExpectedResult)) {
			//System.out.println("Correct Title");
		//}
		//else {
			//System.out.println("Incorrect Title");
	//	}
		
		Thread.sleep(3000);
		driver.close();
}
}
