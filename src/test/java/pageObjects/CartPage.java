package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {
WebDriver driver;
	

public CartPage(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver, this);
}

@FindBy(xpath="//td[text()=' Fluffy Bunny']/following-sibling::td[2]/input")
WebElement fBValue;

@FindBy(xpath="//td[text()=' Funny Cow']/following-sibling::td[2]/input")
WebElement fCValue;

public int FBCount()
{
	return Integer.parseInt(fBValue.getAttribute("value"));
}

public int FCCount()
{
	return Integer.parseInt(fCValue.getAttribute("value"));
}







	
	
	
	
	

}
