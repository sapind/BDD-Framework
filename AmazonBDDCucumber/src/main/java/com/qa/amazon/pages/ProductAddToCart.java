package com.qa.amazon.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.qa.amazon.util.AmazonTestBase;

public class ProductAddToCart extends AmazonTestBase {
	@FindBy(xpath="//select[@id='quantity']")
	WebElement quantity;
	@FindBy(xpath="//input[@id='add-to-cart-button']")
	WebElement addCart;
	@FindBy(xpath="//input[@value='Proceed to checkout']")
	WebElement proceed;
	
	public ProductAddToCart()
	{
		PageFactory.initElements(driver, this);
	
	}
	public void qtyselect(String qty)
	{
		Select  Qty=new Select(driver.findElement(By.xpath("//select[@id='quantity']")));
		Qty.selectByVisibleText(qty);
		
	}
	public void clickOnAddToCart()
	{
		addCart.click();
	}
	public void clickOnProceed()
	{
		proceed.click();
	}
	
	

}
