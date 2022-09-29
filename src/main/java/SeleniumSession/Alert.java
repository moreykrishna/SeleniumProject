package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alert {

	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.xpath("//input[@title='Sign in']")).click();
		org.openqa.selenium.Alert alert = driver.switchTo().alert();
		String text=alert.getText();
		System.out.println(text);
		// TODO Auto-generated method stub
		if(text.equals("Please enter a valid user name"))
		{
			System.out.println("passed");
		}
		else
		{
			System.out.println("failed");
		}
		alert.accept();
	
	}

}
