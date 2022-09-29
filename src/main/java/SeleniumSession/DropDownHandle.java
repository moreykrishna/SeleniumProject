package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownHandle {

	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement day=driver.findElement(By.id("day"));
		WebElement month=driver.findElement(By.id("month"));
		WebElement year=driver.findElement(By.id("year"));
		
//		Select select=new Select(day);
//		select.deselectByVisibleText("5");
//		
//		Select select1=new Select(month);
//		select.deselectByVisibleText("may");
//		
//		Select select2=new Select(year);
//		select.deselectByVisibleText("1994");
//		selectValueFromDropdown(day,"4");
////	
//		public static void selectValueFromDropdown(WebElement element,String value);
//		{
//			Select select=new Select(element);
//			select.deselectByVisibleText(value);
//		}
//	
}}