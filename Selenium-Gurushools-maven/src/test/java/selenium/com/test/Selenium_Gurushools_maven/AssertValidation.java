package selenium.com.test.Selenium_Gurushools_maven;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssertValidation {

	WebDriver driver;
	
	//Please enter the browser name with either "" or "firefox"
	String browser="chrome"; 

	//This is Test case is to validate the Google page Title 
	@Test 
	public void openBrowser() throws InterruptedException
	{
		if (browser.equals("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			System.out.println("Chrome browser opened");
		}
		else if(browser.equalsIgnoreCase("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();			
			driver = new FirefoxDriver();	
			System.out.println("Firefox browser opened");
		}
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");

		String title = driver.getTitle(); //Actualtitle
		/*	
		if (title.equals("Google")) //Verification
		{
			System.out.println("Test case pass");
		}
		else
			System.out.println("Test failed");		*/

		//	Assert.assertEquals(title, "Google"); //Assert is a class in TestNG

		Assert.assertEquals(title, "Google", "Title matching");
		Thread.sleep(3000);

		driver.close();

	}

}
