package testngassignment;

import org.testng.annotations.Test;

public class dependsonMethodsclass {
	
	@Test
	public void logintest()
	{
		System.out.println("LoginTest");
	}
	
	@Test(dependsOnMethods="logintest")
	public void checkDashboard()
	{
		System.out.println("checkDashboard");

	}
	
	@Test
	public void verifysearch()
	{
		System.out.println("verifysearch");

	}

}
