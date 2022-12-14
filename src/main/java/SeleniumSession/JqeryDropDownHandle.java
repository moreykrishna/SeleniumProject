package SeleniumSession;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JqeryDropDownHandle {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:/Users/dell/Desktop/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		driver.findElement(By.id("justaninputbox")).click();
		selectChoiceValues(driver,"choice 6");
		//selectChoiceValues(driver,"choice 6","choice 6 2 1");
		selectChoiceValues(driver,"All");
	}
	/**
	 * method used for handling checkbox 1 or mul or All
	 * @param driver
	 * @param value
	 */
	public static void selectChoiceValues(WebDriver driver,String... value)
	{
		List<WebElement> choiceList=driver.findElements(By.xpath("//div[@class='comboTreeDropDownContainer']//ul//li/span[@class='comboTreeTitle']"));
		
		if(!value[0].equalsIgnoreCase("ALL"))
		{
			for(int i=0;i<choiceList.size();i++)
			{
				System.out.println(choiceList.get(i).getText());
				String  text=choiceList.get(i).getText();
				for(int k=0;k<value.length;k++)
				{
					if(text.equals(value[k]))
					{
						choiceList.get(i).click();
						break;
					}
				}
			}
		}
				//select all the values
		else
		{
			try
			{
				for(int all=0;all<choiceList.size();all++)
				{
					choiceList.get(all).click();
				}
			}
			catch(Exception e)
			{	
			}
		}
	}
}

