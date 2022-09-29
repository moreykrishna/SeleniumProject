package SeleniumSession;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropDownUtil 
{
	//this method used to get all the value from the dropdown

	public static void selectValueFromDropdownValue(WebElement element,String value)
	{
		Select select=new Select(element);
		select.deselectByVisibleText(value);
	}
	//this method used to get all the index from the dropdown
	public static void selectValueFromDropdownIndex(WebElement element,String index)
	{
		Select select=new Select(element);
		select.selectByVisibleText(index);
	}
		
	//this method used to get all the text  from the dropdown
	public static ArrayList<String>  getDropDownValues(WebElement element)
	{
		Select select=new Select(element);
		List<WebElement> dropdownlist=select.getOptions();
		System.out.println("total days option"+ dropdownlist.size());
		ArrayList<String> ar=new ArrayList<String>();
		
		for(int i=0;i<dropdownlist.size();i++)
		{
			String text=dropdownlist.get(i).getText();
			//System.out.println(text);
			ar.add(text);
		}
		return ar;
		}
	
	
	public static void selectDropDownValueWithoutSelect(WebDriver driver,String Locator,String Value)
	{
		List<WebElement> daylist=driver.findElements(By.xpath("Locator"));
		
		System.out.println(daylist.size());
		for(int i=0;i<daylist.size();i++)
		{
			String text=daylist.get(i).getText();
			System.out.println(text);
			if(text.equals(Value))
			{
				daylist.get(i).click();
				break;
			}
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}