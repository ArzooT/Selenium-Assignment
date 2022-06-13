package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SearchAndSelect {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://automationpractice.com/index.php");
		driver.findElement(By.id("search_query_top")).sendKeys("Dress");
		
		Thread.sleep(9000);
		//here instead of creating List of web element we can directly inspect respective option from dropdown and perform click 
		
		List<WebElement> suggestions = driver.findElements(By.xpath("//div[@class='ac_results']//li"));		
		for(WebElement e : suggestions) {
			String text=e.getText();
			if(text.contains("Casual Dresses > Printed ")) {
				e.click();
				break;
				
			}
			
		}
	}

}
