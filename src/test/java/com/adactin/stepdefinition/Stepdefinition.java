package com.adactin.stepdefinition;

import org.openqa.selenium.WebDriver;

import com.adactin.baseclass.BaseClass;
import com.adactin.manager.PageObjectManager;
import com.adactin.pom.LoginPage;
import com.adactin.runner.TestRunner;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;






public class Stepdefinition extends BaseClass{
	
	public static WebDriver driver = TestRunner.driver;
	PageObjectManager pom = new PageObjectManager(driver);
	//LoginPage lp = new LoginPage(driver);
	
	
	
	
	@Given("^user launch the appliction$")
	public void user_launch_the_appliction() {
		getUrl("https://adactinhotelapp.com/index.php");
	      
	     
	}
	
	@When("^user enters the valid username \"([^\"]*)\" in the username field$")
	public void user_enters_the_valid_username_in_the_username_field(String username) throws Throwable {
	    valueToElement(pom.getLp().getUserName(), username );
	}

	@When("^User enters the valid password \"([^\"]*)\" in the password field$")
	public void user_enters_the_valid_password_in_the_password_field(String password) throws Throwable {
	    valueToElement(pom.getLp().getPassword(), password);
	}

		@When("^user is able to click the login button$")
	public void user_is_able_to_click_the_login_button()    {
	      clickOnElement(pom.getLp().getLogin());
	     
	}

	@Then("^User verify the hompage lands on to search hotel$")
	public void user_verify_the_hompage_lands_on_to_search_hotel()  {
		
	}


}
