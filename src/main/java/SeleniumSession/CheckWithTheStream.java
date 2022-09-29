package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckWithTheStream {
	static WebDriver driver;	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			WebDriverManager.chromedriver().setup();
			 driver=new ChromeDriver();
			driver.get("https://datatables.net/extensions/select/examples/initialisation/checkbox.html");
			driver.findElements(By.cssSelector("td.select-checkbox")).stream().forEach(ele -> ele.click());
			
	}

}
