package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Homepage extends BasePage {
	
public Homepage(WebDriver driver) {
		
		super(driver);
	}
	
	@FindBy(xpath = "//a[text()='Register']")
	WebElement Register;
	
	public void Regbtnclick() {
		
		Register.click();
	}
}