package com.qa.amazon.stepDefinitions;

import com.qa.amazon.pages.HomePage;
import com.qa.amazon.pages.LoginPage;
import com.qa.amazon.pages.PaymentLinkPage;
import com.qa.amazon.pages.ProductAddToCart;
import com.qa.amazon.pages.ProductSearchPage;
import com.qa.amazon.util.AmazonTestBase;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;



public class PaymentLinkSteps extends AmazonTestBase{
	LoginPage loginPage;
	HomePage homePage;
	ProductSearchPage productSearchPage;
	ProductAddToCart productAddToCart;
	PaymentLinkPage paymentLinkPage;
	
	
	
	
	@Given("^user on Payment Page$")
	public void user_on_Payment_Page() {
		
		loginPage= new LoginPage();
		homePage=loginPage.Login(prop.getProperty("email"),prop.getProperty("password"));
	    homePage=new HomePage(); 
	    productSearchPage= new ProductSearchPage();
	    productSearchPage.enterItemName("Book");
	    productSearchPage.clickOnSelectItem();
	    productAddToCart= new ProductAddToCart();
	    productAddToCart.clickOnAddToCart();
	    productAddToCart.clickOnProceed();
	    paymentLinkPage=new PaymentLinkPage();
	    
	    
	    
	}

	@Then("^verify Shipping Address$")
	public void verify_Shipping_Address() {
		paymentLinkPage.clickOnShippingAddress();
	}


}
