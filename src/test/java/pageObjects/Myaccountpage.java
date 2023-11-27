package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



public class Myaccountpage extends BasePage {
	
public Myaccountpage(WebDriver driver) {
		super(driver);
		
	}

	@FindBy(xpath="//div[@class='header-links']/ul/li[1]/a")
	WebElement myaccount;
	
	@FindBy(xpath="//div[@class='page-title']/h1")
	WebElement myaccountdetails;
	
	
	@FindBy(xpath="//div[@class='header-links']/ul/li[2]/a")
	 WebElement logout;
	
	
	public void myaccountclick() {
		myaccount.click();
	}
	
	public boolean myaccountdetailsdisplayed() {
		return myaccountdetails.isDisplayed();
		
	}
	
	
	public void logout() {
		 logout.click();
	 }

}
