import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Activity_3  {

	@Test(priority = 2)
	public static void main(String args[])  {
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://alchemy.hguy.co/orangehrm");
		WebElement userName = driver.findElement(By.id("txtUsername"));
		driver.findElement(By.id("txtPassword")).sendKeys("orangepassword123");
		WebElement submit1 = driver.findElement(By.xpath("//input[@type='submit']"));
		userName.sendKeys("orange");
		//passwd.sendKeys("​orangepassword123");
try {
	Thread.sleep(5000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
		submit1.click();
		System.out.println("not working");
		WebElement homepageValid = driver.findElement(By.xpath("//input[@id='MP_link']"));
		if (homepageValid.isDisplayed() == true) {
			System.out.println("successfully logged in ");
		} else {
			System.out.println("invalid credentials");
		}
		// WebElement
	}
}
