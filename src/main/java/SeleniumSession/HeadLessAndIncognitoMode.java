package SeleniumSession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class HeadLessAndIncognitoMode {

	public static void main(String[] args) {

		//headless mode:
		//no browser - blocking the browser visibility
		//faster
		//not recommended - no user exp
		//when to use ?- headless based OS - linux, docker, vm
		//for simple and small test cases --yes
		//it might not work with complex html components
		
		
		
		ChromeOptions co =new ChromeOptions();
		//co.addArguments("--headless");
		co.addArguments("--incognito");
		
//		FirefoxOptions fo =new FirefoxOptions();
//		fo.addArguments("--headless--");
//		
//		EdgeOptions eo =new EdgeOptions();
//		eo.addArguments("--headless--");
//		
		
		WebDriver driver = new ChromeDriver(co);
		//WebDriver driver = new FirefoxDriver(fo);
		//WebDriver driver = new EdgeDriver(eo);
	

		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
		
		//driver.quit();
	}

}
