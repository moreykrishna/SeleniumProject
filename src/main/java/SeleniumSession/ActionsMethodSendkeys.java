package SeleniumSession;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionsMethodSendkeys {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://app.hubspot.com/login");
		Thread.sleep(5000);
	WebElement user=driver.findElement(By.xpath("//input[@id='username']"));
	WebElement pwd=driver.findElement(By.xpath("//input[@id='password']"));
	WebElement loginbtn=driver.findElement(By.id("loginbtn"));
	
	
	Actions action=new Actions(driver);
	action.sendKeys(user, "moreykrishna@gmail.com").build().perform();
	action.sendKeys(pwd, "djdj@gmail.com").build().perform();
	action.click(loginbtn).build().perform();
	

	}

	
}
