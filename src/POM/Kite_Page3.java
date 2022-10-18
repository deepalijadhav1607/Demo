package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Kite_Page3 {

	@FindBy(xpath = "//span[contains(text(),\"GP8097\")]")
	WebElement Home;
	
	
	public Kite_Page3 (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void Home() {
	String ExpectedResult ="GP8097";
	if(ExpectedResult.equals(Home.getText())) {
	System.out.println("Valid ID ");
	}
	else {
		System.out.println("Invalid ID");
	}
	}
}
