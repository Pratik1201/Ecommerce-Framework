package com.Ecommerce.tests;

import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.Ecommerce.Pages.LoginPage;
import com.Ecommerce.genericPage.MasterPage;

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
	
	@AfterMethod
	public void takeScreenshot(ITestResult result2) throws Exception {
		LoginPage lp = new LoginPage();
		lp.captureScreenshot(result2);	
}
	@AfterClass
	public void closeLoginPage() {
		MasterPage.driver.close();
	}
}

