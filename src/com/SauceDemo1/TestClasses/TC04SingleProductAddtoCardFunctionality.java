package com.SauceDemo1.TestClasses;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.SauceDemo1.POMClasses.HomePagePOMClass;
import com.SauceDemo1.POMClasses.LoginPagePOMClass;

public class TC04SingleProductAddtoCardFunctionality extends TestBaseClass
{
   @Test
	  public void SingleProductAddtoCardFunctionality()
	
    {	
		HomePagePOMClass hp= new HomePagePOMClass(driver);
		
		hp.clickbag();
		System.out.println(" Single BagProduct is add to cart");
		
		String Actualresult= hp.getTextFromcartlinkedbutton();
		String Expectedresult="1";

		if(Actualresult.equals(Expectedresult))
		{
			System.out.println("Test Case is Passed and Product is add to card");
		}
		else
		{
			System.out.println("Test case is Failed");
		}
	 }
 	
 }


