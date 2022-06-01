package TestNGPracticeClasses;

import org.testng.annotations.Test;

public class Class3 
{
	
	@Test(priority=1,invocationCount=5)  //Fourth Execute with 5 times
	public void TestA()
	{
		System.out.println("TestA");
	}
	
	@Test(priority=-1 ,invocationCount=2)   //second Execute With 2-times
	public void TestB()
	{
		System.out.println("TestB");
	}
	
	@Test(priority=2)     //First Execute With 2-times
	public void TestC()
	{
		System.out.println("TestC");
	}
	
	@Test
	public void TestD()   // Third Execute
	{
		System.out.println("TestD");
	}
	
	@Test(invocationCount=0)     // skipped from execution
	public void TestE()     // not Execute
	{
		System.out.println("TestE");
	}

}
