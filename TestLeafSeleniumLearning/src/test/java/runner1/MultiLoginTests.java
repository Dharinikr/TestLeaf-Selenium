package runner1;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/java/features1", glue = "steps1", 
monochrome = true, 
//tags = {"@positive,@negative"},
plugin = {"html:reports"})

public class MultiLoginTests extends AbstractTestNGCucumberTests{

}
