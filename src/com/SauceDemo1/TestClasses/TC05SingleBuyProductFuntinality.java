package com.SauceDemo1.TestClasses;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.SauceDemo1.POMClasses.BillingPagePOMClass;
import com.SauceDemo1.POMClasses.BuyPagePOMClass;
import com.SauceDemo1.POMClasses.CartPagePOMClass;
import com.SauceDemo1.POMClasses.HomePagePOMClass;
import com.SauceDemo1.POMClasses.LoginPagePOMClass;

public class TC05SingleBuyProductFuntinality extends TestBaseClass
{	
  @Test
	public void SingleBuyProductFuntinality()
	 {   
	   HomePagePOMClass hp = new HomePagePOMClass(driver);
	    
	    hp.clickbag();
	    hp.clickAddToCard();	    
	    CartPagePOMClass ct = new CartPagePOMClass(driver);   
	    ct.clickcheckout();
	    BuyPagePOMClass by = new BuyPagePOMClass(driver);
	    by.sendfirstname();
	    by.sendlaststname();
	    by.sendpostcode();
	    by.clickcontinuebutton();;
	    
	    BillingPagePOMClass bill = new BillingPagePOMClass(driver);
	    bill.clickfinish();
		
        String actualtitle = driver.getTitle();
		System.out.println(actualtitle);
		
		String expectedtitle="Swag Labs";
		if(actualtitle.equals(expectedtitle))
		{
			System.out.println("Test Case is Passed and Product is by");
		}
		else
		{
			System.out.println("Test case is Failed Product not by");
		}
	 }
  }


