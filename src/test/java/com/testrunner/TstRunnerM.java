package com.testrunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		
		
		features ="Features/MouseHover.feature",
		glue = "com.stepdef",
		tags = "MouseHover"
		
		
		
		)

public class TstRunnerM extends AbstractTestNGCucumberTests {

}
