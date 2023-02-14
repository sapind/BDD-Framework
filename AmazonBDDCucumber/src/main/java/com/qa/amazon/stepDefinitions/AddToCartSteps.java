package com.qa.amazon.stepDefinitions;

import com.qa.amazon.pages.HomePage;
import com.qa.amazon.pages.LoginPage;
import com.qa.amazon.pages.ProductAddToCart;
import com.qa.amazon.pages.ProductSearchPage;
import com.qa.amazon.util.AmazonTestBase;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;






public class AddToCartSteps extends AmazonTestBase {
	LoginPage loginPage;
	HomePage homePage;
	ProductSearchPage productSearchPage;
	ProductAddToCart productAddToCart;
	
	
	@Given("^user on selected item page$")
	public void user_on_selected_item_page() {
		
		loginPage= new LoginPage();
		homePage=loginPage.Login(prop.getProperty("email"),prop.getProperty("password"));
	    homePage=new HomePage(); 
	    productSearchPage= new ProductSearchPage();
	    productSearchPage.enterItemName("Book");
	    productSearchPage.clickOnSelectItem();
	    productAddToCart= new ProductAddToCart(); 
	}

	@Then("^user select item qty\"([^\"]*)\"$")
public void user_select_item_quantity(String qty) {
		
	  productAddToCart.qtyselect(qty);
		
}

	@Then("^user click on add to cart button$")
	public void user_click_on_add_to_cart_button() {
		
		productAddToCart.clickOnAddToCart();
		
	}

	@Then("^user click to proceed to checkout$")
	public void user_click_to_proceed_to_checkout() {
		productAddToCart.clickOnProceed();
	}
	
}
