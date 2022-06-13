package testngassignment;

import org.testng.annotations.Test;

public class ExpectedExceptionclass {

	String name;
	
	@Test(expectedExceptions = {ArithmeticException.class,NullPointerException.class})
	public void  logintest()
	{
		System.out.println("login test");
		int i = 9/3;
		
		ExpectedExceptionclass obj=new ExpectedExceptionclass();
		obj.name="Arzoo";
		obj=null;
		System.out.println(obj.name);
	}
	
	
}
