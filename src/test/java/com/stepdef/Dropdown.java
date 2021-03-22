package com.stepdef;

import org.openqa.selenium.WebDriver;

import com.common.Base;
import com.ee.page.MyPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Dropdown extends Base {
	
	WebDriver driver;
	MyPage Mh;
	
	
	
	
	@When("^I click on the dropdown$")
	public void i_click_on_the_dropdown() throws Throwable {
		driver = getdriver();
	    Mh = new MyPage(driver);
	    Mh.ph();
	    
	    
	}

	@When("^I click on the books$")
	public void i_click_on_the_books() throws Throwable {
	    
	    
	}

	@Then("^I successfully land on books page$")
	public void i_successfully_land_on_books_page() throws Throwable {
	    
	    
	}

}
