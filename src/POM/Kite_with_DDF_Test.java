package POM;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Kite_with_DDF_Test {

	private static final String SUBMIT = null;

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Installer\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		FileInputStream File = new FileInputStream("C:\\Users\\Admin\\Downloads\\kite.xlsx");
		Sheet Sheet1 = WorkbookFactory.create(File).getSheet("Sheet1");
		
        driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.get("https://kite.zerodha.com/");

		Kite_with_DDF_Page1 KP1 = new Kite_with_DDF_Page1(driver);
		
		String USERNAME = Sheet1.getRow(0).getCell(0).getStringCellValue();
		KP1.userid(USERNAME);
		
		String PASSWORD = Sheet1.getRow(0).getCell(1).getStringCellValue();
		KP1.password(PASSWORD);
		
		KP1.submit();
		
		Kite_with_DDF_Page2 KP2 = new Kite_with_DDF_Page2(driver);
		
		String PIN = Sheet1.getRow(0).getCell(2).getStringCellValue();
		KP2.pin(PIN);
		
		KP2.Continue();
		
		Thread.sleep(2000);
		Kite_with_DDF_Page3 KP3 = new Kite_with_DDF_Page3(driver);
		String home = Sheet1.getRow(1).getCell(0).getStringCellValue();
		KP3.UserID1(home);
	}
		
	}

