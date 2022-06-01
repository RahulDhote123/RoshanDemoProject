package TestNGPracticeClasses;

import org.testng.annotations.Test;

public class Class4 
{
	
	@Test(enabled=false)
	public void TestA()
	{
		System.out.println("Test A");
	}
	
	@Test
	public void TestB()
	{
		System.out.println("Test B");
	}
	
	@Test
	public void TestC()
	{
		System.out.println("Test C");
	}

}
