package selenium.com.test.Selenium_Gurushools_maven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RediffHomePage {
	
	
	WebDriver driver=null;
	
	/*public RediffHomePage(WebDriver driver) //constructor
	{
		this.driver=driver;
	//	driver.findElement(By.linkText("NEWS")).click();
	}	*/
	
	@Test
	public void test1() throws InterruptedException		
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		System.out.println("Test");
		driver.get("https://www.rediff.com/");
		driver.findElement(By.linkText("NEWS")).click();
		Thread.sleep(3000);
		driver.close();
	}
	
	
	

}
