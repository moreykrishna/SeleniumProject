package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FooterLinksWithStream {
	static WebDriver driver;	
	public static void main(String[] args)
	{	
					WebDriverManager.chromedriver().setup();
					 driver=new ChromeDriver();
				driver.get("https://www.freshworks.com/");
				driver.findElements(By.cssSelector("ul.footer-nav li a")).stream()
				.filter(ele -> !ele.getText().isEmpty())
				.forEach(ele -> System.out.println(ele.getText()));
	}

}
