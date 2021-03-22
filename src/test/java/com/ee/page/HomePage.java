package com.ee.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	WebDriver driver;
	public HomePage(WebDriver driver){
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	public void pag(){
		
		Actions act = new Actions(driver);
		WebElement we = driver.findElement(By.xpath("(//div[@class='gh-menu'])[1]"));
		act.moveToElement(we).moveToElement(driver.findElement(By.xpath("(//div[@class='gh-submenu gh-eb-o'])[1]"))).click().build().perform();
		
		
	}

}
