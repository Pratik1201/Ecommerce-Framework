package com.Ecommerce.tests;

import org.testng.annotations.Test;

import com.Ecommerce.Pages.ConfirmationPage;

public class ConfirmationpageTest{

	@Test
	public void confirmation() throws Exception{
		ConfirmationPage cmp = new ConfirmationPage();
		cmp.placeOrder();
		cmp.displayMessage();	
	}
	

}
