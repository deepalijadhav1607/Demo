package demo;




import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	
	public class Dimensions_Method {
	

	public static void main(String[] args) throws InterruptedException {
			
			System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.amazon.in//");
			
			driver.manage().window().maximize();
			
			Thread.sleep(3000);
			Dimension size1 = new Dimension(400,500);
			driver.manage().window().setSize(size1);
			
			Thread.sleep(4000);
			driver.close();
}
	
	
}
