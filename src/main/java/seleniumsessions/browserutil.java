package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class browserutil {
WebDriver driver;
	public WebDriver init_driver(String browser)
	{
		if(browser.equals("Chrome")) {
			//System.setProperty("webdriver.chrome.driver", "C:/Users/arjut/Downloads/chromedriver_win32/chromedriver.exe");
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
			else if(browser.equals("firefox")) {
				//System.setProperty("webdriver.gecko.driver", "C:/Users/arjut/Downloads/chromedriver_win32/chromedriver.exe");
				WebDriverManager.firefoxdriver();
				driver=new FirefoxDriver();		
			}
			else
			{
				System.out.println("Invalid browser name");
			}
		
		return driver;
		
	}
	
	public void launchurl(String url) {
		if(url==null) {
			System.out.println("url is null..");
			return;
		}
		if(url.indexOf("http")==-1 || url.indexOf("https")==-1) {
			System.out.println("url is missing http(s)");
		}
		driver.get(url);
	}
           public String getpagetitle() {
        	   return driver.getTitle();
	
           }
           public String getPageurl()
           {
        	   return driver.getCurrentUrl();
	}
           public void closebrowser()
           {
        	   driver.close();
           }
	

}
