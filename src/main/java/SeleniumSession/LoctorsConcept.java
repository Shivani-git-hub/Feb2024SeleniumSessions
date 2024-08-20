package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoctorsConcept {
		static WebDriver driver;

		public static void main(String[] args) {

			driver = new ChromeDriver();
			driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		//1.id: Unique attribute
			//driver.findElement(By.id("input-email")).sendKeys("madagonishivani3@gmail.com");
			//driver.findElement(By.id("input-password")).sendKeys("Shivani@333");
	
		//2. name: Can be duplicate
			//driver.findElement(By.name("email")).sendKeys("madagonishivani3@gmail.com");
	
		//3. Class name: Can be duplicate
			//driver.findElement(By.className("form-control"));
		//4. xpath: it's not an attribute , xpath is address of element in html dom
			//driver.findElement(By.xpath("//*[@id=\"input-email\"]")).sendKeys("test@gmail.com");
			//driver.findElement(By.xpath("//*[@id=\"input-password\"]")).sendKeys("test@123");
			//driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input")).click();
		//5.cssSelector:its not an attribute.sendKeys("madagonishivani3@gmail.com")
//			driver.findElement(By.cssSelector("#input-email")).sendKeys("madagonishivani3@gmail.com");
//			driver.findElement(By.cssSelector("#input-password")).sendKeys("Shivani@333");
//			driver.findElement(By.cssSelector("#content > div > div:nth-child(2) > div > form > input")).click();
		//6.LinkText: only for links. htmltag <a>
			//driver.findElement(By.linkText("Register")).click();
		//7. partialLinkText : only for links( if its name is terms and condition u can take only condition
			//driver.findElement(By.partialLinkText("Conditions")).click();
		//8/tagName : html tag
//			String header = driver.findElement(By.tagName("h2")).getText();
//			System.out.println(header);
		
			
			
			
			

			
			
			
		}

}
