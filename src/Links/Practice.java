package Links;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {

public static void main (String [] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		List<WebElement> No = driver.findElements(By.tagName("a"));
		
		System.out.println("Total Number of Links Present in WebPage :"+No.size());
		
		int brokenlink = 0;
		
		for (WebElement element : No) {
			String url = element.getAttribute("href");
			
			if(url==null || url.isEmpty()) {
				System.out.println("URL is Null or Empty");
			}
			
			URL link = new URL(url);
			HttpsURLConnection httpscode = (HttpsURLConnection)link.openConnection();
			
			if(httpscode.getResponseCode()>400) {
				System.out.println(httpscode.getResponseCode()+"======"+url+"is======"+"Broken Link");
				brokenlink++;
			}
			else {
				System.out.println(httpscode.getResponseCode()+"====="+url+"is======"+"Valid Link");
			}
			System.out.println("Total Number of Broken Link:"+brokenlink);
		}
}
}
