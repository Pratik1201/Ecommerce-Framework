package com.Ecommerce.tests;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.Ecommerce.Pages.CheckOutPage;
import com.Ecommerce.Pages.LoginPage;

public class CheckoutTest {
	
	@Test
	public void checkout() throws Exception {
		CheckOutPage cp = new CheckOutPage();
		cp.clickOnCheckout();
		cp.enterFirstName();
		cp.enterLastName();
		cp.enterPersonEmail();
		cp.enterMobileNumber();
		cp.enterAddress();
		cp.enterState();
		cp.enterCity();
		cp.enterPincode();
		cp.clickOnContinue();
	}
	
	@AfterMethod
	public void takeScreenshot(ITestResult result2) throws Exception {
		LoginPage lp = new LoginPage();
		lp.captureScreenshot(result2);

}
}