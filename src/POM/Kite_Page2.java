package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Kite_Page2 {

	
	@FindBy(xpath = "//input[@type=\"password\"]")
	WebElement pin;
	
	@FindBy(xpath = "//button[@type=\"submit\"]")
	WebElement submit;
	
	public Kite_Page2 (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void password() {
		pin.sendKeys("111000");
	}
	public void submit2() {
		submit.click();
	}
}
