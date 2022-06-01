package com.SauceDemo1.POMClasses;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePagePOMClass 
{
private WebDriver driver;
	
	
	@FindBy(xpath="//button[@id='add-to-cart-sauce-labs-backpack']")
	private WebElement bagproduct ;
	public void clickbag()
	{
		bagproduct.click();
	}
	

	@FindBy(xpath="//button[@id='add-to-cart-sauce-labs-onesie']")
	private WebElement onisie;
	public void clickonisie()
	{
		onisie.click();
	}
	
	@FindBy(xpath="//button[@id='add-to-cart-sauce-labs-bike-light']")
	private WebElement bikelight;
	public void clickbikelight()
	{
		bikelight.click();
	}
	
	@FindBy(xpath="//button[@id='add-to-cart-sauce-labs-bike-light']")
	private WebElement bolttshirt;
	public void clickbolttshirt()
	{
		bolttshirt.click();
	}
	
	@FindBy(xpath="//button[@id='add-to-cart-test.allthethings()-t-shirt-(red)']")
	private WebElement redtshirt;
	public void clickredtshirt()
	{
		redtshirt.click();
	}
	
	
	
	@FindBy(xpath="//button[@id='add-to-cart-sauce-labs-fleece-jacket']")
	private WebElement jacket ;
	public void clickjacket()
	{
		jacket.click();
	}
	
	
	@FindBy(xpath="//button[text()='Open Menu']")
	private WebElement menubutton ;
	public void clickmenubutton()
	{
		menubutton.click();
	}
	
	@FindBy(xpath="//a[@id='about_sidebar_link']")
	private WebElement aboutbutton ;
	public void clickaboutbutton()
	{
		aboutbutton.click();
	}
	
	@FindBy(xpath="//a[@id='logout_sidebar_link']")
	private WebElement logoutbutton ;
	public void clicklogoutbutton()
	{
		logoutbutton.click();
	}
	
	@FindBy(xpath="//select[@class='product_sort_container']")
	private WebElement filterbutton ;
	public void clickfilterbutton()
	{
		filterbutton.click();
	}
	
	@FindBy(xpath="//a[@class='shopping_cart_link']")
	private WebElement AddToCard ;
	public void clickAddToCard()
	{
		AddToCard.click();
	}
	
	
	
	@FindBy(xpath="//a[@class='shopping_cart_link']")
	private WebElement cartbutton ;
	public String getTextFromcartlinkedbutton()
	{
		String totalproduct = cartbutton.getText();
		return totalproduct;
	}
	
	
	@FindBy(xpath="//button[text()='Add to cart']")
	private List<WebElement> multipleProductAddToCart ;
	
	public void addtocartAllProduct ()
	{
		for(int i=0; i<multipleProductAddToCart.size();i++)
		{
			multipleProductAddToCart.get(i).click();
		}
	}
	
	// constructor
	public HomePagePOMClass (WebDriver driver)
	{
		this.driver=driver;
		
		PageFactory.initElements( driver,this);
	}

}
