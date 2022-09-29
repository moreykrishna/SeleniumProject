package com.test;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
public class LoginTest 
{
WebDriver driver;
	
	By username=By.id("username");
	By password=By.id("username");
	By login=By.id("username");
	By signup=By.linkText("Sign up");
	By homePageHeader=By.id("homePageHeader");
	
	@BeforeTest
	public void setup()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://app.hubspot.com/login");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	@Test(priority=1)//it will not execute if you enabled has false
	public void signUpLinkTest()
	{
		Assert.assertTrue(driver.findElement(signup).isDisplayed());
	}
	@Test(priority=2)//it will not execute if you enabled has false
	public void pageTitleTest()
	{
		String title=driver.getTitle();
		System.out.println("page title is "+title);
		Assert.assertEquals(title, "HubSpot Login");
	}
	@Test(priority=3)
	public void loginTest()
	{
		driver.findElement(username).sendKeys("moreykrishna@gmail.com");
		driver.findElement(password).sendKeys("jnnj");
		driver.findElement(login).click();
		String homePageHeaderVal=driver.findElement(homePageHeader).getText();
		Assert.assertEquals(homePageHeaderVal, "sales Dashboard");
	}
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
}
