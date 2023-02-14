package com.qa.amazon.stepDefinitions;


import org.testng.Assert;

import com.qa.amazon.pages.HomePage;
import com.qa.amazon.pages.LoginPage;
import com.qa.amazon.util.AmazonTestBase;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class HomePageSteps extends AmazonTestBase {
	LoginPage loginPage;
	HomePage homePage;

@Given("^user on amazon home page$")
public void user_on_amazon_home_page() {
	
	loginPage= new LoginPage();
	homePage=loginPage.Login(prop.getProperty("email"),prop.getProperty("password"));
    homePage=new HomePage();
}

@When("^user on home page get the home page title$")
public void user_on_home_page_get_the_home_page_title() {
	
	String homePageTitle = homePage.validateHomePageTitle();
	Assert.assertEquals(homePageTitle, "Your Account");
}

@Then("^validate searchBox$")
public void validate_searchBox() {
	boolean flag = homePage.validatesearchbox();
	Assert.assertTrue(flag);
	
}

@Then("^validate search button$")
public void validate_search_button() {
	boolean flag=homePage.validateSearchBtn();
	Assert.assertTrue(flag);
}

@Then("^verify account and list link$")
public void verify_account_and_list_link() {
	boolean flag=homePage.validateAccountList();
	Assert.assertTrue(flag);
	
}

@Then("^verify return and order link$")
public void verify_return_and_order_link() {
	boolean flag=homePage.validateReturnOrder();
	Assert.assertTrue(flag);
}

@Then("^validate cart link$")
public void validate_cart_link() {
	boolean flag=homePage.validateCart();
	Assert.assertTrue(flag);
}

@Then("^validate address link$")
public void validate_address_link() {
	boolean flag=homePage.validateAddressLink();
	Assert.assertTrue(flag);
}


}
