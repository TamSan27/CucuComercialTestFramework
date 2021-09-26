package com.application.framework.Runners;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
 
@RunWith(Cucumber.class)

@CucumberOptions(features="Features", glue="com\\application\\framework\\StepDefinitions")

public class Runner {

}
