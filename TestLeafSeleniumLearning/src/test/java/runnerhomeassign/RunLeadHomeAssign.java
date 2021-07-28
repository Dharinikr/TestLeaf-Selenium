package runnerhomeassign;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/java/featureshomeassign", glue = "stepshomeassign", 
	monochrome = true, plugin = {"html:reports"})

	public class RunLeadHomeAssign extends AbstractTestNGCucumberTests { 
		

	}
	


