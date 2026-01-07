package com.Ecommerce.tests;

import org.testng.annotations.Test;

import com.Ecommerce.Pages.CheckOutPage;
import com.Ecommerce.Pages.ConfirmationPage;
import com.Ecommerce.Pages.LoginPage;
import com.Ecommerce.Pages.MobileSelection;

public class End2EndTesting {
	
	@Test
	public void loginTest() throws Exception{
		LoginPage lp = new LoginPage();
		lp.clickEmail();
		lp.enterEmail();
		lp.clickPassword();
		lp.enterPassword();
		lp.clickLoginButton();
		
		MobileSelection ms = new MobileSelection();
		ms.clickElectronics();
		ms.selectMobile();
		ms.clickOnMobile();
		ms.addCart();
		ms.selectCart();
		
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
		
		ConfirmationPage cmp = new ConfirmationPage();
		cmp.placeOrder();
		cmp.displayMessage();
	}

}

