package com.Ecommerce.genericPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class MasterPage {
	public static WebDriver driver;
	public Properties prop;
	public Properties loc;
	public Properties td;
	
	public MasterPage() throws Exception{
		FileInputStream ip = new FileInputStream("C:\\Users\\Sumit\\git\\Ecommerce-Framework\\EcommerceFramworkDesign\\src\\test\\java\\com\\Ecommerce\\repository\\configuration.properties");
		prop = new Properties();
		prop.load(ip);
		
		FileInputStream fs = new FileInputStream("C:\\Users\\Sumit\\git\\Ecommerce-Framework\\EcommerceFramworkDesign\\src\\test\\java\\com\\Ecommerce\\repository\\locators.properties");
		loc = new Properties();
		loc.load(fs);
		
		FileInputStream ts = new FileInputStream("C:\\Users\\Sumit\\git\\Ecommerce-Framework\\EcommerceFramworkDesign\\src\\test\\java\\com\\Ecommerce\\repository\\testdata.properties");
		td = new Properties();
		td.load(ts);
		
		if(prop.getProperty("browser").equalsIgnoreCase("chrome")){
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		else if(prop.getProperty("browser").equalsIgnoreCase("firefox")){
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		else if(prop.getProperty("browser").equalsIgnoreCase("edge")){
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		else {
			System.out.println("No browser details are found");
		}
		
		driver.manage().window().maximize();
		Map<String, Object> prefs = new HashMap<>();
        prefs.put("credentials_enable_service", false);
        prefs.put("profile.password_manager_enabled", false);
        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("prefs", prefs);
		driver.get(prop.getProperty("url"));
		
	}

}
