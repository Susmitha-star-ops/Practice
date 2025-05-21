package cucumbertests;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(dryRun = false,
monochrome = true,
plugin = {"pretty",
		"html:target/report3.html"},
features="requirements",
glue="stepdefinitions",
tags = "@valid")
public class TestRunner {

}
