package com.SauceDemo1.POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPagePOMClass
{
   private WebDriver driver;
	
	@FindBy(xpath="//button[@id='remove-sauce-labs-onesie']")
	private WebElement onisie;
	public void clickonisie()
	{
		onisie.click();
	}
	
	@FindBy(xpath="//button[@id='remove-sauce-labs-bike-light']")
	private WebElement bikelight;
	public void clickbikelight()
	{
		bikelight.click();
	}
	
	@FindBy(xpath="//button[@id='remove-sauce-labs-bolt-t-shirt']")
	private WebElement bolttshirt;
	public void clickbolttshirt()
	{
		bolttshirt.click();
	}
	
	@FindBy(xpath="//button[@id='remove-test.allthethings()-t-shirt-(red)']")
	private WebElement redtshirt;
	public void clickredtshirt()
	{
		redtshirt.click();
	}
	
	@FindBy(xpath="//button[@id='remove-sauce-labs-backpack']")
	private WebElement bag ;
	public void clickbag()
	{
		bag.click();
	}
	
	@FindBy(xpath="//button[@id='remove-sauce-labs-fleece-jacket']")
	private WebElement jacket ;
	public void clickjacket()
	{
		jacket.click();
	}
	@FindBy(xpath="//button[@id='continue-shopping']")
	private WebElement continueshopping ;
	public void clickcontinueshopping()
	{
		continueshopping.click();
	}
	
	@FindBy(xpath="//button[@id='checkout']")
	private WebElement checkout ;
	public void clickcheckout()
	{
		checkout.click();
	}

	// constructor
			public CartPagePOMClass(WebDriver driver)
			{
				this.driver=driver;
				
				PageFactory.initElements( driver,this);
			}
	
}
