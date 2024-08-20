package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaleElementReferenceException {

	

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");


//		driver.findElement(By.id("input-email")).sendKeys("naveen@gmail.com");
//		driver.navigate().refresh();
//		driver.findElement(By.id("input-email")).sendKeys("suma@gmail.com");
//or
	
//		WebElement emailId =driver.findElement(By.id("input-email"));
//		emailId.sendKeys("naveen@gmail.com");
//		Thread.sleep(2000);
//		
//
//		driver.navigate().refresh();
//		Thread.sleep(2000);
//
//		emailId =driver.findElement(By.id("input-email"));
//		emailId.sendKeys("suma@gmail.com");

		
		By email_ele =By.id("input-email");
		getElement(email_ele).sendKeys("naveen@gmail.com");
		driver.navigate().refresh();
		getElement(email_ele).sendKeys("suma@gmail.com");
		
	}
	
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
}