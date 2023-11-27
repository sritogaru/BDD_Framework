package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Shoppingcart extends BasePage {
public Shoppingcart(WebDriver driver) {
		
		super(driver);
	}
	
	@FindBy(xpath="//input[@name='discountcouponcode']")
	WebElement discount;
	
	@FindBy(xpath="//input[@name='applydiscountcouponcode']")
	WebElement applycoupon;
	
	@FindBy(xpath="//input[@id='termsofservice']")
	WebElement checkbox;
	
	@FindBy(xpath="//button[@id='checkout']")
	WebElement checkout;
	
	public void discountcode(String code) {
		discount.sendKeys(code);
	}
	
	public void Applycouponcode() {
		applycoupon.click();
	}
	
	public void termscheckbox() {
		checkbox.click();
	}
	
	public void checkoutbtn() {
		checkout.click();
	}

}
