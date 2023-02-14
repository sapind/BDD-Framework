package com.qa.amazon.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.amazon.util.AmazonTestBase;

public class HomePage extends AmazonTestBase {
	@FindBy(xpath="//input[@id='twotabsearchtextbox']")
	WebElement textBox;
	@FindBy(xpath="//input[@id='nav-search-submit-button']")
	WebElement searchBtn;
	@FindBy(xpath="//a[@aria-label='Amazon.ca']")
	WebElement homeLogolink;
	@FindBy(xpath="//span[@id='nav-global-location-data-modal-action']")
	WebElement addresslink;
    @FindBy(xpath="//a[@id='nav-link-accountList']")
    WebElement accountList;
    @FindBy(xpath="//a[@id='nav-orders']")
    WebElement returnOrder;
    @FindBy(xpath="//div[@id='nav-cart-text-container']")
    WebElement cart;
   
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	public String validateHomePageTitle()
	
	{
		return driver.getTitle();
		
	}
	
	public boolean validatesearchbox(){
		return textBox.isDisplayed();
		
	}
	public boolean validateSearchBtn() {
		return searchBtn.isDisplayed();
		
	}
	public boolean validateAddressLink()
	{
		return addresslink.isDisplayed();
		
	}
	public boolean validateHomePageLogo()
	{
		return homeLogolink.isDisplayed();
		
	}
	public boolean validateAccountList()
	{
		return accountList.isDisplayed();
		
	}
	public boolean validateReturnOrder()
	{
		return returnOrder.isDisplayed();
		
	}
	public boolean validateCart()
	{
		return cart.isDisplayed();
		
	}
	

}
