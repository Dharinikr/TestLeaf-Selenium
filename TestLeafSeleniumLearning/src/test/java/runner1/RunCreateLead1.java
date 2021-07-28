package runner1;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/java/features1", glue = "steps1", 
monochrome = true, plugin = {"html:reports"})

public class RunCreateLead1 extends AbstractTestNGCucumberTests { 
	
	

}
