package mytest;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GoogleTest extends BaseTest {

	
	@Test(priority=2)
	public void pageTitleTest() {
		
		String title=driver.getTitle();
		System.out .println("Page title is" +title);
		Assert.assertEquals(title, "Google","Amazon title test failed");
	}

	
	@Test(priority=1,description = "verify page url test")
	public void pageUrltest()
	{
		String purl=driver.getCurrentUrl();
		System.out .println("Page url is" +purl);
		Assert.assertTrue(purl.contains("google"));
		
	}
	
	@Test(priority=3,enabled = true)
	public void IssearchBoxAvailableCheck()
	{
	Boolean flag=driver.findElement(By.xpath("//input[@name='q' and @type='text']")).isDisplayed();
	Assert.assertTrue(flag);
	
		
	}
	
	

}
