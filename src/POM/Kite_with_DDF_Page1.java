package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Kite_with_DDF_Page1 {

	//Declare Globally with using Private access modifier
	
	@FindBy(xpath="//input[@id=\"userid\"]")
	WebElement userid;
	
	
	@FindBy(xpath = "//input[@id=\"password\"]")
	WebElement password;
	
	@FindBy(xpath="//button[@type=\"submit\"]")
	WebElement submit;
	
	//Initialize the constructor by using Pagefactory
	
	public Kite_with_DDF_Page1 (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	// Utilize within a method with access level public
	
	public void userid (String USERNAME) {
	userid.sendKeys(USERNAME);
	}
	
	public void password (String PASSWORD) {
		password.sendKeys(PASSWORD);
	
	}
	public void submit() {
		submit.click();
	}
	
	
	
}
