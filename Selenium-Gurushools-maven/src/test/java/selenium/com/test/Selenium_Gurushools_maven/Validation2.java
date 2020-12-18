package selenium.com.test.Selenium_Gurushools_maven;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Validation2 {

	@Test
	public void check()
	{
		Assert.assertEquals(1, 1, "number not equal");
	}

}
