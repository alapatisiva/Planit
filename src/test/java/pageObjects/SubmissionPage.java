package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SubmissionPage {
WebDriver driver;
	
	public SubmissionPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//strong[text()='Thanks Siva']")
	WebElement subMsg;
	
	public void sMsg()
	{
		subMsg.isDisplayed();
	}
	

	


}
