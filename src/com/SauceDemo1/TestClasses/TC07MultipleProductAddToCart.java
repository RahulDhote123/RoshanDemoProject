package com.SauceDemo1.TestClasses;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.grid.Main;
import org.testng.annotations.Test;

import com.SauceDemo1.POMClasses.HomePagePOMClass;
import com.SauceDemo1.POMClasses.LoginPagePOMClass;

public class TC07MultipleProductAddToCart extends TestBaseClass
{
 
	@Test
	public void MultipleProductAddToCartFuntinality()
  {	
	HomePagePOMClass hp= new HomePagePOMClass(driver);
	
	hp.addtocartAllProduct();
	System.out.println("all Product is add to cart");
	
	System.out.println("Apply the Validation");
	
	String  actualresult= hp.getTextFromcartlinkedbutton();
	System.out.println(actualresult);
	String expectedresult = "3";
	
	if(actualresult.equals(expectedresult))
	{
		System.out.println("Test Case is passed");
	}
	else
	{
		System.out.println("Test Case is failed");
	}
  }
}