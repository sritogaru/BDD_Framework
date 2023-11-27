package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {
	
public LoginPage(WebDriver driver) {
		
		super(driver);
	}
	
	@FindBy(linkText = "Log in")
	WebElement loginlink; 
	
	@FindBy(xpath = "//input[@id = 'Email']")
	WebElement emailid;
	
	@FindBy(xpath = "//input[@id = 'Password']")
	WebElement password;
	
	
	@FindBy(xpath = "//input[@class='button-1 login-button']")
	WebElement logbtn;
	
	@FindBy(xpath="//a[text()='Log out']")
	 WebElement logout;

	public void loginlinkclick() {
		loginlink.click();
	}
	
	public void credentials(String id, String pwd) {
		emailid.sendKeys(id);
		password.sendKeys(pwd);
		
	}
	
	public void loginsubmit() {
		logbtn.click();
	}
	
	
	
	public void logout() {
		 logout.click();
	 }
}

