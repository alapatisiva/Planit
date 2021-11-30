package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactPage {
WebDriver driver;
	
	public ContactPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//input[@id='forename']")
	WebElement txtForename;
	
	@FindBy(xpath="//input[@id='surname']")
	WebElement txtSurname;
	
	@FindBy(xpath="//input[@id='email']")
	WebElement txtEmail;
	
	@FindBy(xpath="//input[@id='telephone']")
	WebElement txtTelephone;
	
	@FindBy(xpath="//textarea[@id='message']")
	WebElement txtMessage;
	
	@FindBy(xpath="//a[text()='Submit']")
	WebElement btnSubmit;
	
	@FindBy(xpath="//span[text()='Forename is required']")
	WebElement fnameErrorMsg;
	
	@FindBy(xpath="//span[text()='Email is required']")
	WebElement emailErrorMsg;
	
	@FindBy(xpath="//span[text()='Message is required']")
	WebElement msgErrorMsg;
	
	@FindBy(xpath="//span[text()='Please enter a valid email']")
	WebElement msgValidEmailError;
	
	
	public void Forename(String fname)
	{
	
		txtForename.sendKeys(fname);
	}
	
	public void Surname(String sname)
	{
		txtSurname.sendKeys(sname);
	}
	
	public void Email(String email)
	{
		txtEmail.sendKeys(email);
	}
	
	public void Telephone(String tel)
	{
		txtTelephone.sendKeys(tel);
	}
	
	public void Msg(String msg)
	{
		txtMessage.sendKeys(msg);
	}
	
	public void Submit()
	{
		btnSubmit.click();
	}
	
	public String fnameMsg()
	{
		return(fnameErrorMsg.getText());
	}
	
	public String emailMsg()
	{
		return(emailErrorMsg.getText());
	}
	
	public String msgMsg()
	{
		return(msgErrorMsg.getText());
	}
	
	public int dFMsg()
	{
		List<WebElement> list=driver.findElements(By.xpath("//span[text()='Forename is required']"));
		return list.size();
	}

	public int eEMsg()
	{
		List<WebElement> list= driver.findElements(By.xpath("//span[text()='Email is required']"));
		return list.size();
	}
	
	public int mEMsg()
	{
		List<WebElement> list= driver.findElements(By.xpath("//span[text()='Message is required']"));
		 return list.size();
	}
	public String msgValidEmailMessage()
	{
		return(msgValidEmailError.getText());
	}
 
}
