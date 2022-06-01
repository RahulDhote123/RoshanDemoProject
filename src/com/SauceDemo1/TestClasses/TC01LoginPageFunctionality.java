package com.SauceDemo1.TestClasses;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.SauceDemo1.POMClasses.LoginPagePOMClass;
import com.SauceDemo1.UtilityClasses.ScreenshotClass;

public class TC01LoginPageFunctionality extends TestBaseClass
{
   @Test
   public void Loginfuntinality() throws IOException
   {
		
		ScreenshotClass.ScreenshotMethod(driver);
		
		String actualtitle= driver.getTitle();
		
		String expectedtitle="Swag";
		
		Assert.assertEquals(actualtitle, expectedtitle);
		

   }
} 
  



