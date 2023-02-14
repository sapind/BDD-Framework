package com.qa.amazon.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.amazon.util.AmazonTestBase;

public class PaymentLinkPage extends AmazonTestBase {
	@FindBy(id="shipToThisAddressButton")
	WebElement confirmAddressBtn;
	@FindBy(xpath="//h3[normalize-space()='Choose a payment method']")
	WebElement paymentTitle;
	//@FindBy(css="span[id='pp-PA30xe-68-announce'] span")
	//WebElement paymentBtn;
	
	public PaymentLinkPage()
	{
		PageFactory.initElements(driver, this);
	
	}
	public void clickOnShippingAddress()
	{
		confirmAddressBtn.click();
	}
//	public boolean verifyPaymentBtn()
//	{
//		return paymentBtn.isDisplayed();
//	}
//	public String validatePaymentTitle()
//	{
//		return driver.getTitle();
//		
//	}

}
