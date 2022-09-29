package SeleniumSession;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserWindowSecondWay {
	static WebDriver driver;	
	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		 driver.get("https://opensource-demo.orangehrmlive.com/");
		 Set<String> handles=driver.getWindowHandles();
		 
		 List<String> handlesList=new ArrayList<String>(handles);
		String parentwindowId= handlesList.get(0);
		String childwindowId= handlesList.get(1);
		 
		 
		 
		 driver.switchTo().window(childwindowId);
		 System.out.println("child window title is : "+driver.getTitle());
		 
		 driver.close();
		 
		 driver.switchTo().window(parentwindowId);
		 System.out.println("parent window title is :"+driver.getTitle());
		 
		 driver.quit();
		 
		 
	}}
