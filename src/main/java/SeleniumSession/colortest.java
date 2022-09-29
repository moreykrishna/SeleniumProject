package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class colortest {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://automationpractice.com/index.phpcontroller=authentication&back=my-account");
		
		driver.findElement(By.id("email")).sendKeys("krishna@hmsk/dkkdkd");
		driver.findElement(By.id("email")).sendKeys(Keys.TAB);
		
		System.out.println(driver.findElement(By.cssSelector("div.form-group.form-error")).isDisplayed());

	}

}
