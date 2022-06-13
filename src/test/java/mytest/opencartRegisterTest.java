package mytest;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class opencartRegisterTest extends BaseTest  {

	@DataProvider
	public Object[][] getData()
	{
		return new Object[][] {
			
							  {"atamboli","azoo","tmbli","test@test.com",99,"abc123"},
			                  {"atamboli1","azoo1","tmbli1","test1@test.com",99,"abd123"},
			                  {"atamboli2","azoo2","tmbli2","test2@test.com",99,"abe123"}
			                  
		
		};
	}
	
	@Test(dataProvider="getData")
	public void registerUserTest(String username,String fname,String lname,String email,int country,String pwd)
	{
	
		registerUser(username,fname,lname,email,country,pwd);
	
	}
	
	public void registerUser(String username,String fname,String lname,String email,int country,String pwd)
	{
		driver.findElement(By.id("input-username")).clear();
		driver.findElement(By.id("input-username")).sendKeys(username);
		driver.findElement(By.name("firstname")).clear();
		driver.findElement(By.name("firstname")).sendKeys(fname);
		driver.findElement(By.name("lastname")).clear();
		driver.findElement(By.name("lastname")).sendKeys(lname);
		driver.findElement(By.name("email")).clear();
		driver.findElement(By.name("email")).sendKeys(email);
		By scountry = By.xpath("//select[@name='country_id']");
Select select=new Select(driver.findElement(scountry));
select.deselectByIndex(99);
		driver.findElement(By.name("password")).clear();
		driver.findElement(By.name("password")).sendKeys(pwd);
		
		
		
		

		
		
	
	
	}
}
