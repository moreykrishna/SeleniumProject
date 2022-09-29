package SeleniumSession;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ListWithStream {
	static WebDriver driver;	
	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		
		//By links=By.tagName("a");
		//By industry=By.id("Form_submission_Industry");
		By Country=By.id("Form_submitForm_Country");
		
	By industry_option=By.xpath("//select[@id='Form_submitForm_Country']/option");
	List<WebElement> indus_list=driver.findElements(industry_option);
	long startTime=System.currentTimeMillis();
	indus_list.stream().forEach(ele -> System.out.println(ele.getText()));
	indus_list.parallelStream().forEach(ele -> System.out.println(ele.getText()));
	long endTime=System.currentTimeMillis();
	
	By links=By.tagName("a");
	List<WebElement> linksList=driver.findElements(links);
	System.out.println(linksList.size());
	
	List<String> collectList=linksList.stream().filter(ele -> !ele.getText().equals("")).map(ele -> ele.getText())
			.collect(Collectors.toList());
	
			                         
	collectList.stream().forEach(ele -> System.out.println(ele));
	collectList.parallelStream().forEach(ele -> System.out.println(ele));

	}

}
