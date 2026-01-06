package Selenium_2026.Selenium_2026;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.HashMap;
import java.util.Map;

public class Ecommerce_End2End {
	static WebDriver driver;
	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		Map<String, Object> prefs = new HashMap<>();
        prefs.put("credentials_enable_service", false);
        prefs.put("profile.password_manager_enabled", false);
        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("prefs", prefs);
		driver.get("https://shop.qaautomationlabs.com");
		driver.findElement(By.id("email")).sendKeys("demo@demo.com");
		driver.findElement(By.id("password")).sendKeys("demo");
		driver.findElement(By.id("loginBtn")).click();
		System.out.println(driver.getTitle());
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)");
		driver.findElement(By.xpath("//a[@href='electronics.php'][@class='btn btn-primary']")).click();
		driver.findElement(By.xpath("//label[contains(text(),'Mobile')]")).click();
		js.executeScript("window.scrollBy(0,150)");
		driver.findElement(By.xpath("//a[contains(text(),'LG Mobile')]")).click();
		js.executeScript("window.scrollBy(0,100)");
		driver.findElement(By.xpath("//button[contains(text(),'Add to Cart')]")).click();
		driver.findElement(By.id("cartdesk")).click();
		driver.findElement(By.id("checkoutBtn")).click();
		driver.findElement(By.id("firstname")).sendKeys("John");
		driver.findElement(By.id("lastname")).sendKeys("Cena");
		driver.findElement(By.id("email")).sendKeys("john.cena@gmail.com");
		driver.findElement(By.id("phone")).sendKeys("6753414345");
		driver.findElement(By.id("address")).sendKeys("At Post. UK");
		driver.findElement(By.id("states")).sendKeys("UK");
		driver.findElement(By.id("city")).sendKeys("New York");
		driver.findElement(By.id("pincode")).sendKeys("654301");
		driver.findElement(By.cssSelector("#continue")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Place Order')]")).click();
		WebElement order = driver.findElement(By.xpath("//div[@class='bg-light p-30 mb-5 text-center']"));
		System.out.println(order.getText());
		driver.quit();
	}

}
