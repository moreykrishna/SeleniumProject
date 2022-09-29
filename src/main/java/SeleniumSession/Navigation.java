package SeleniumSession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:/Users/dell/Desktop/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
			
		driver.get("https://google.com");
		
		System.out.println(driver.getTitle());
		driver.navigate().to("https://amazon.com");
		System.out.println(driver.getTitle());

		driver.navigate().back();
		System.out.println(driver.getTitle());

		driver.navigate().forward();
		System.out.println(driver.getTitle());

		driver.navigate().back();
		System.out.println(driver.getTitle());

		driver.navigate().refresh();
		System.out.println(driver.getTitle());



	}

}
