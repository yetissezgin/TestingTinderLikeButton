package com.tinder.TestRunner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
	features="src/com/tinder/Steps/Tinder.feature",
	glue= {"com/tinder/Test"}
)

public class TestRunner {

}
