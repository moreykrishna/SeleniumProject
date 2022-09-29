package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumDay2 {

	public static void main(String[] args) throws InterruptedException {
		//System.setProperty("webdriver.chrome.driver", "C:/Users/dell/Desktop/chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
			
		driver.get("https://google.com");
		driver.get("https://app.hubspot.com/login");
		WebElement signup=driver.findElement(By.xpath("//i18n-string[normalize-space()='Sign up']"));
		signup.click();
		Thread.sleep(5000);
		//input[@id='UIFormControl-2']
		driver.findElement(By.xpath("//input[@id='UIFormControl-2']")).sendKeys("morey");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='UIFormControl-4']")).sendKeys("krishna");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='UIFormControl-6']")).sendKeys("moreykrishna@gmail.com");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
//		
//		WebElement username=driver.findElement(By.xpath("//input[@id='username']"));
//		username.click();
//		WebElement password=driver.findElement(By.xpath("//input[@id='password']"));
//		password.click();
//		WebElement login=driver.findElement(By.xpath("//input[@id='username']"));
//		username.click();
		
	}

}
