package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Ordercompletedpage extends BasePage {
	
public Ordercompletedpage(WebDriver driver) {
		
		super(driver);
	}
	 
	 @FindBy(xpath="//div[@class='title']/strong")
	 WebElement successmsg;
	 
	 @FindBy(xpath="//ul[@class='details']/li")
	 WebElement ordernum;
	 
	 @FindBy(xpath="//a[text()='Log out']")
	 WebElement logout;
	 
	 public String messageverify() {
		 return successmsg.getText();
		 
	 }
	 
	 public void logoff() {
		 logout.click();
	 }
	 
	 public String ordernum() {
		 return ordernum.getText();
	 }
	 

	
	 
	 
	 
 
	

}
