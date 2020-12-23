package rediff.testcases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import rediff.pages.RediffLoginPagePF;
import utility.BrowserFactory;
import utility.ExcelDataProvider;

public class RediffLoginPF_TC3 {
	
	public WebDriver driver=null;
	@Test
	public void loginApp() throws InterruptedException, IOException
	{
		ExcelDataProvider excel = new ExcelDataProvider();
		driver=BrowserFactory.startApplication(driver, "chrome", "https://mail.rediff.com/cgi-bin/login.cgi");
		
		RediffLoginPagePF rlp = new RediffLoginPagePF(driver);
	//	rlp.rediffLogin("anand", "anand123");
		
		rlp.rediffLogin(excel.getStringData(0, 1, 0),excel.getStringData(0, 1, 1));
		rlp.rediffLogin(excel.getStringData(0, 2, 0),excel.getStringData(0, 2, 1));
	}

}
