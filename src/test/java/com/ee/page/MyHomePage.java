package com.ee.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyHomePage {
	
	public WebDriver driver;
	public MyHomePage(WebDriver driver){
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	
	}
	@FindBy(xpath ="//input[@id='gh-ac']")
	WebElement gettext;
	public WebElement gettext(){
		return gettext;
		
		
	}
	@FindBy(xpath ="//input[@id='gh-btn']")
	WebElement getclick;
	public WebElement getclick(){
		return getclick;
		
		
	}
	@FindBy(xpath ="//span[@class='cbx x-refine__multi-select-cbx']")
	WebElement getcl;
	public WebElement getcl(){
		return getcl;
		
		
	}
	@FindBy(xpath ="(//img[@class='s-item__image-img'])[1]")
	WebElement getck;
	public WebElement getck(){
		return getck;
		
		
	}
	@FindBy(xpath ="(//span[@class='vi-atw-txt'])[1]")
	WebElement getclk;
	public WebElement getclk(){
		return getclk;
		
		
	}
	

}
