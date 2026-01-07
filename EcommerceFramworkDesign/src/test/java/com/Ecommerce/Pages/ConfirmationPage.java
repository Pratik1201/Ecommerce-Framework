package com.Ecommerce.Pages;

import com.Ecommerce.genericPage.CommonMethods;

public class ConfirmationPage extends CommonMethods{

	public ConfirmationPage() throws Exception {
		super();
	}
	
	public void placeOrder() {
		clickWebElement("PlaceOrder");
	}
	
	public void displayMessage() {
		getWebElementText("Message");
	}
	
	

}
