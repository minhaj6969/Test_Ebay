package com.stepdef;

import org.openqa.selenium.WebDriver;

import com.common.Base;
import com.ee.page.HomePage;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MouseHover extends Base {
	
	WebDriver driver;
	
	HomePage hpe;
	
	
	@When("^I hover the mouse on my ebay$")
	public void i_hover_the_mouse_on_my_ebay() throws Throwable {
		driver = getdriver();
		hpe = new HomePage(driver);
		hpe.pag();
	   
	    
	}

	@When("^I hover on watch list$")
	public void i_hover_on_watch_list() throws Throwable {
	   
	    
	}

	@Then("^I Successfully get the page$")
	public void i_Successfully_get_the_page() throws Throwable {
	   
	    
	}


}
