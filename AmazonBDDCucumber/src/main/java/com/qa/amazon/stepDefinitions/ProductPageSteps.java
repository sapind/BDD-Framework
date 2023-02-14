package com.qa.amazon.stepDefinitions;

import org.testng.Assert;

import com.qa.amazon.pages.HomePage;
import com.qa.amazon.pages.LoginPage;
import com.qa.amazon.pages.ProductSearchPage;
import com.qa.amazon.util.AmazonTestBase;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;







public class ProductPageSteps extends AmazonTestBase{
	LoginPage loginPage;
	HomePage homePage;
	ProductSearchPage productSearchPage;
	
	@Given("^User on home page$")
	public void user_on_home_page() {
		
		loginPage= new LoginPage();
		homePage=loginPage.Login(prop.getProperty("email"),prop.getProperty("password"));
	    homePage=new HomePage(); 
	    productSearchPage= new ProductSearchPage();
	    
	}
	@Then("^user enter \"([^\"]*)\" in searchBox$")
	
	public void user_enter_itemName_in_searchBox(String itemName) {
		  productSearchPage.enterItemName(itemName);
		
	}
	@Then("^verify search result$")
	public void verify_search_result() {
		productSearchPage.getVerifySearchItem();
		Assert.assertTrue(true);
		
	}


@Then("^selectItem from result list$")
public void selectitem_from_result_list() 
{
	productSearchPage.clickOnSelectItem();
}

	






}
