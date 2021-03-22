package com.stepdef;


import com.common.Base;
import com.common.ScreenShot;
import com.ee.page.MyHomePage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Searchdef extends Base {
	
	MyHomePage ph;
	
	@Given("^I am on the home page$")
	public void i_am_on_the_home_page() throws Throwable {
		
		driver = getdriver();
	    
	    
	}

	@When("^I enter text$")
	public void i_enter_text() throws Throwable {
		
		ph = new MyHomePage(driver);
		ph.gettext().sendKeys("Books");
		ScreenShot.ss(driver, "Books");
		
		
	    
	    
	}

	@When("^I click on search button$")
	public void i_click_on_search_button() throws Throwable {
	    ph.getclick().click();
	    ScreenShot.ss(driver, "Books");
	    
	}

	@When("^I click on paperback$")
	public void i_click_on_paperback() throws Throwable {
		
		ph.getcl().click();
		ScreenShot.ss(driver, "Books");
	    
	    
	}

	@When("^I click on  Sourthern keto$")
	public void i_click_on_Sourthern_keto() throws Throwable {
	    ph.getck().click();
	    ScreenShot.ss(driver, "Books");
	    
	}

	@When("^I click on add to watchlist$")
	public void i_click_on_add_to_watchlist() throws Throwable {
		ph.getclk().click();
		ScreenShot.ss(driver, "Books");
	    
	    
	}

	@Then("^I successfully get the page$")
	public void i_successfully_get_the_page() throws Throwable {
	    Assert.assertEquals(driver.getTitle(), "Sign in or Register | eBay");
	    System.out.println(driver.getTitle());
	    driver.quit();
	    
	    
	}

}
