package com.testrunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		features ="Feature/dropdown.feature",
		glue = "com.stepdef",
		tags = "@dropdown"
		
		
		)

public class TestRunnerD extends AbstractTestNGCucumberTests {

}
