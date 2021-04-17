package rediff.testcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import rediff.pages.RediffHomePage;
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
		redlog.password().sendKeys("test123");
		Thread.sleep(3000);
		redlog.home().click();
		Thread.sleep(3000);
		RediffHomePage rhp = new RediffHomePage(driver);
		rhp.news().click();
		Thread.sleep(3000);
		rhp.sports().click();
	//	driver=BrowserFactory.tearDown(driver);
	}

}
