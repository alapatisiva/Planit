package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.ContactPage;
import pageObjects.HomePage;
import testBase.BaseClass;

public class Test_3 extends BaseClass{
	@Test
	public void testcase_3 ()
	{
		driver.get("http://jupiter.cloud.planittesting.com");
		driver.manage().window().maximize();
		
		HomePage hp=new HomePage(driver);
		hp.clickHome();
		hp.clickContact();
		
		ContactPage cp=new ContactPage(driver);
		cp.Forename("@123Siva");
		cp.Email("siva@gmail"); 
		cp.Msg("Test 2 Ckeck");

	
		Assert.assertEquals(cp.msgValidEmailMessage(), "Please enter a valid email");
		
	}
	


}
