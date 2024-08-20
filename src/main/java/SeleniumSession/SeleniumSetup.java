package SeleniumSession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumSetup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Documents.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		
	}

}
