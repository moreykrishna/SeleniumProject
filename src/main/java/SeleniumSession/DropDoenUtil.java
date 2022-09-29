package SeleniumSession;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDoenUtil {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement day=driver.findElement(By.id("day"));
		WebElement month=driver.findElement(By.id("month"));
		WebElement year=driver.findElement(By.id("year"));
		
		String date="20-dec-1996";
		String datValue[]=date.split("_");
		DropDownUtil.selectValueFromDropdownValue(day, datValue[0]);
		DropDownUtil.selectValueFromDropdownValue(month, datValue[1]);
		DropDownUtil.selectValueFromDropdownValue(year, datValue[2]);
		
		ArrayList<String> yearlist =DropDownUtil.getDropDownValues(year);
		System.out.println(yearlist);
		ArrayList<String> monthlist =DropDownUtil.getDropDownValues(month);
		System.out.println(monthlist);
		ArrayList<String> daylist =DropDownUtil.getDropDownValues(day);
		System.out.println(daylist);
	
	}

}
