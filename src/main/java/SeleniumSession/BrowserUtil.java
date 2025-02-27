package SeleniumSession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class BrowserUtil {

	WebDriver driver;
	
	public WebDriver launchBrowser(String browserName) {
		System.out.println("the browser name: "+browserName);
		
		switch (browserName.trim().toLowerCase()) {
		case "chrome" :
			driver = new ChromeDriver();
			break;
			
		case "firefox" :
			driver = new FirefoxDriver();
			break;
		case "edge" :
				driver = new EdgeDriver();
				break;
		case "safari" :
			driver = new SafariDriver();
			break;

		default:
			System.out.println("pls pass right browser.."+browserName);
			throw new BrowserException("INVALID BROWSER.." + browserName);
			
		}
		return driver;
	}
//_________________________________________________
	
	public void launchURL(String url) {
		if(url==null) {
			throw new BrowserException("INVALID URL.." + url);
			}
		if(url.isBlank() || url.isEmpty()) {
			throw new BrowserException("INVALID URL.." + url);
		}
		
		//https://www.google.com
		if(url.indexOf("http")==-1 || url.indexOf("http")>0) {
			throw new BrowserException("HTTP(s) is missing.." + url);
		}
		driver.get(url.trim());
	}
	
//________________________________________________________________
	
	public String getPageTitle() {
		String title = driver.getTitle();
		if(title==null) {
			System.out.println("getting the null title..");
			return null;
		}
		return title;
	}
	
	public String getPageCurrentURL() {
		return driver.getCurrentUrl();
	}
	
	public void quitBrowser() {
		driver.quit();
	}
	
	public void closetBrowser() {
		driver.close();
	}
	
}
