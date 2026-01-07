package com.Ecommerce.tests;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.Ecommerce.Pages.LoginPage;
import com.Ecommerce.Pages.MobileSelection;

public class MobileSelectionTest {
	
	@Test
	public void mobileSelection() throws Exception {
		MobileSelection ms = new MobileSelection();
		ms.clickElectronics();
		ms.selectMobile();
		ms.clickOnMobile();
		ms.addCart();
		ms.selectCart();
		
	}
	
	@AfterMethod
	public void takeScreenshot(ITestResult result2) throws Exception {
		LoginPage lp = new LoginPage();
		lp.captureScreenshot(result2);
	

}
}
