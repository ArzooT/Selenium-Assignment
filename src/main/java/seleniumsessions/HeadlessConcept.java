package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HeadlessConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions co= new ChromeOptions();
		//co.setHeadless(true);
		co.addArguments("--incognito");
		WebDriver driver=new ChromeDriver(co);
		
		driver.get("https://opensource-demo.orangehrmlive.com/");

		System.out.println("page title is   "+driver.getTitle() );
		
		driver.quit();
		
	}

}
