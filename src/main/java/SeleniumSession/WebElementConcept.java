package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementConcept {
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		//1.
		//driver.findElement(By.id("input-email")).sendKeys("madagonishivani3@gmail.com");
		//driver.findElement(By.id("input-password")).sendKeys("Shivani@333");
		
		//2.
		//WebElement emailId = driver.findElement(By.id("input-email"));
		//WebElement password = driver.findElement(By.id("input-password"));
		
		//emailId.sendKeys("madagonishivani3@gmail.com");
		//password.sendKeys("Shivani@333");
		
		//3.By locator:
//		By emailId = By.id("input-email");
//		By password = By.id("input-password");
		
//   	WebElement emailId_ele = driver.findElement(emailId);
//	    WebElement pwd_ele = driver.findElement(password);

//		emailId_ele.sendKeys("madagonishivani3@gmail.com");
//		pwd_ele.sendKeys("Shivani@333");
		
		
		//4. By locator + generic function for webelements
		
/*		By emailId = By.id("input-email");
		By password = By.id("input-password");
		
		getElement(emailId).sendKeys("madagonishivani3@gamil.com");
		getElement(password).sendKeys("Shivani@333");
	}
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);*/
	
	
	//5. By locator + generic function for webelements and sendkeys
		
	/*	By emailId = By.id("input-email");
		By password = By.id("input-password");
		
	doSendKeys(emailId,"madagonishivani3@gamil.com");
	doSendKeys(password,"Shivani@333");

	
	}
	
	public static void doSendKeys(By locator, String value) {
		getElement(locator).sendKeys(value);
	}
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
}
*/
		
		//6.By locator + generic function for webelements and sendkeys: ElementUtil
		By emailId = By.id("input-email");
		By password = By.id("input-password");
		
		ElementUtil eleUtil = new ElementUtil(driver);
		eleUtil.doSendKeys(emailId,"madagonishivani3@gamil.com");
		eleUtil.doSendKeys(password,"Shivani@333");

	}
	public void doSendKeys(By locator, String value) {
		getElement(locator).sendKeys(value);
	}
	public WebElement getElement(By locator) {
		return driver.findElement(locator);
}
		
		
		
}
