package SeleniumSession;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class WebDriverBasics {
public static void main(String[] args) 
{
	System.setProperty("webdriver.chrome.driver", "C:/Users/dell/Desktop/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
		
	driver.get("https://google.com");
	String title=driver.getTitle();
	System.out.println(title);
	if(title.equals("Google"))
	{
		System.out.println("correct");
	}
	else
	{
		System.out.println("not correct");
	}
	System.out.println(driver.getCurrentUrl());
	driver.quit();
}}
