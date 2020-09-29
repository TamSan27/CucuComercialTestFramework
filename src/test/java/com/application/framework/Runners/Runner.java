package com.application.framework.Runners;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
 
@RunWith(Cucumber.class)
@CucumberOptions(features="Features/test.feature", glue="com\\application\\framework\\StepDefinitions", dryRun = false)

public class Runner {

}
