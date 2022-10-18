package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Kite_with_DDF_Page2 {

	
	@FindBy(xpath="//input[@type=\"password\"]")
	WebElement pin;
	
	@FindBy(xpath = "//button[@type=\"submit\"]")
	WebElement Continue;
	
	 // Initialize the Constructor with same class name 
	public Kite_with_DDF_Page2 (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	// Utilize within a method with access level public
	
	public void pin(String PIN) {
		pin.sendKeys(PIN);
	}
	
	public void Continue() {
		Continue.click();
	}
}
