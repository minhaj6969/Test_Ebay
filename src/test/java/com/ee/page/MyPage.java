package com.ee.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class MyPage {
	
	WebDriver driver;
	public MyPage(WebDriver driver){
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	public void ph(){
	Select ac = new Select(driver.findElement(By.xpath("//select[@id='gh-cat']")));
	ac.selectByVisibleText("Books");
	ac.getFirstSelectedOption();
		
		
	}
		
	
		

}
