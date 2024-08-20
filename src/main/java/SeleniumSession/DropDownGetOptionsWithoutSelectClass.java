package SeleniumSession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownGetOptionsWithoutSelectClass {
		
		//1.select a value from Drop Down Without using Select Class methods: by index, byvalue, by visibletext
		//2.select a value from Drop Down Without using Select Class
		
		static WebDriver driver;
		public static void main(String[] args) {

			//htmltag = select
			//Select class in selenium
			
			driver = new ChromeDriver();
			driver.get("https://www.orangehrm.com/en/contact-sales/");
			
			By country = By.id("Form_getForm_Country");
			By employee = By.id("Form_getForm_NoOfEmployees");
			
			//selectValueFromDropDown(country, "India");
			
			By countryOptions = By.xpath("//select[@id='Form_getForm_Country']/option");
			selectValueFromDropDownwithoutSelectClass(countryOptions,"Brazil");
			
			
//			List<WebElement> countryList = driver.findElements(countryOptions);
//			System.out.println(countryList.size());
//			
//			
//			for(WebElement e : countryList) {
//				String text = e.getText();
//				if(text.equals("India")) {
//					e.click();
//					break;
//				}
//			}
//			Select select_country = new Select(driver.findElement(country));
//			List<WebElement> countryOptions = select_country.getOptions();
//			
//			for(WebElement e: countryOptions) {
//				String text = e.getText();
//				if(text.equals("Canada")) {
//					e.click();
//					break;
//				}
//			}
//			
	}
		
		public static WebElement getElement(By locator) {
			return driver.findElement(locator);
		}
		
		public static void selectValueFromDropDown(By locator, String optionText) {
			Select select = new Select(getElement(locator));
			
			List<WebElement> optionsList = select.getOptions();
			
			for(WebElement e: optionsList) {
				String text = e.getText();
				if(text.equals(optionText.trim())) {
					e.click();
					break;
				}
			}
		}
		
		
		public static void selectValueFromDropDownwithoutSelectClass(By locator, String optionText) {
			List<WebElement> optionsList = driver.findElements(locator);
			
			
			for(WebElement e : optionsList) {
				String text = e.getText();
				if(text.equals(optionText)) {
					e.click();
					break;
				}
			}
		
		}
}

