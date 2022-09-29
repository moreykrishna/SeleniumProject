//package SeleniumSession;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import io.github.bonigarcia.wdm.WebDriverManager;
//
//public class DifferentWebElementUsed {

//	public static void main(String[] args)
//	{
//		//1.id approach
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver=new ChromeDriver();
//		driver.get("https://cgi-lib.berkeley.edu/ex/fup.html");
//		
////		driver.findElement(By.id("input-email")).sendKeys("morey@gmail.com");
////		driver.findElement(By.id("input-password")).sendKeys("krishna@gmail.com");
//		
//		//2nd approach
////		WebElement emailid=driver.findElement(By.id("input-email"));
////		WebElement password=driver.findElement(By.id("input-password"));
////		
////		emailid.sendKeys("morey@gmail.com");
////		password.sendKeys("krishna@gmail.com");
////		
////		//3rd approach
////		By username=By.id("input-email");
////		By passw=By.id("input-pass");
////	
////		WebElement emailid1=driver.findElement(username);
////		WebElement password1=driver.findElement(passw);
////		
////		emailid1.sendKeys("morey@gmail.com");
////		password1.sendKeys("pssjj");
////		
//		//4th approach
//		By username2=By.id("input-email");
//		By passw2=By.id("input-pass");
//		
//		getElement(username2).sendKeys("djd");
//		getElement(passw2).sendKeys("passw2");
//		}
//
//	public static WebElement getElement(By locator)
//	{
//		return driver.findElement(locator);
//	}
//	
//}
