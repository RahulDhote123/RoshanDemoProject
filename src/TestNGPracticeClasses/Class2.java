package TestNGPracticeClasses;

import org.testng.annotations.Test;

public class Class2 
{
	@Test(priority=-2)   //second execute
	public void TestA()
	{
		System.out.println("Test A");
	}
	
	@Test(priority=1)    //Fifth Execute
	public void TestB()
	{
		System.out.println("Test B");
	}
	
	@Test(priority=-3)   //first execute
	public void TestC()
	{
		System.out.println("Test C");
	}
	
	@Test(priority=-2)    //Third execute
	public void TestD()
	{
		System.out.println("Test D");
	}
	
	@Test               // by default zero priority 
	public void TestE()  // fourth execute
	{
		System.out.println("Test E");
	}

}
