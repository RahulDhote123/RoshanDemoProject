package TestNGPracticeClasses;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertion1 
{
	@Test 
	public void logintest()
	{
		// check title
		String actualtitle="Swag ";
		String expectedtitle="Swag Labs";
		
		Assert.assertEquals(actualtitle, expectedtitle);
		
		// check url
		
		String actualurl= "www.saucedemo.com";
		String expectedurl= "www.saucedemo.com";
		// hard assertion
		Assert.assertEquals(actualurl,expectedurl );
		
	}
	
	@Test
	public void logouttest()
	{
		Assert.assertTrue(true);
	}
	
	

}
