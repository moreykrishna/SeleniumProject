import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.beust.jcommander.Parameter;
import com.beust.jcommander.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;
//@BM,@AM,@BC,@AC
//IF I USED IN PLACE OF @BM AS @BT
//IF I USED IN PLACE OF @AM AS @AT then before will exectue each time were test at once exectue
//best practice is bm am ,@bt @atest only when less test cases arethere
public class LoginTestTestNg
{
	WebDriver driver;
	SoftAssert softassert;
	@BeforeMethod
	public void setUp()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().fullscreen();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get("https://app.hubspot.com/login");
		SoftAssert softassert=new SoftAssert();
	}
	@Test(priority=1)
	public void loginPageTitleTest()
	{
		WebDriverWait wait=new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.titleContains("HubSpot"));
		String title=driver.getTitle();
		System.out.println("page title is :"+title);
		Assert.assertEquals(title,"HubSpot Login");
	}
@Test(priority=2)
public void signUpLinkTest()
{
	boolean flag=driver.findElement(By.linkText("sign up")).isDisplayed();
	//Assert.assertTrue(flag);
	Assert.assertTrue(driver.findElement(By.linkText("sign up")).isDisplayed());	
}
@Test(priority=3)
@Parameters({"username","password"})
public void loginTest(String emailid,String pwd)
{
	driver.findElement(By.id("username")).sendKeys(emailid);
	driver.findElement(By.id("password")).sendKeys(pwd);
	driver.findElement(By.id("loginBtn")).click();
	WebDriverWait wait=new WebDriverWait(driver,10);
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("private page title")));
	Assert.assertTrue(driver.findElement(By.className("private title page ")).isDisplayed(),"home page is not prese");
	String header=driver.findElement(By.className("private page title")).getText();
	System.out.println("home page header"+header);
	//Assert.assertEquals(header, "Sales Dashboard","header text is not matched");//hardassert
	softassert.assertEquals(header, "Sales Dashboard","header text is not matched");
	String title=driver.getTitle();
	System.out.println("home page title is :" +title);
	softassert.assertEquals(title, "Reports dashboard123");
	softassert.assertAll();	
}
@AfterMethod
public void tearDown()
{
	driver.close();
	
}
}
