package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EnterRegisterValues {

	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		ElementUtil eleUtil = new ElementUtil(driver);
		
		
		By forgotpwd = By.linkText("Forgotten Password");
		By emailId = By.id("input-email");
		
		
		driver.findElement(emailId).sendKeys("test@gmail.com");
		String val = eleUtil.doGetAttribute(emailId, "value");
		System.out.println(val);
	
	}

	

}
