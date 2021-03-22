package com.common;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Screen {
	
	public static void ms (WebDriver driver , String sc) throws Throwable{
		
		TakesScreenshot sht = (TakesScreenshot) driver;
		File f = sht.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile (f, new File (sc+".png"));
				
				
		
		
		
	}

}
