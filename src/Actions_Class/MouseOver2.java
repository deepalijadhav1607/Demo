package Actions_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOver2 {

	public static void main(String[] args) throws InterruptedException {
		
		
		   System.setProperty("webdriver.chrome.driver","C:\\Installer\\chromedriver.exe");
			
		   WebDriver driver = new ChromeDriver();
					
		   driver.manage().window().maximize();
					
		   driver.get("http://mrbool.com/");
					
		   Thread.sleep(4000);
		   
		   Actions act = new Actions(driver);
		   
		   WebElement Content = driver.findElement(By.xpath("//a[@href=\"http://mrbool.com/articles/listcomp.asp\"]"));
		   
	       act.moveToElement(Content).build().perform();
	       
	      WebElement Article =  driver.findElement(By.xpath("(//a[contains(text(),\"Articles\")])[1]"));
		  String Article1 =  Article.getText();
		  System.out.println(Article1);
		  
		  WebElement Courses = driver.findElement(By.xpath("(//a[contains(text(),\"Courses\")])[2]"));
		  String Course1 = Courses.getText();
		  System.out.println(Course1);
		  
		  WebElement Singlevedios =  driver.findElement(By.xpath("//a[contains(text(),\"Single Videos\")]"));
		  String Single =  Singlevedios.getText();
		  	System.out.println(Single);
		  
		  
	}
	

}

