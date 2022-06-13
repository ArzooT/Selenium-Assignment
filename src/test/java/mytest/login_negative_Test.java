package mytest;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class login_negative_Test extends BaseTest {
	
	@DataProvider
	public Object[][] getLogindata() {
		return new Object[][] {{"test@gmail12.com","65342"},
			{"fjsa  ","1234"},
			{"testemail11@gmail.com",""}
		};
	}

	@Test(dataProvider = "getLogindata")
	public void loginTest(String usernm,String pwd) {
    Assert.assertTrue(dologin(usernm,pwd));
	
	}
	public boolean dologin(String usernm,String pwd) 
	{
		driver.findElement(By.xpath("//input[@type='text' and @name='email']")).clear();
		driver.findElement(By.xpath("//input[@type='text' and @name='email']")).sendKeys(usernm);
		driver.findElement(By.xpath("//input[@type='password' and @name='password']")).clear();
		driver.findElement(By.xpath("//input[@type='password' and @name='password']")).sendKeys(pwd);
		driver.findElement(By.xpath("//button[@type='submit' and @class='btn btn-primary btn-lg hidden-xs']")).click();
		
		if(driver.findElement(By.xpath("//div[contains(text(),' No match for E-Mail and/or Password.')]")).isDisplayed()) {
			
			System.out.println("No match for E-Mail and/or Password");

			return true;
		}
		return false;
	}
}
