package SeleniumSession;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class Util 
{
	WebDriver driver;
	
	public  Util(WebDriver driver)
	{
		this.driver=driver;
	}
	
	//this method is used to click on element
	public void doClick(By locator)
	{
		try {
		getElement1(locator).click();
		}catch(Exception e)
		{
			System.out.println();
			System.out.println(e.getMessage());
		}
	
	}
	//this method is used to pass the value in a webelement
	public void doSendKeys(By locator,String value)
	{
		try {
		getElement1(locator).sendKeys(value);
		}
	
	catch(Exception e) {
		System.out.println("some exception");
		System.out.println(e.getMessage());
	}}
	
	public WebElement getElement1(By locator)
	{
		WebElement element=null;
		try
		{
			element=driver.findElement(locator);
		}
		catch(Exception e)
		{
			System.out.println("bbxjx");
			System.out.println(e.getMessage());
		}
		return element;
	}
	
	
	public void waitForElementPresent(By locator, Duration i)
	{
		WebDriverWait wait=new WebDriverWait(driver,i);
		
		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		
	}
	
	public void waitForTitlePresent(String title,Duration timeout)
	{
		WebDriverWait wait=new WebDriverWait(driver,timeout);
		wait.until(ExpectedConditions.titleContains(title));
	}
	
	public WebElement waitForElementToBePresent(By locator,int timeout)
	{
		WebDriverWait wait=new WebDriverWait(driver,timeout);
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(locator));
		return getElement(locator);	
	}
	public String waitForTitleToBePresent(String title,Duration timeout)
	{
		WebDriverWait wait=new WebDriverWait(driver,timeout);
		wait.until(ExpectedConditions.titleContains(title));
		return driver.getTitle();	
	}
	public WebElement waitForElementToBeVisible(By locator,Duration timeout)
	{
		WebElement element=getElement(locator);//wy this line because by locator not work for visible
		WebDriverWait wait=new WebDriverWait(driver,timeout);
		wait.until(ExpectedConditions.visibilityOf(element));
		return element;	
	}	
	public WebElement waitForElementToBeClickable(By locator,Duration timeout) {
	
		WebDriverWait wait=new WebDriverWait(driver,timeout);
		wait.until(ExpectedConditions.elementToBeClickable(locator));
		return getElement(locator);
		
	}
	public String waitForUrl(String Url,Duration timeout) {
		
		WebDriverWait wait=new WebDriverWait(driver,timeout);
		wait.until(ExpectedConditions.urlContains(Url));
		return driver.getCurrentUrl();
		
	}
	public void ClickWhenReady(By locator,Duration timeout)
	{
		WebDriverWait wait=new WebDriverWait(driver,timeout);
		wait.until(ExpectedConditions.elementToBeClickable(locator));
		getElement(locator).click();
	}
	
	public boolean waitAlertToBePresent(int timeout) {
		
		WebDriverWait wait=new WebDriverWait(driver,timeout);
		wait.until(ExpectedConditions.alertIsPresent());
		return true;
		
	}
	
	
	public void doSendKeys1(By locator,String value)
	{
		getElement(locator).sendKeys(value);
	}
	
	public void doActionsSendKeys(By locator,String value)
	{
		Actions action =new Actions(driver);
		WebElement element=getElement(locator);
		action.sendKeys(element,value).perform();
	}
	public void doClick1(By locator)
	{
		getElement(locator).click();
	}
	public void doActionsClick(By locator)
	{
		Actions action =new Actions(driver);
		WebElement element=getElement(locator);
		action.click(element).perform();
	}
	//this method used to create the webelement on the basis of By locator
	public WebElement getElement(By locator) {
	WebElement element=null;
	{
		try {
	 element=driver.findElement(locator);
		}catch(Exception e)
		{
			System.out.println("some exception");
			System.out.println(e.getMessage());
		}
		return element;
	}	
	}}
