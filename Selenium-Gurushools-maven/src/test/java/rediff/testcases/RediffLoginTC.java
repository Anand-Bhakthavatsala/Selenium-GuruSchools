package rediff.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import rediff.pages.RediffHomePage;
import rediff.pages.RediffLoginPage;

public class RediffLoginTC {
	
	String browser="Chrome"; 
	WebDriver driver;
	
	@Test //Rediff Test case1
	public void login() throws InterruptedException
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
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		RediffLoginPage redlog = new RediffLoginPage(driver);//Instance of the class
		
		redlog.username().sendKeys("USA");
		redlog.password().sendKeys("India");
		redlog.signin().click();
		Thread.sleep(3000);
		redlog.home().click();
		
		RediffHomePage redhome = new RediffHomePage(driver);
		redhome.news();
		Thread.sleep(5000);
		
	}
	
	/*@AfterTest()
	public void closeBrowser() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.close();
	}*/

}
