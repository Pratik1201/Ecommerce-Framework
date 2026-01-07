package com.Ecommerce.tests;

import org.testng.annotations.Test;

import com.Ecommerce.Pages.MobileSelection;

public class MobileSelectionTest{
	
	@Test
	public void mobileSelection() throws Exception {
		MobileSelection ms = new MobileSelection();
		ms.clickElectronics();
		ms.selectMobile();
		ms.clickOnMobile();
		ms.addCart();
		ms.selectCart();
		
	}
	
}
