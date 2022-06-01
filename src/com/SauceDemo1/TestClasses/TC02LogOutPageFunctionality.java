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


public class TC02LogOutPageFunctionality extends TestBaseClass
{
   @Test
       public void LogoutFunctionality() throws IOException
      {	
		HomePagePOMClass hp = new HomePagePOMClass(driver);
		
		hp.clickmenubutton();
		System.out.println("Click on Menu button");
		
		hp.clicklogoutbutton();
		System.out.println("logout successfully");
        ScreenshotClass.ScreenshotMethod(driver); 
		
		System.out.println("Validation Apply");
		
		String actualtitle1= driver.getCurrentUrl();
		String expectedtitle1="https://www.saucedemo.com/";
		if(actualtitle1.equals(expectedtitle1))
		{
			System.out.println("test case is passed");
		}
		else
		{
			System.out.println("test case is failed");
		}
     }
	 
 }

