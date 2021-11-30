package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
		WebDriver driver;
		
		public HomePage(WebDriver driver)
		{
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}
		
		@FindBy(xpath="//li[@id='nav-home']")
		WebElement lnkHome;
		
		@FindBy(xpath="//li[@id='nav-shop']")
		WebElement lnkShop;
		
		@FindBy(xpath="//li[@id='nav-contact']")
		WebElement lnkContact;
		
		@FindBy(xpath="//li[@id='nav-login']")
		WebElement lnkLogin;
		
		@FindBy(xpath="//li[@id='nav-cart']")
		WebElement lnkCart;
		
		@FindBy(xpath="//a[@class='btn btn-success btn-large']")
		WebElement btnStartShopping;
		
		
		public void clickHome()
		{
			lnkHome.click();
		}
		
		public void clickShop()
		{
			lnkShop.click();
		}

		public void clickContact()
		{
			lnkContact.click();
		}
		
		public void clickLogin()
		{
			lnkLogin.click();
		}

		public void clickCart()
		{
			lnkCart.click();
		}
		
		public void clickStartShopping()
		{
			btnStartShopping.click();
		}
	


}
