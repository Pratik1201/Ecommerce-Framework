package com.Ecommerce.tests;

import org.testng.annotations.Test;

import com.Ecommerce.Pages.LoginPage;

public class LoginTest {

	@Test
	public void loginTest() throws Exception {
		LoginPage lp = new LoginPage();
		lp.clickEmail();
		lp.enterEmail();
		lp.clickPassword();
		lp.enterPassword();
		lp.clickLoginButton();
	}

}

