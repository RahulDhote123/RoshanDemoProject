package com.SauceDemo1.TestClasses;



import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.SauceDemo1.POMClasses.LoginPagePOMClass;

public class TestBaseClass 
{
	WebDriver driver;
	@Parameters("browsername")
	@BeforeMethod
	public void setup(String browsername)
	{
	if(browsername.equals("chrome"))
	  {  System.setProperty("webdriver.chrome.driver",
		         "C:\\Users\\apande\\Downloads\\chrome");

		    driver =  new ChromeDriver();
	   }
	else
		if(browsername.equals("firefox"))
		  {  System.setProperty("webdriver.gecko.driver",
			         "D:\\Roshan\\SELENIUM\\geckodriver.exe");

			    driver =  new FirefoxDriver();
		   }
		
		System.out.println("Browser open");
		driver.get("https://www.saucedemo.com/");
		System.out.println("url open");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		LoginPagePOMClass lp= new LoginPagePOMClass(driver);
		
		lp.sendUsername();
		System.out.println("username entered");	
		lp.sendpassword();
		System.out.println("password entered");
		lp.clickloginbutton();
		System.out.println("click on login button");
	}

	 @AfterMethod
	   public void tearDown()
	   {
			driver.quit();
			System.out.println("browser is closed");
	   }
	
}
