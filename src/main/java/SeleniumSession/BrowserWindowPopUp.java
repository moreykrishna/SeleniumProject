package SeleniumSession;
import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
public class BrowserWindowPopUp {
	static WebDriver driver;	
	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		 driver.get("https://opensource-demo.orangehrmlive.com/");
		 driver.findElement(By.linkText("good up")).click();
		 Set<String> handles=driver.getWindowHandles();
		 Iterator<String> it=handles.iterator();
		 //why string because window id in string  Set<String> 
		 String parentWindowId=it.next();
		 System.out.println("parent window :"+parentWindowId);
		 String childWindowId=it.next();
		 System.out.println("child window :"+childWindowId);
		 driver.switchTo().window(childWindowId);
		 System.out.println("child window title is : "+driver.getTitle());
		 driver.close();
		 driver.switchTo().window(parentWindowId);
		 System.out.println("parent window title is :"+driver.getTitle());
		 driver.quit(); 	 
	}
}
