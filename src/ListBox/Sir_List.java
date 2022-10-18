package ListBox;


	import java.util.List;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.Select;
	public class Sir_List {
		public static void main(String[] args) throws InterruptedException {

			System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.get("https://www.facebook.com/");
			
			Thread.sleep(5000);
			
			driver.findElement(By.xpath("//a[contains(text(),\"Create New Account\")]")).click();
			
			Thread.sleep(3000);
			
			WebElement day=driver.findElement(By.id("day"));
			WebElement month=driver.findElement(By.id("month"));
			WebElement year=driver.findElement(By.id("year"));
			
			Select selectday = new Select(day);
			
			//1 Q.How will u get total number of size
			
			List<WebElement>Listday = selectday.getOptions();
			System.out.println(Listday.size());
			
			//2. Q How will u print all the values from the list
			
			for(int i=0;i<Listday.size();i++) {
				
				String dayvalues = Listday.get(i).getText();
				
				System.out.println(dayvalues);
			
		    //Q 3 - How will you select specified values from list 
				
				if(dayvalues.equals("15")) {
					Listday.get(i).click();
				    break;
				}
			}
		}
	}

