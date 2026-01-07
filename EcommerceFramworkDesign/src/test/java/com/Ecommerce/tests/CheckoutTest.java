package com.Ecommerce.tests;

import org.testng.annotations.Test;

import com.Ecommerce.Pages.CheckOutPage;

public class CheckoutTest{
	

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
	
}