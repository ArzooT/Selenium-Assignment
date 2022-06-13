package seleniumsessions;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class switchtowindowonebyone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		//System.out.println("Parent"+ParentWindowId); 
		driver.findElement(By.xpath("//img[@alt='OrangeHRM on Facebook']")).click();
		
		  Set<String> handles = driver.getWindowHandles(); 
		  //Iterator<String> it=handles.iterator();
		  
		  for(int i=0;i<4;i++)
		  {
				driver.findElement(By.xpath("(//div[@id='social-icons']/a)[+'i'+]")).click();

		  }
		 List<String> handlesList= new ArrayList<String>(handles);
		   String ParentWindowId=handlesList.get(0);
		   String ChildWindowId=handlesList.get(1);
		   
		   driver.switchTo().window(ChildWindowId);
		   
		   System.out.println("Child title"+ driver.getTitle());
		  
		 driver.close();
		 
		 driver.switchTo().window(ParentWindowId);
		   System.out.println("Parent title"+ driver.getTitle());

		 
		 
		
		//driver.switchTo().window(ParentWindowId);
		
		
		/*
		 * driver.findElement(By.xpath("//img[@alt='LinkedIn OrangeHRM group']")).click(
		 * );
		 * driver.findElement(By.xpath("//img[@alt='OrangeHRM on twitter']")).click();
		 * driver.findElement(By.xpath("//img[@alt='OrangeHRM on youtube']")).click();
		 */
			
	}

}
