package SeleniumSession;
import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
public class WindowPopUp {
	public static void main(String[] args) {
			{
			WebDriverManager.chromedriver().setup();
			WebDriver driver=new ChromeDriver();
			driver.get("url");
            driver.findElement(By.linkText("good popup#3")).click();
            Set<String> handles=driver.getWindowHandles();
            Iterator<String> it =handles.iterator();
            String parentwindow=it.next();
            System.out.println(parentwindow);
            String childwindow=it.next();
            System.out.println(childwindow);
            driver.switchTo().window(childwindow);
            driver.getTitle();
            driver.close();
            driver.switchTo().window(parentwindow);
            driver.getTitle();
            driver.close();
        		}
}
}