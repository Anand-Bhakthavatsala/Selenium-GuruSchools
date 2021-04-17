package rediff.testcases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import rediff.pages.RediffLoginPagePF;
import utility.BrowserFactory;
import utility.ExcelDataProvider;
import utility.Helper;

public class RediffLoginExcel {
	
	public WebDriver driver=null;
	@Test
	public void loginApp() throws InterruptedException, IOException
	{
		ExcelDataProvider excel = new ExcelDataProvider();
		driver=BrowserFactory.startApplication(driver, "chrome", "https://mail.rediff.com/cgi-bin/login.cgi");
		
		RediffLoginPagePF rlp = new RediffLoginPagePF(driver);
//		rlp.rediffLogin("anand", "anand123");		
		
		//Record1
		rlp.rediffLogin(excel.getStringData("Login", 1, 0),excel.getStringData(0, 1, 1));
		Helper help = new Helper();
		help.captureScreenshot(driver);
		//Record2
		//rlp.rediffLogin(excel.getStringData(0, 2, 0),excel.getStringData(0, 2, 1));
	}
	
	//@Test
	public void home()
	{
		
	}
	
	@AfterTest
	public void tearDown() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.close();
	}

}
