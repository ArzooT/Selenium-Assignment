package seleniumsessions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultipleBrowserWindowHandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		String parentwindowid=driver.getWindowHandle();
		
		
		driver.findElement(By.xpath("//img[@alt='OrangeHRM on Facebook']")).click();
		driver.findElement(By.xpath("//img[@alt='LinkedIn OrangeHRM group']")).click();
		driver.findElement(By.xpath("//img[@alt='OrangeHRM on twitter']")).click();
		driver.findElement(By.xpath("//img[@alt='OrangeHRM on youtube']")).click();
		
		Set<String> handles = driver.getWindowHandles();				
      Iterator<String> it=handles.iterator();
      
     
      while(it.hasNext())
      {
    	  String windowid=it.next();
    	  if(!parentwindowid.equals(windowid)) {
    		  driver.switchTo().window(windowid);
    		  System.out.println(driver.getCurrentUrl());
    		  driver.close();
    	  }
      }
      driver.switchTo().window(parentwindowid);
      System.out.println(driver.getCurrentUrl());
		//driver.quit();
		
		
	}

}
