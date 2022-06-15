import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Activity_1 {

	public static void main(String args[]) {

		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();

		driver.get("http://alchemy.hguy.co/orangehrm");

		String title = driver.getTitle();
		System.out.println(title);
		String expected = "OrangeHRM";
		Assert.assertEquals(title, expected);

		driver.quit();

	}
}
