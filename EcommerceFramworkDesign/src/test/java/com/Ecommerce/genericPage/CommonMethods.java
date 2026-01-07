package com.Ecommerce.genericPage;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestResult;

import java.io.File;

public class CommonMethods extends MasterPage{

	public CommonMethods() throws Exception {
		super();
	}
	
	public void getWebElementText(String xpathkey) {
		String getTextOfWebElement = driver.findElement(By.xpath(loc.getProperty(xpathkey))).getText();
		System.out.println(getTextOfWebElement);
	}
	
	public void clickWebElement(String xpathkey) {
		driver.findElement(By.xpath(loc.getProperty(xpathkey))).click();
	}
	
	public void enterData(String xpathkey, String testdata) {
		driver.findElement(By.xpath(loc.getProperty(xpathkey))).sendKeys(td.getProperty(testdata));
	}
	
	public void selectCheckbox(String xpathkey) {
		driver.findElement(By.xpath(loc.getProperty(xpathkey)));
	}
	
	public void captureScreenshot(ITestResult result) throws Exception {
		if(ITestResult.FAILURE==result.getStatus());
		TakesScreenshot ts = (TakesScreenshot)driver;
		File sourceFile = ts.getScreenshotAs(OutputType.FILE);
		File destFolder = new File ("./screenshot/" + result.getName()+ ".png");
		FileUtils.copyFile(sourceFile, destFolder);
		System.out.println(result.getName() + "method failed, screenshot captured");
	}

}
