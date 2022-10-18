package JavaExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BackgroundHighlight {

public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Installer\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		
        WebElement address = driver.findElement(By.xpath("//input[@id=\"email\"]"));
        Thread.sleep(1000);
        
        WebElement Create = driver.findElement(By.xpath("(//a[@role=\"button\"])[2]"));
        Thread.sleep(1000);
        
        highlight(address,driver);
        highlight(Create,driver);
        
}

        public static void highlight(WebElement element ,WebDriver driver) {
        JavascriptExecutor Js = (JavascriptExecutor)driver;
        //Js.executeScript("arguments[0].style.border='3px solid red'", element);
		Js.executeScript("arguments[0].style.background = 'yellow'",element);
}

}
