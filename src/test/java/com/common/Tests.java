package com.common;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Tests {

	public static void main(String[] args) {
		 WebDriver driver;
		  
			
			System.setProperty("webdriver.gecko.driver","./Browser/geckodriver");
			driver = new FirefoxDriver();
			driver.get("https://www.ebay.com");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
			Actions act = new Actions(driver);
			WebElement we = driver.findElement(By.xpath("(//div[@class='gh-menu'])[1]"));
			act.moveToElement(we).moveToElement(driver.findElement(By.xpath("(//div[@class='gh-submenu gh-eb-o'])[1]"))).click().build().perform();
			
			
			
			//Select ac = new Select(driver.findElement(By.xpath("//select[@id='gh-cat']")));
			//ac.selectByVisibleText("Books");
			//ac.getFirstSelectedOption();
			
			
			
			
		   
			

	}

}
