package SeleniumSession;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttributeList {

	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
	
//		By images = By.tagName("img");
//		getElementAttributeList(images, "src");
//		System.out.println("______________");
//		getElementAttributeList(images, "alt");
//		System.out.println("______________");
//		getElementAttributeList(images, "style");

		By Links = By.tagName("a");
		
		getElementAttributeList(Links,"href");
		getElementAttributeList(Links,"title");



	}
	
	public static List<String> getElementAttributeList(By locator, String attrName) {
	List<WebElement> imagesList = getElements(locator);
	List<String> attrList = new ArrayList<String>();	
		for(WebElement e : imagesList) {
			
			String attrVal = e.getAttribute(attrName);
			if(attrVal != null && attrVal.length()!=0) {
				attrList.add(attrVal);
				System.out.println(attrVal);
			}
			
		}
		return attrList;
	}
	

	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}
	
}
