package demo;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.docker.Port;

public class Practice {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Installer\\chromedriver.exe");
		
		//1 . Get Method
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in//");
		
		//2 . Thread Method
		Thread.sleep(5000);
		
		//3. Maximize
		
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		//4. Get Current URL
		
		String URL = driver.getCurrentUrl();
		if (URL.equals("https://www.amazon.in//")) {
			System.out.println("Correct URL");
		}
			else {
				System.out.println("Incorrect URL");
			}
		
		//5 . get Title
		
		String Page = driver.getTitle();
		System.out.println(Page);
		
		Thread.sleep(5000);
		
		//6 . Navigate
		
		driver.navigate().back();
		Thread.sleep(3000);
		
		driver.navigate().forward();
		Thread.sleep(3000);
		
		driver.navigate().refresh();
		Thread.sleep(3000);
		
		//7. set size
		
		Dimension size = new Dimension (300,400);
		driver.manage().window().setSize(size);
		Thread.sleep(3000);
		
		//8. get size
		
		driver.manage().window().getSize();
		System.out.println(driver.manage().window().getSize());
		Thread.sleep(3000);
		
		//9 .set position
		
		Point p = new Point (300,600);
		driver.manage().window().setPosition(p);
		Thread.sleep(3000);
		
		//10. .get position
		
		driver.manage().window().getPosition();
		System.out.println(driver.manage().window().getPosition());
		Thread.sleep(3000);
		
		//11. Close Method
		driver.close();
		}
	
		
	}


