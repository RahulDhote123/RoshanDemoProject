package TestNGPracticeClasses;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Class5 
{
	@Test(priority=2)
	public void logintest()
	{
		System.out.println("login test");
		
	    Assert.assertTrue(false);
	}

	@Test(dependsOnMethods= {"logintest"},priority=1)
	public void SingleProductTest()
	{
		System.out.println("Single Product Test case");
	}
}
