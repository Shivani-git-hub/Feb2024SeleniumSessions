package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementConceptWithException {

	static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			driver = new ChromeDriver();
			driver.get("https://demo.opencart.com/index.php?route=account/login&language=en-gb");
	//		try {
	//		driver.findElement(By.id("input-email11")).sendKeys("test@gmail.com");
	//		}catch (NoSuchElementException e) {
	//			e.printStackTrace();
	//		}
			
			
			//NSE
			driver.findElement(By.id("input-password")).sendKeys(null);
		
	}

}
