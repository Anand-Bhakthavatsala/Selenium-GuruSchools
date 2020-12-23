package rediff.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RediffLoginPagePF {

	WebDriver driver;
	public RediffLoginPagePF(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
/*	By username= By.xpath("//input[@id='login1']");//Username text field
	By password = By.xpath("//input[@id='password']"); //password text field
	By signin = By.name("proceed");
	By home = By.xpath("//a[contains(text(),'rediff.com')]");*/
	
	@FindBy(id="login1") WebElement uname;
	@FindBy(id="password") WebElement pwd;
	@FindBy(name="proceed") WebElement loginbtn;
	
	public void rediffLogin(String username, String password) throws InterruptedException
	{
		Thread.sleep(3000);
		uname.clear();
		uname.sendKeys(username);
		pwd.clear();
		pwd.sendKeys(password);
		loginbtn.click();
	}
	
	/*public WebElement username()
	{
		return driver.findElement(username);
	}
	
	public WebElement password()
	{
		return driver.findElement(password);
	}
	
	public WebElement signin()
	{
		return driver.findElement(signin);
	}

	public WebElement home()
	{
		return driver.findElement(home);
	}*/
}
