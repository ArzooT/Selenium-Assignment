package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class opennewtab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		String ParentWIndowID= driver.getWindowHandle();
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.navigate().to("https://www.google.com/");
		System.out.println(driver.getTitle());
		driver.close();
		driver.switchTo().window(ParentWIndowID);
		driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("admin");
		driver.quit();
	}

}
