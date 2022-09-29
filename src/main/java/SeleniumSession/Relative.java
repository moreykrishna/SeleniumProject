package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

import static org.openqa.selenium.support.locators.RelativeLocator.*;

public class Relative {

	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://whenwise.com/sign-in");
		driver.findElement(By.id("email")).sendKeys("naveen@gmail.com");
		driver.findElement(By.id("password")).sendKeys("naveen@123");
		driver.findElement(By.id("login-btn")).click();
		
		driver.navigate().to("https://whenwise.com/users/2835/edit");
		
		WebElement ele=driver.findElement(By.xpath("//span[text()='Email on booking confirmation?"));
		
		driver.findElement(with(By.className("lever")).toRightOf(ele)).click();

	}

}
