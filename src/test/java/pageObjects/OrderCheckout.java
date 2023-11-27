package pageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class OrderCheckout extends BasePage {
	
public OrderCheckout(WebDriver driver) {
		
		super(driver);
	}
 
   @FindBy(xpath="//select[@id='BillingNewAddress_CountryId']//option")
   List<WebElement> countryselect;
   
   @FindBy(xpath = "//input[@id='BillingNewAddress_City']")
   WebElement City;
   
   @FindBy(xpath="//input[@id='BillingNewAddress_Address1']")
   WebElement Address1;
   
   @FindBy(xpath="//input[@id='BillingNewAddress_ZipPostalCode']")
   WebElement zipcode;
   
   @FindBy(xpath="//input[@id='BillingNewAddress_PhoneNumber']")
   WebElement phonenumber;
   
   @FindBy(xpath="//input[@title='Continue']")
   WebElement Continue;
   
   
   
   public void countryselection() {
	   
		   
		   for(WebElement element : countryselect)
			{
				if(element.getText().equalsIgnoreCase("United States"))
				{
					element.click();
					break;
				}
			}}
   
   public void customerdetails(String cityy, String add1, String zip, String num) {
	   City.sendKeys(cityy);
	   Address1.sendKeys(add1);
	   zipcode.sendKeys(zip);
	   phonenumber.sendKeys(num);
	   Continue.click();
	   
   }
   }
   
   
	

