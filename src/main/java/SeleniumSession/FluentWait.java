package SeleniumSession;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;

import com.google.common.base.Function;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FluentWait {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		//when to use fluent wait for handling  the Ajax component
		
		
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://classic.crmpro.com/");
		final By username = By.name("username");
		By password=By.name("password");
		By login=By.xpath("//input[@value='Login']");
		
		waitForElementWithFluentWait(driver, username).sendKeys("kkk");
		driver.findElement(password).sendKeys("test@123");
		driver.findElement(login).click();
		
	}
public static WebElement waitForElementWithFluentWait(WebDriver driver,final By locator)
{
	Wait<WebDriver> wait=new FluentWait<WebDriver>(driver)
			.withTimeout(Duration.ofSeconds(16))
			.pollingEvery(Duration.ofSeconds(3))
			.ignoring(NoSuchElementException.class);
WebElement element=wait.until(new Function<WebDriver,WebElement>()
		{
	public WebElement apply(WebDriver driver)
	{
		return driver.findElement(locator);
	}
		});
}}

//second way
//public static WebElement waitForElementWithFluentWait(WebDriver driver,final By locator)
//{
//	Wait<WebDriver> wait=new FluentWait<WebDriver>(driver)
//			.withTimeout(Duration.ofSeconds(16))
//			.pollingEvery(Duration.ofSeconds(3))
//			.ignoring(NoSuchElementException.class);


//return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
//}
