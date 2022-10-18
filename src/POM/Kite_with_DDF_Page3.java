package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Kite_with_DDF_Page3 {

	@FindBy(xpath="//span[contains(text(),\"GP8097\")]")
	WebElement Home;
	
	public Kite_with_DDF_Page3 (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
public void UserID1(String ExpectedUserID) {
		
		String ActulaUSerID = Home.getText();
		if(ExpectedUserID.equals(ActulaUSerID)) {
			System.out.println("Valid UserID");
		}
		else
			System.out.println("Invalid UserID");
	}

	
	
}
