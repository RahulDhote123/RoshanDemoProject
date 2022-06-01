package com.SauceDemo1.POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BillingPagePOMClass 
{
 private WebDriver driver;
	
	@FindBy(xpath="//button[@id='cancel']")
	private WebElement cancel;
	
	public void clickcancel()
	{
		cancel.click();
	}
	
	
	@FindBy(xpath="//button[@id='finish']")
	private WebElement finish;
	
	public void clickfinish()
	{
		finish.click();
	}
	
	// constructor
			public BillingPagePOMClass (WebDriver driver)
			{
				this.driver=driver;
				
				PageFactory.initElements( driver,this);
			}

}
