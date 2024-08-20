package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BrowserUtil brUtil = new BrowserUtil();
		WebDriver driver = brUtil.launchBrowser("chrome");
		
		brUtil.launchBrowser("https://demo.opencart.com/index.php?route=account/login&language=en-gb");
		
		System.out.println(brUtil.getPageCurrentURL());
		System.out.println(brUtil.getPageCurrentURL());
		
		By emailId = By.id("input-email");
		By password = By.id("input-password");
		
		ElementUtil eleUtil = new ElementUtil(driver);
		eleUtil.doSendKeys(emailId, "madagonishivani3@gamil.com");
		eleUtil.doSendKeys(password, "Shivani@333");
		
		brUtil.closetBrowser();
		
	}

}
