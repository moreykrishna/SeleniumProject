package SeleniumSession;
import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
public class ScreenshotConcept {
	public static void main(String[] args) throws InterruptedException, IOException 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://app.hubspot.com/login");
		Thread.sleep(4000);
		ScreenshotConcept.takePageScreenshot(driver, "loginpage");
		WebElement user=driver.findElement(By.xpath("//input[@id='username']"));
		WebElement pwd=driver.findElement(By.xpath("//input[@id='password']"));
		user.sendKeys("moreykrishna@gmail.com");
		pwd.sendKeys("dkkdkd");
		takeElementScreenshot(user, "user");
		takeElementScreenshot(pwd, "pwd");
	}
	public static void takePageScreenshot(WebDriver driver,String filename) {
	
	File srcfile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	try {
		FileUtils.copyFile(srcfile, new File("./target/screenshots/"+filename+".png"));
	} catch (IOException e) {
		e.printStackTrace();
	}
	}
	public static void takeElementScreenshot(WebElement element,String filename) {
		
		File srcfile=((TakesScreenshot)element).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(srcfile, new File("./target/screenshots/"+filename+".png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		}
}
