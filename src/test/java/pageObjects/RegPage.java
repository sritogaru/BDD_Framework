package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegPage extends BasePage {
	
public RegPage(WebDriver driver) {
		
		super(driver);
	}
	
	
	
	@FindBy(xpath = "//input[@id='gender-male']")
	WebElement Gender;
	
	@FindBy(xpath="//input[@id='FirstName']")
	WebElement Fname;
	
	@FindBy(xpath="//input[@id='LastName']")
	WebElement Lname;
	
	@FindBy(xpath="//input[@id='Email']")
	WebElement email;
	
	@FindBy(xpath="//input[@id='Password']")
	WebElement pwd;
	
	@FindBy(xpath="//input[@id='ConfirmPassword']")
	WebElement conpwd;
	
	@FindBy(xpath="//input[@id='register-button']")
	WebElement Regbtn;
	
	public void Genclick() {
		
		Gender.click();
	}	
		public void Regclick() {
		Regbtn.click();
		
	}
	
	public void Regdetails(String FN, String LN,String Mail,String Passwd, String Conpasswd) {
	
		Fname.sendKeys(FN);
		Lname.sendKeys(LN);
		email.sendKeys(Mail);
		pwd.sendKeys(Passwd);
		conpwd.sendKeys(Conpasswd);
			
	}
	
	public void regsuccessmsg() {
		
		
	}

}



  
