package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPageUsingElementGenericMethod {

	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://app.hubspot.com/login");
		//page objects
		By emailid=By.id("username");
		By password=By.id("password");
		By loginButton=By.id("loginBtn");
		Util util=new Util(driver);
	
		util.waitForElementToBePresent(emailid, 15).sendKeys("moreykrishna@gmail.com");
		util.doSendKeys(password, "test@123");
		
		driver.get("https://app.hubspot.com/login");
		String title=util.waitForTitlePresent("Login", 6);
		System.out.println(title);
		

	}

}
