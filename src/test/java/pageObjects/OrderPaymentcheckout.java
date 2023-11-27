package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OrderPaymentcheckout extends BasePage {
	
public OrderPaymentcheckout(WebDriver driver) {
		
		super(driver);
	}
	
	
	   @FindBy(xpath="//div[@id='shipping-buttons-container']/input")
	   WebElement ShippingAddcontinue;
	   
	   @FindBy(xpath="//div[@id='shipping-method-buttons-container']/input")
	   WebElement ShippingMethodcontinue;
	   
	   @FindBy(xpath="//input[@id='paymentmethod_2']")
	   WebElement paymentmethod;
	   
	   @FindBy(xpath="//div[@id='payment-method-buttons-container']/input")
	   WebElement paymentmethodcontinue;
	   
	   @FindBy(xpath="//select[@id='CreditCardType']//option")
	   List<WebElement> paymentdetails;
	   
	   @FindBy(xpath="//input[@id='CardholderName']")
	   WebElement cardholdername;
	   
	   @FindBy(xpath="//input[@id='CardNumber']")
	   WebElement cardnumber;
	   
	   @FindBy(xpath="//select[@id='ExpireMonth']//option")
	   List<WebElement> expirymonth;
	   
	   @FindBy(xpath="//select[@id='ExpireYear']//option")
	   List<WebElement> expiryyear;
	   
	   @FindBy(xpath="//input[@id='CardCode']")
	   WebElement cardcode;
	   
	   @FindBy(xpath="//div[@id='payment-info-buttons-container']/input")
	   WebElement paymentinfocontinue;
	   
	   @FindBy(xpath="//div[@id='confirm-order-buttons-container']/input")
	   WebElement confirmorder;
	   
	   public void Continuebtnsclick() {
		   
		   try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		   
		   ShippingAddcontinue.click();
		   ShippingMethodcontinue.click();
		   paymentmethod.click();
		   paymentmethodcontinue.click();
		   
		  
	   }
	   
           public void creditcardtypeselection() {
        	   
		   for(WebElement element : paymentdetails)
			{
				if(element.getText().equalsIgnoreCase("Discover")) {
			
					element.click();
					break;
				}
			}

}
           public void carddetailsenter(String cardname, String cardnum, String cardcod) {
        	   cardholdername.sendKeys(cardname);
        	   cardnumber.sendKeys(cardnum);
        	   cardcode.sendKeys(cardcod);
        	   
           }
           
           public void expirymondate() {
        	   
        	   for(WebElement element : expirymonth)
   			{
   				if(element.getText().equalsIgnoreCase("11")) {
   			
   					element.click();
   					break;
   				}
   			}

        	   
           }
           
         public void expiryyeardate() {
        	   
        	   for(WebElement element : expiryyear)
   			{
   				if(element.getText().equalsIgnoreCase("2033")) {
   			
   					element.click();
   					break;
   				}
   			}

        	   
           }
         
         public void paymentinfocontinue() {
        	 paymentinfocontinue.click();
         }
         
         public void confirmorder() {
        	 confirmorder.click();
         }
         
         
}



