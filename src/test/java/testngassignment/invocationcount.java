package testngassignment;

import org.testng.annotations.Test;

public class invocationcount {
	
	@Test(invocationCount = 10)
	public void  logintest()
	{
		System.out.println("login test");
		
	}

}
