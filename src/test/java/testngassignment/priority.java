package testngassignment;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class priority {
	@BeforeTest
	public void BTtest() {
		System.out.println("BeforeTest");

	}
	@BeforeClass
	public void BCtest()
	{
		System.out.println("BeforeClass");
	}
	@BeforeMethod
	public void BMtest()
	{
		System.out.println("BeforeMethod");
		
	}
	@Test
	public void test_a()
	{
		System.out.println("test a");
	}
	
	@Test
	
	public void test_b()
	{
		System.out.println("test b");
	}
	
	@Test
	public void test_c()
	{
		System.out.println("test c");
	}

	@AfterMethod
	public void AMtest()
	{
		System.out.println("@AfterMethod");
	}
 
	
	@AfterClass
	public void ACtest()
	{
		System.out.println("@AfterClass");
	}

   @AfterTest
   public void ATtest() {
		System.out.println("@AfterTest");

	   
   }
}


