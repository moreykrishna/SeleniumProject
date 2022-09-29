package SeleniumSession;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;
public class GetDropDownValues {
	public static void main(String[] args) {
			WebDriverManager.chromedriver().setup();
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.facebook.com/");
			WebElement day=driver.findElement(By.id("day"));
			WebElement month=driver.findElement(By.id("month"));
			WebElement year=driver.findElement(By.id("year"));
			getDropDownValues(day);
			getDropDownValues(month);
			getDropDownValues(year);
	}
			public static void getDropDownValues(WebElement element)
			{
				Select select=new Select(element);
				List<WebElement> dropdownlist=select.getOptions();
				System.out.println("total days option"+ dropdownlist.size());
				
				for(int i=0;i<dropdownlist.size();i++)
				{
					String text=dropdownlist.get(i).getText();
					System.out.println(text);
				}
			}
}