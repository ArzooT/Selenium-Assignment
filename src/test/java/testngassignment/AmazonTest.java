package testngassignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonTest {
	
	WebDriver driver;

	@BeforeTest
		public void setup()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.com/");
		
	}
	
	@Test(priority=2)
	public void pageTitleTest() {
		
		String title=driver.getTitle();
		System.out .println("Page title is" +title);
		Assert.assertEquals(title, "Amazon.com. Spend less. Smile more.11","Amazon title test failed");
	}

	
	@Test(priority=1,description = "verify page url test")
	public void pageUrltest()
	{
		String purl=driver.getCurrentUrl();
		System.out .println("Page url is" +purl);
		Assert.assertTrue(purl.contains("amazon"));
		
	}
	
	@Test(priority=3,enabled = true)
	public void IssearchBoxAvailableCheck()
	{
	Boolean flag=driver.findElement(By.id("twotabsearchtextbox")).isDisplayed();
	Assert.assertTrue(flag);
	
		
	}
	
	@AfterTest
	public void tearDown()
	{
		driver.quit();
	}
}
