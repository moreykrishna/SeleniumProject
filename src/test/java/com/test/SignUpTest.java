package com.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;
import com.beust.jcommander.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SignUpTest
{
	WebDriver driver;
	
	By createAccountlink=By.cssSelector("button.continue-new");
	By accountName=By.xpath("//h4[text()='TestAutomation']");
	By signUp=By.linkText("Sign up");
	
	@BeforeTest	
	@Parameters({"url","browsers"})
	public void setup(String appUrl,String browserName) throws Exception
	{
		
		if(browserName.equals("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
		
		else if(browserName.equals("firefox")	)
		{
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}
		else {
			System.out.println("please pass corect browser name");
			throw new Exception("nosuchbrowserwxc");
		}
		
		driver.get(appUrl);
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	@Test(priority=1)
	public  void verifyCreatedAccountTest()
	{
		driver.findElement(signUp).click();
			Assert.assertTrue(driver.findElement(createAccountlink).isDisplayed());
	}
	@Test(priority=2)
	public  void verifyAccountNameTest()
	{
		
			Assert.assertTrue(driver.findElement(createAccountlink).isDisplayed());
	}
	@AfterTest
	public void tearDown()
	{
		driver.close();
		
	}
}
