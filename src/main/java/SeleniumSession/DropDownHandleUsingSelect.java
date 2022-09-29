package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownHandleUsingSelect {
        static WebDriver driver;
	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		
		//By industry=By.id("Form_submission_Industry");
		By Country=By.id("Form_submitForm_Country");
		//selectDropDownValue(Country,"index","5"); 3rd way..........
	
		
	
	//	selectDropDownValue(Country,DropDown.INDEX.toString(),"5");
//		selectDropDownValue(industry,DropDown.VISIBLETEXT.toString(), "Education");
		selectDropDownValue(Country,DropDown.VALUE.toString(), "India");//4th way
	}
//		...................................................1............................
		//Select select1=new Select(driver.findElement(Country));
		//select1.selectByVisibleText("India");//STEP 1 BY THIS
//		.....................................................1.........................
//		Select select11=new Select(driver.findElement(industry));
//		select11.selectByVisibleText("Education");

		//2nd way
		//............................2nd way............................................
		//doSelectByVisibleText(Country,"India");
	//}
		public static 	WebElement getElement(By locator)
		{
			return driver.findElement(locator);
		}
//
//
//		public static void doSelectByVisibleText(By locator,String value)
//		{
//			Select select=new Select(getElement(locator));
//			select.selectByVisibleText(value);
//		}

//		public static void doSelectDropDownByIndex(By locator,int index)
//		{
//			Select select=new Select(getElement(locator));
//			select.selectByIndex(index);
//		}
//		public static void doSelectDropDownByValue(By locator,int index)
//		{
//			Select select=new Select(getElement(locator));
//			select.selectByValue(value);
//		}
	//..................................................2ndway...................................	
//		//3rd way
		public static void selectDropDownValue(By locator,String type, String value)
		{
			Select select=new Select(getElement(locator));
			switch(type)
			{
			case "index":
				select.selectByIndex(Integer.parseInt(value));
				break;
			case "value":
				select.selectByValue(value);
				break;
			case "visibletext":
				select.selectByVisibleText(value);
				break;
				default:
					System.out.println("plz pass correct selecteion criteria");
					break;
			}
		}}
		
	
	
