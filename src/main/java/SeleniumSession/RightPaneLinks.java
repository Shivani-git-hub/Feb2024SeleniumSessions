package SeleniumSession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RightPaneLinks {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		List<WebElement> rightLinksList = driver.findElements(By.xpath("//div[@class='list-group']/a"));
		System.out.println(rightLinksList.size());
		
		
		for(WebElement e : rightLinksList) {
			String text = e.getText();
			System.out.println(text);
	}

}
}