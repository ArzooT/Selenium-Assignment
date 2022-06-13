package mytest;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	
	WebDriver driver;

	@BeforeTest(description = "Launch browser and open application")
@org.testng.annotations.Parameters({"browser","url"})
	
	
	public void setup(String browsername,String urlname)
	{
		if(browsername.equalsIgnoreCase("Chrome")) {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
		else if(browsername.equalsIgnoreCase("Firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}
		
		else {
			System.out.println("Please provide correct browsername"+browsername);
		}
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(urlname);
		
	}

	
	@AfterTest(description="Closing browser")
	public void tearDown()
	{
		driver.quit();
	}


}
