package SeleniumSession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.decorators.WebDriverDecorator;

public class AuthPopUpHandle {

	public static void main(String[] args) {

		//WebDriver driver = new ChromeDriver();
		WebDriver driver = new ChromeDriver();
		
		
		String username = "admin";
		String password = "admin";
		
		driver.get("https://\"+username+\":\"+password+\"@\"+\"the-internet.herokuapp.com/basic_auth");
		
		//Basic Auth
		
	}

}
