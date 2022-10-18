package WebElement_Table;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstProgram {

public static void main(String[] args) throws InterruptedException  {
		
		System.setProperty("webdriver.chrome.driver","C:\\Installer\\chromedriver.exe");
				
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				
				driver.get("https://www.w3schools.com/html/html_tables.asp");
				
				JavascriptExecutor Js = (JavascriptExecutor)driver;
				
				WebElement Code = driver.findElement(By.xpath("(//h3[contains(text(),\"Example\")])[1]"));
				
				Js.executeScript("arguments[0].scrollIntoView",Code);
				
				//to find the No of Rows
				
				int Row = driver.findElements(By.xpath("//table[@id=\"customers\"]/tbody/tr")).size();
				
				System.out.println("Total Numbers of Rows :"+ Row);
				
				//To find the No of Columns
				
				int Col = driver.findElements(By.xpath("//table[@id=\"customers\"]/tbody/tr/th")).size();
				System.out.println("Total Numbers of Columns :"+ Col);
				
				// To print the Specific data from the table
				
				String Data = driver.findElement(By.xpath("//table[@id=\"customers\"]/tbody/tr[6]/td[3]")).getText();
				System.out.println(Data);
				
				//To print all the data in the table
				
				for (int i=2;i<=Row;i++) {    //i=2 ,2<=7(true) ,3<=7 (true) , it will take the value till 8<=7(false condition)
					
					for (int j=1;j<=Col;j++) { //j=1 ,1<=3 (true),it will print the value j++ means increase by 1
						                       //j=2 ,2<=3 (true),it will print the value j++ means increase by 1
						                       //j=3 ,3<=3 (true),it will print the value j++ means increase by 1
						                       //j=4 ,4<=3 (False) , now it will go to above for loop 
						
						
							String actualvalue = driver.findElement(By.xpath("//table[@id=\"customers\"]/tbody/tr["+i+"]/td["+j+"]")).getText();
							
			System.out.print(actualvalue + " | ");
			
					}
					System.out.println();
				}
				
				//String actualvalue = driver.findElement(By.xpath("//table[@id=\"customers\"]/tbody/tr["+i+"]/td["+j+"]")).getText();
				//if (actualvalue.equals("Germany")) {
				//	System.out.println("i+j");
				
				}
}


