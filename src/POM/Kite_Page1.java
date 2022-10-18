package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Kite_Page1 {

	//POM WITHOUT DDF 
	
	// Declare globally
	  @FindBy(xpath = "//input[@id=\"userid\"]")
      WebElement UserID;
	  
	  @FindBy (xpath = "//input[@id=\"password\"]")
	  WebElement Password;
	  
	  @FindBy (xpath = "//button[@type=\"submit\"]")
	  WebElement Login;
	  
	  //Initilize  within Constructor
	  
	  public Kite_Page1 (WebDriver driver) {
	  PageFactory.initElements(driver, this);
	  
	  
	  }
	  public void userid() {
		  UserID.sendKeys("GP8097");
		    
	  }
	  public void password() {
		  Password.sendKeys("gms@0110");
	  }
	  public void Submit() {
		  Login.click();
	  }
}
