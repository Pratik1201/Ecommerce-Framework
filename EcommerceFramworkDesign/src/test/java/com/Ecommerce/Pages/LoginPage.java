package com.Ecommerce.Pages;

import com.Ecommerce.genericPage.CommonMethods;

public class LoginPage extends CommonMethods{

	public LoginPage() throws Exception {
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

	
}
