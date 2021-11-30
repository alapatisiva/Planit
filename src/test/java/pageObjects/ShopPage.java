package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShopPage {

	WebDriver driver;
	
	public ShopPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//li[@id='product-4']//a[text()='Buy']")
	WebElement btnFluffyBunny;
	
	@FindBy(xpath="//li[@id='product-6']//a[text()='Buy']")
	WebElement btnFluffyCow;
	
	@FindBy(xpath="//a[contains(text(),'Cart')]")
	WebElement btnCart;
	
	
	
	public void clickFluffyBunny()
	{
		btnFluffyBunny.click();
	}
	
	public void clickFluffyCow()
	{
		btnFluffyCow.click();
	}
	
	public void clickCartButton()
	{
		btnCart.click();
	}
	


}
