package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShoppingContinuePage extends BasePage {
public ShoppingContinuePage(WebDriver driver) {
		
		super(driver);
	}
	
	
	@FindBy(xpath = "//input[@class='button-1 register-continue-button']")
	WebElement Continue;
	
	@FindBy(xpath = "//div[@class='listbox']/ul/li[4]/a")
	WebElement Jewelrytopclick;
	
	@FindBy(xpath="//input[@class='button-2 product-box-add-to-cart-button']")
	WebElement Addtocart;
	
	@FindBy(xpath="//input[@id='add-to-cart-button-5']")
	WebElement itemAddCart;
	
	@FindBy(xpath="//div[@class='header-links']/ul/li[3]/a/span")
	WebElement shoppingcart;
	
	public void continuebtn() {
		Continue.click();
	}
	
	public void jewelrybtnclick() {
		Jewelrytopclick.click();
	}
    
	public void Addtocartclick() {
		Addtocart.click();
	}
	
	public void innerAddcartclick() {
		itemAddCart.click();
	}
	
	public void shoppingcartclick() {
		shoppingcart.click();
	}
}
