import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Activity_2 extends Activity_1 {

	public static void main (String args[]) {
		//TODO Auto-generated method stub
		WebDriver driver=  new FirefoxDriver();
		driver.get("http://alchemy.hguy.co/orangehrm");
	WebElement url= driver.findElement(By.tagName("img"));
	String link=url.getAttribute("src");
	System.out.println(link);
	driver.quit();
	}

}
