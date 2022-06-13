package seleniumsessions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class windowhandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.findElement(By.xpath("//img[@alt='OrangeHRM on Facebook']")).click();
		
		Set<String> handles=driver.getWindowHandles();
		Iterator<String> it=handles.iterator();
		
		
		String parentWindowId =it.next();
		System.out.println("Parent window" +parentWindowId);
		
		String childwindow=it.next();
		System.out.println("Child window" +childwindow);
		
		//switch
		
		driver.switchTo().window(childwindow);
		System.out.println("child window title is" + driver.getTitle());
		driver.close();
		
		driver.switchTo().window(parentWindowId);
		System.out.println("parent window title is" + driver.getTitle());
		driver.quit();
		
		
	}

}
