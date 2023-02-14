package com.qa.amazon.stepDefinitions;
import org.testng.Assert;

import com.qa.amazon.pages.HomePage;
import com.qa.amazon.pages.LoginPage;
import com.qa.amazon.util.AmazonTestBase;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;



public class LoginPageSteps extends AmazonTestBase {
	
	
	
	LoginPage loginPage;
	HomePage homePage;
	
	@Before
	public void setup()
	{
		System.out.println("SetUp method excuted....");
		AmazonTestBase.initialization();
	}
	@Given("^Open Amazon Sign In browser$")
	public void open_Amazon_Sign_In_browser() {
		
		loginPage= new LoginPage();
	}

	@Then("^Validate Amazon Logo$")
	public void validate_Amazon_Logo() {
		boolean flag=loginPage.validateAmazonLogo();
		Assert.assertTrue(flag);
	}

	@Then("^Validate Login Page Title$")
	public void validate_Login_Page_Title() {
		
		String title =loginPage.validateLoginPageTitle();
		Assert.assertEquals(title,"Amazon Sign In"); 
	}

	@Then("^User enter username and password$")
	public void user_enter_username_and_password() {
		loginPage.Login(prop.getProperty("email"),prop.getProperty("password"));
		
	}
	@After
	public void teardown()
	{
		System.out.println("Tear down method excuted....");
		driver.quit();
		
	}

	


}
