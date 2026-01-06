package com.Ecommerce.genericPage;

import org.openqa.selenium.By;

public class CommonMethods extends MasterPage{

	public CommonMethods() throws Exception {
		super();
	}
	public void enterData(String xpathkey, String testdata) {
		driver.findElement(By.id(loc.getProperty(xpathkey))).sendKeys(td.getProperty(testdata));
	}

}
