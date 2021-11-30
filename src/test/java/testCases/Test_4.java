package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.CartPage;
import pageObjects.HomePage;
import pageObjects.ShopPage;
import testBase.BaseClass;

public class Test_4 extends BaseClass {
	
	@Test
	public void testcase_4()
	{
		driver.get("http://jupiter.cloud.planittesting.com");
		driver.manage().window().maximize();
		
		HomePage hp=new HomePage(driver);
		hp.clickHome();
		hp.clickShop();
		
		ShopPage sp=new ShopPage(driver);
		sp.clickFluffyCow();
		sp.clickFluffyCow();
		sp.clickFluffyBunny();
		
		sp.clickCartButton();
		
		
		CartPage cp= new CartPage(driver);
		Assert.assertEquals(cp.FBCount(), 1);
		Assert.assertEquals(cp.FCCount(), 2);
	
	
	
		
		
		
		
	}
	
	

}
