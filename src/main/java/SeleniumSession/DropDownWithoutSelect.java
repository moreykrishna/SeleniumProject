package SeleniumSession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownWithoutSelect {

	public static void main(String[] args) {
	
			WebDriverManager.chromedriver().setup();
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.facebook.com/");
			String day="//select[@id='day']/option";
			String month="//select[@id='day']/option";
			String year="//select[@id='day']/option";
			DropDownUtil.selectDropDownValueWithoutSelect(driver,day,"13");
			DropDownUtil.selectDropDownValueWithoutSelect(driver,month,"Oct");
			DropDownUtil.selectDropDownValueWithoutSelect(driver,year,"2020");
			
			
	}

}
