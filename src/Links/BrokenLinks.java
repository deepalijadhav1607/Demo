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



public class BrokenLinks {

	public static void main(String[]args) throws IOException {
System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	    
	    driver.manage().window().maximize();
	    
	    driver.get("https://www.facebook.com/");
		
		List<WebElement> link = driver.findElements(By.tagName("a"));
		System.out.println("Number of Links:" + link.size());
		
		int brokenlink = 0;
		
		for (WebElement link1 : link) {
			String url = link1.getAttribute("href");
		
			if(url==null || url.isEmpty()) {
					System.out.println("URL is Empty or Null");
			}
			
			URL Lk = new URL(url);
	
			HttpsURLConnection Httpcode = (HttpsURLConnection)Lk.openConnection();
			Httpcode.connect();
			
			if(Httpcode.getResponseCode()>=400) {
				System.out.println(Httpcode.getResponseCode()+"====="+url+"is====="+"Broken Links");
				brokenlink++;
			}
			else {
				System.out.println(Httpcode.getResponseCode()+"====="+url+"is====="+"Valid Links");
			}
			System.out.println("Number of Broken Links:"+ brokenlink);
	}
	}
}
