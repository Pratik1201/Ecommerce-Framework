package com.Ecommerce.tests;

import org.testng.annotations.Test;

import com.Ecommerce.Pages.End2EndTestingPage;


public class End2EndTestingWebsite {

	@Test
	public void loginTest() throws Exception {
		End2EndTestingPage et = new End2EndTestingPage();
		et.clickEmail();
		et.enterEmail();
		et.clickPassword();
		et.enterPassword();
		et.clickLoginButton();
		et.clickElectronics();
		et.selectMobile();
		et.clickOnMobile();
		et.clickOnAddCart();
		et.selectCart();
		et.clickOnCheckout();
		et.enterFirstName();
		et.enterLastName();
		et.enterPersonEmail();
		et.enterMobileNumber();
		et.enterAddress();
		et.enterState();
		et.enterCity();
		et.enterPincode();
		et.clickOnContinue();
		et.placeOrder();
		et.displayMessage();
		et.closeBrowser();
	}

}

