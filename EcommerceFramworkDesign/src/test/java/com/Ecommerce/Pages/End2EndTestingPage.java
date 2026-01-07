package com.Ecommerce.Pages;

import com.Ecommerce.genericPage.CommonMethods;

public class End2EndTestingPage extends CommonMethods{

	public End2EndTestingPage() throws Exception {
		super();
		
	}
	public void clickEmail() {
		clickWebElement("Email");
	}
	public void enterEmail() {
		enterData("Email","TestData1");
	}
	public void clickPassword() {
		clickWebElement("Password");
	}
	public void enterPassword() {
		enterData("Password","TestData2");
	}
	public void clickLoginButton() {
		clickWebElement("LoginButton");
	}
	public void clickElectronics() {
		clickWebElement("Electronics");
	}
	
	public void selectMobile() {
		selectCheckbox("MSelector");
	}
	
	public void clickOnMobile() {
		clickWebElement("Mobile");
	}
	
	public void clickOnAddCart() {
		clickWebElement("AddCart");
		
	}
	
	public void selectCart() {
		clickWebElement("SelectCart");
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
	public void placeOrder() {
		clickWebElement("PlaceOrder");
	}
	
	public void displayMessage() {
		getWebElementText("Message");
	}
	
	public void closeBrowser() {
		driver.quit();
	}

	
}
