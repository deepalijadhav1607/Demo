package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_Methods {

	public static void main(String[] args) throws InterruptedException {
		
		//1 )Get Method = It is used to open the browser or enter the URL
             System.setProperty("webdriver.chrome.driver","C:\\Installer\\chromedriver.exe");
             WebDriver driver = new ChromeDriver();
             driver.get("https://www.facebook.com/");

             
        //2 ) Thread.sleep = It is used to specify the time limit
             Thread.sleep(5000);
             
             
        //3 ) Maximize = It is used to maximize the screen
             
             driver.manage().window().maximize();
             
             Thread.sleep(10000);
             
        //4 ) get Title()
             
             String Title = driver.getTitle();
             System.out.println(Title);
             
             if(Title.equals("Facebok – log in or sign up")) {
            	 System.out.println("Coorect Title");
             }
            	 else {
            		 System.out.println("Incorrect Title");
            	 
            	 } 
	
         //5 ) Navigate Method - it is used to go back,forward & refresh
             
             driver.navigate().back();
             Thread.sleep(3000);
             driver.navigate().forward();
             Thread.sleep(3000);
             driver.navigate().refresh();
             
          //6 ) get Current URL
             
             String URL = driver.getCurrentUrl();
             System.out.println(URL);
             if (URL.equals("https://www.facebook.com/")) {
            	 System.out.println("Coorect URL");
             }
            	 else {
            		 System.out.println("Incorrect URL");
            	 }
             
             
             
           //7 ) Close Method = It is used to close the browser
               Thread.sleep(5000);
             driver.close();
             
	}    
	}

