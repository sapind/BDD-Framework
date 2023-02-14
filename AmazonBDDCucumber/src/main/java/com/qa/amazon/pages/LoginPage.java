package com.qa.amazon.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.amazon.util.AmazonTestBase;

public class LoginPage extends AmazonTestBase {
	// @page factory
		@FindBy(xpath="//i[@aria-label='Amazon']")
		WebElement amazonLogo;
		@FindBy(name="email")
		WebElement emailText;
		@FindBy(id="continue")
		WebElement continueBtn;
		@FindBy(id="ap_password")
		WebElement passwordText;
		@FindBy(id="auth-signin-button")
		WebElement signBtn;
		
		public LoginPage()
		{
			PageFactory.initElements(driver, this);
		}
		public boolean validateAmazonLogo()
		{
			return amazonLogo.isDisplayed();
			
		}
		
		public String validateLoginPageTitle()
		{
			return driver.getTitle();	
		}
	  
	    public HomePage Login(String email, String pwd)
	    
	    {
	    	emailText.sendKeys(email);
	    	continueBtn.click();
	    	passwordText.sendKeys(pwd);
	    	signBtn.click();
	    	
			return new HomePage();
	    }
			
	    	
	    }

