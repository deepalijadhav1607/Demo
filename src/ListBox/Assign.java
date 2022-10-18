package ListBox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class Assign {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demo.automationtesting.in/Register.html");
		
		Thread.sleep(3000);
		
		WebElement skills = driver.findElement(By.id("Skills"));
		
		// to find the size
		System.out.println("Print the size of the Skills");
		Select S1 = new Select(skills);
	List <WebElement> Listskills = S1.getOptions();
		System.out.println(Listskills.size());
	
		System.out.println(" ");
		
		// To print all the element
		System.out.println("Print all the Options present in Drodown");
	for (int i=0;i<Listskills.size();i++) {
		System.out.println(Listskills.get(i).getText());
	
		
		//To print the specific data
		
		if(Listskills.get(i).getText().equals("APIs")) {
			Listskills.get(i).click();
			break;
		}
	}
	

	WebElement Year = driver.findElement(By.id("yearbox"));
	WebElement Month = driver.findElement(By.xpath("//select[@placeholder=\"Month\"]"));
	WebElement Day = driver.findElement(By.id("daybox"));
	
	String Dob = ("1992/July/16");
	String Date [] = Dob.split("/");
	
	Drp(Year,Date[0]);
	Drp(Month,Date[1]);
	Drp(Day,Date[2]);
	}
	
	public static void Drp (WebElement element ,String value) {
		Select Drp = new Select (element);
		Drp.selectByValue(value);
		
	
		
		
		
		
	}
}


