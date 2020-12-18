package selenium.com.test.Selenium_Gurushools_maven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleValidation {
	WebDriver driver;
	
/*	GoogleValidation(WebDriver driver)
	{
		this.driver=driver;
	}*/
	
	@Test
	public void logo()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		boolean logo = driver.findElement(By.id("hplogo")).isDisplayed();
		System.out.println("Title of the logo "+logo);
	}
	
}
