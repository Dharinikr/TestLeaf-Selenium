package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//@CucumberOptions(features = give path of the file, glue = give the package name)
@CucumberOptions(features ="src/test/java/features",
		glue = "steps", 
        monochrome = true,
       // tags = {"@functional","@smoke"}, //scenario with both the tags
        plugin = {"html:reports"}
		) 

public class RunLogin extends AbstractTestNGCucumberTests {	
}
//@CucumberOptions(features = {"src/test/java/features/Login.feature", "src/test/java/features/CreateLead.feature"} or give src/test/java/features
//dryRun=true, 
//snippets = SnippetType.CAMELCASE


//snippets will create methods automatically according to the steps given in the cucumber file. method name comes with underscore.
//so to remove underscore we use this dryRun=true,snippets = SnippetType.CAMELCASE. DRYRUN AND SNIPPETS HAVE TO BE COMMENTED IN ACTUAL RUN, OR ELSE TEST WILL BE SKIPPED


//AbstractTestNGCucumberTests this class name need to give so that testng can be accessed
	//monochrome=true ---- to remove junk values from console

//tags = {"@functional"}-to execute only functional
//tags = {"@functional,@regression"}-to execute either functional or regression
//tags = {"~@functional"}-except functional all other scenarios will be executed
	 //tags = {"~@functional,@regression"}-in this case only regression will get executed
	
	

