package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementIsDisabled {

	static WebDriver driver;
	public static void main(String[] args)  {
		// TODO Auto-generated method stub

		driver = new ChromeDriver();
		driver.get("https://classic.freecrm.com/register/");
		
		By submitButton = By.id("submitButton");
		
		boolean f1 = driver.findElement(submitButton).isDisplayed();
		System.out.println(f1);
		
		boolean f2 = driver.findElement(submitButton).isEnabled();
		System.out.println(f2);
		
		boolean b1 = driver.findElement(By.name("agreeTerms")).isSelected();
		System.out.println(b1);
		
		driver.findElement(By.name("agreeTerms")).click();
		
		boolean b2 = driver.findElement(By.name("agreeTerms")).isSelected();
		System.out.println(b2);
		
		boolean f3 = driver.findElement(submitButton).isDisplayed();
		System.out.println(f3);
		
		boolean f4 = driver.findElement(submitButton).isEnabled();
		System.out.println(f4);

	}
}
