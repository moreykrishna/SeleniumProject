package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CustomeWait {

	public static void main(String[] args) 
	{
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://app.hubspot.com/login");
		
		By emailid=By.id("username");
		By password=By.id("password");
		By login=By.id("login");
	}
		
		public static WebElement getElementWithWait(WebDriver driver,By locator,int timeout)
		{
			WebElement element=null;
			for(int i=0;i<timeout;i++)
			{
				try
				{
					element=driver.findElement(locator);
					break;
				}catch(Exception e)
				{
					System.out.println("waiting for element to be presenet on the page--->"+i+"secs");
				
						try	{
						Thread.sleep(1000);
							}catch(InterruptedException e1)
					{
								
					}
			}
		}
			return element;

		}
		public static WebElement isElementDisplayed(WebDriver driver,By locator,int timeout)
		{
			WebElement element=null;
			boolean flag=false;
			for(int i=0;i<timeout;i++)
			{
				try
				{
					element=driver.findElement(locator);
					flag=element.isDisplayed();
					break;
				}catch(Exception e)
				{
					System.out.println("waiting for element to be presenet on the page--->"+i+"secs");
				
						try	{
						Thread.sleep(1000);
							}catch(InterruptedException e1)
					{
								
					}
			}
		}
			return element;
		}}
