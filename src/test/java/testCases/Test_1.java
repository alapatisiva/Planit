package testCases;


import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.ContactPage;
import pageObjects.HomePage;
import testBase.BaseClass;

public class Test_1 extends BaseClass{
	
		
		@Test(groups= {"sanity"})
		public void testcase_1() 
		{
			driver.get(rb.getString("appURL"));
			logger.info("Home Page Opened");
			driver.manage().window().maximize();
			logger.info("Window Maximized");
			
			
			HomePage hp=new HomePage(driver);
			hp.clickHome();
			logger.info("Clicked On home Page");
			
			hp.clickContact();
			
			ContactPage cp=new ContactPage(driver);
			cp.Submit();
			
			
			String fMsg=cp.fnameMsg();
			 
			if(fMsg.equals("Forename is required"))
			{
				Assert.assertTrue(true);
				cp.Forename("Siva");
				
			}		
			
			String eMsg=cp.emailMsg();
			if(eMsg.equals("Email is required"))
			{
				Assert.assertTrue(true);
				cp.Email("siva@gmail.com");
				
			}
			
			String mMsg=cp.msgMsg();
			if(mMsg.equals("Message is required"))
			{
				Assert.assertTrue(true);
				cp.Msg("It is Working");
				
			}
			 
			Assert.assertEquals(cp.dFMsg(), 0);
			Assert.assertEquals(cp.eEMsg(), 0);
			Assert.assertEquals(cp.mEMsg(), 0);
			
			logger.info("program finished");
			
			
			
			
		
			
			
			
			
		}

}
