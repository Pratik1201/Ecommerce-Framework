package com.Ecommerce.Pages;

import com.Ecommerce.genericPage.CommonMethods;

public class CheckOutPage extends CommonMethods{

	public CheckOutPage() throws Exception {
		super();
	}
	
	public void clickOnCheckout() {
		clickWebElement("CheckOut");
	}
	
	public void enterFirstName() {
		enterData("FirstName", "TestData3");
	}
	
	public void enterLastName() {
		enterData("LastName", "TestData4");
	}
	
	public void enterPersonEmail() {
		enterData("PersonEmail", "TestData5");
	}
	
	public void enterMobileNumber() {
		enterData("MobileNumber", "TestData6");
	}
	
	public void enterAddress() {
		enterData("Address", "TestData7");
	}
	
	public void enterState() {
		enterData("State", "TestData8");
	}
	
	public void enterCity() {
		enterData("City", "TestData9");
	}
	
	public void enterPincode() {
		enterData("Pincode", "TestData10");
	}
	
	public void clickOnContinue() {
		clickWebElement("ContinueButton");
	}
	

}
