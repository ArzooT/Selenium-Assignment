package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webdriverbasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:/Users/arjut/Downloads/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	
		
driver.get("https://www.google.com/");	
String title=driver.getTitle();
if(title.equals("Google")) {
	System.out.println("correct title");
}
	else
	{
		System.out.println("Incorrect title");
	}

driver.close();
	}

}
