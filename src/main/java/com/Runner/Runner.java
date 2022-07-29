package com.Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features={"C:\\Users\\chandni\\Documents\\Exit_Test\\src\\main\\java\\com\\Features"},
	    glue= {"com.stepDefinations"}
		)
public class Runner extends AbstractTestNGCucumberTests {

}

