package TestNGPracticeClasses;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertion2 
{
	
	@Test
	public void logintest()
	{
	String actualtitle="Swag Labs";
	String expectedtitle="Swag ";
	
	SoftAssert soft = new SoftAssert();
	soft.assertEquals(actualtitle,expectedtitle );
	
	String actualurl= "www.saucedemo.com";
	String expectedurl= "www.saucedemo.com";
     
	soft.assertEquals(actualurl,expectedurl );
	
	soft.assertAll();
	
  }
}