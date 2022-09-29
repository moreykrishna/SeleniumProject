package SeleniumSession;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UserActions {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://app.hubspot.com/login");
		Util util=new Util(driver);
		util.doActionsSendKeys(By.id("username"), "naveen@gmail.com");
		util.doActionsSendKeys(By.id("password"), "kris@123");
		util.doActionsClick(By.id("loginbtn"));
	}

}
