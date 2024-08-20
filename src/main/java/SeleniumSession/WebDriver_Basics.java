package SeleniumSession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriver_Basics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//open the browser
		WebDriver driver = new ChromeDriver();
		//WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com");	
		//driver.get("https://www.flipkart.com");
		//get title
		String title = driver.getTitle();
		System.out.println("Page title: " +title);
		if(title.equals("Google")) {
			System.out.println("title is correct");
		}
		else {
			System.out.println("title is not correct");
			
		}
		//get url
		String url =driver.getCurrentUrl();
		System.out.println("page url : "+url);
		
		if(url.contains("google.com")) {
			System.out.println("url is correct");
		}
		else {
			System.out.println("url is not correct");
		}
		
		//close the browser
		//driver.close();
		driver.quit();
	}

}
