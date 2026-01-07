package com.Ecommerce.Pages;

import com.Ecommerce.genericPage.CommonMethods;

public class MobileSelection extends CommonMethods {

	public MobileSelection() throws Exception {
		super();
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
	
	public void addCart() {
		clickWebElement("AddCart");
		
	}
	
	public void selectCart() {
		clickWebElement("SelectCart ");
	}
	
	


}
