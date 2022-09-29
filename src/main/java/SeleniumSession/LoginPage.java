package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPage {

	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://app.hubspot.com/login");
		//page objects
		By emailid=By.id("username");
		By password=By.id("password");
		
		
		
		Util util=new Util(driver);
		util.getElement(emailid).sendKeys("testgamil.com");
		util.getElement(password).sendKeys("testgamil.com");
		
		util.doSendKeys(emailid, "krishna@gmail.com");
		util.doSendKeys(password, "krishna");
		
		util.waitForElementPresent(emailid, 20);
		String title=util.waitForTitlePresent("Hubspot", 10);
		System.out.println(title);
		
		
		//how to use element to be clickable
		By signUp=By.linkText("Sign up");
		driver.get("https://app.hubspot.com/login");
		util.ClickWhenReady(signUp, 7);
		
		}
}
