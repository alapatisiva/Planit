package testCases;

import org.testng.annotations.Test;

import pageObjects.ContactPage;
import pageObjects.HomePage;
import pageObjects.SubmissionPage;
import testBase.BaseClass;

public class Test_2 extends BaseClass{
	
	@Test
	public void testcase_2()
	{
		driver.get("http://jupiter.cloud.planittesting.com");
		driver.manage().window().maximize();
		
		HomePage hp=new HomePage(driver);
		hp.clickHome();
		hp.clickContact();
		
		ContactPage cp=new ContactPage(driver);
		cp.Forename("Siva");
		cp.Email("siva@gmail.com");
		cp.Msg("Test 2 Check");
		cp.Submit();
		
		SubmissionPage sp=new SubmissionPage(driver);
		sp.sMsg();
		
		
		
		
		
		
	}
	

}
