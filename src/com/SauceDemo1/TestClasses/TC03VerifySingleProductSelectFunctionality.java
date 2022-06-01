package com.SauceDemo1.TestClasses;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.SauceDemo1.POMClasses.HomePagePOMClass;
import com.SauceDemo1.POMClasses.LoginPagePOMClass;
import com.SauceDemo1.UtilityClasses.ScreenshotClass;


public class TC03VerifySingleProductSelectFunctionality extends TestBaseClass
{
  @Test
    public void VerifySingleProductSelectFunctionality() throws IOException
  
   {
		HomePagePOMClass hp= new HomePagePOMClass(driver);
		hp.clickbag();
		System.out.println(" Single BagProduct is selected");
		
		
		System.out.println("bag product add to cards successfully");
		ScreenshotClass.ScreenshotMethod(driver);
		
		String actualtitle = driver.getTitle() ;
		String expectedtitle="Swag Labs";
		if(actualtitle.equals(expectedtitle))
		{
			System.out.println("Test Case is Passed and Product is selcted");
		}
		else
		{
			System.out.println("Test case is Failed");
		}
    }
  
 }	


