package com.test;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;



@RunWith(Cucumber.class)
@CucumberOptions(features="src/com/test/Test.feature",glue = {"com.test"},monochrome = true, dryRun = false, strict = false, plugin ={"pretty:STDOUT"})
public class Runner extends AbstractTestNGCucumberTests{

	
}
