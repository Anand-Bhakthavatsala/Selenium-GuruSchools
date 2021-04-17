package rediff.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RediffHomePage {
	
	WebDriver driver=null;
		
	public RediffHomePage(WebDriver driver) {
		
		this.driver=driver;			
	}

	//	driver.findElement(By.linkText("NEWS")).click();
	
	By news = By.linkText("NEW");//Identify NEWS link
	
	public WebElement news() //news method
	{
		
		return driver.findElement(news);		
	}
	
	By sports = By.xpath("//a[contains(text(),'SPORT')]");
	
	public WebElement sports() //news method
	{
		
		return driver.findElement(sports);		
	}
}
