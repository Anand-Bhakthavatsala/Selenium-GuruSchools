package rediff.testcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import rediff.pages.RediffLoginPage;
import utility.BrowserFactory;

public class REdiffLoginTC2 {
	
	public WebDriver driver;
	@Test //Annoation
	public void loginApp() throws InterruptedException
	{
		driver=BrowserFactory.startApplication(driver, "firefox", "https://mail.rediff.com/cgi-bin/login.cgi");
		Thread.sleep(3000);
		System.out.println(driver.getTitle());
		
		RediffLoginPage redlog = new RediffLoginPage(driver);//Instance of the class
		redlog.username().sendKeys("guru");
		Thread.sleep(3000);
		driver=BrowserFactory.tearDown(driver);
	}

}
