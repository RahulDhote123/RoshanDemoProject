package com.SauceDemo1.POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPagePOMClass 
{
	private WebDriver driver;
	//2.find the elements by @FindBY
	
		@FindBy(xpath="//input[@id='user-name']")
		private WebElement username;
		
		
		//actions on element -method
		public void sendUsername()
		{
			username.sendKeys("standard_user");
		}
		
		@FindBy(xpath="//input[@id='password']")
		private WebElement password;
		public void sendpassword()
		{
	        password.sendKeys("secret_sauce");
		}
		
		@FindBy(xpath="//input[@id='login-button']")
		private WebElement loginbutton;
		public void clickloginbutton()
		{
	        loginbutton.click();
		}
		
		// constructor
		public LoginPagePOMClass(WebDriver driver)
		{
			this.driver=driver;
			
			PageFactory.initElements( driver,this);
		}

}
