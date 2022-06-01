package com.SauceDemo1.POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrderPagePOMClass 
{
private WebDriver driver;
	
	@FindBy(xpath="")
	private WebElement backhome;
	
	public void clickbackhome()
	{
		backhome.click();
	}

}
