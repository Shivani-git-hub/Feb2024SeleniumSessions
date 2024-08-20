package SeleniumSession;

import java.util.Properties;

import org.openqa.selenium.WebDriver;

public class OpenCartTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//String browser= "chrome"; Properties so no use no hardcode values
		ReadProperty propReader = new ReadProperty();
		Properties prop = propReader.initProp();
		
		BrowserUtil brUtil = new BrowserUtil();
		WebDriver driver= brUtil.launchBrowser(prop.getProperty("browser"));
		brUtil.launchURL(prop.getProperty("url"));
		String actTitle = brUtil.getPageTitle();
		System.out.println("Page title: "+ actTitle);
		if(actTitle.equals("Your Store")) {
			System.out.println("title is correct");
		}
		else {
			System.out.println("titleis not correct");
		}
		
		String appUrl= brUtil.getPageCurrentURL();
		System.out.println(appUrl);
		if(appUrl.contains("opencart")) {
			System.out.println("URL is correct");
		}
		else {
			System.out.println("URL is not correct");
		}
		brUtil.quitBrowser();
		
	}

}
