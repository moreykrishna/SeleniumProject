package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RightClickConcept2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("url");
		WebElement rightclickele=driver.findElement(By.className("context-menu-one"));
		Actions action=new Actions(driver);
		action.contextClick(rightclickele).build().perform();
		String text=driver.findElement(By.xpath("url")).getText();
		System.out.println(text);
		
	}

}
