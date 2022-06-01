package com.SauceDemo1.POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BuyPagePOMClass 
{
private WebDriver driver;
	
	@FindBy(xpath="//input[@id='first-name']")
	private WebElement firstname;
	
	public void sendfirstname()
	{
		firstname.sendKeys("Roshan");
	}
	
	@FindBy(xpath="//input[@id='last-name']")
	private WebElement laststname;
	
	public void sendlaststname()
	{
		laststname.sendKeys("Appu");
	}
	
	@FindBy(xpath="//input[@id='postal-code']")
	private WebElement postcode;
	
	public void sendpostcode()
	{
		postcode.sendKeys("143");
	}
	
	
	@FindBy(xpath="//button[@id='cancel']")
	private WebElement cancelbutton;
	
	public void clickcancelbutton()
	{
		cancelbutton.click();;
	}
	
	@FindBy(xpath="//input[@id='continue']")
	private WebElement continuebutton;
	
	public void clickcontinuebutton()
	{
		continuebutton.click();;
	}
	
	// constructor
			public BuyPagePOMClass(WebDriver driver)
			{
				this.driver=driver;
				
				PageFactory.initElements( driver,this);
			}
	

}
