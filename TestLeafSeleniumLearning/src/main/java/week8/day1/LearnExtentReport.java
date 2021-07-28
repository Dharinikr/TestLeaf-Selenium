package week8.day1;

import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class LearnExtentReport {

	public static void main(String[] args) throws IOException {
	
		// TO create the physical HTML report 
    ExtentHtmlReporter reporter = new ExtentHtmlReporter("./ExtentReports/result.html");
	
    //create ExtentReports folder manually only for first time
    //to maintain the history
    reporter.setAppendExisting(true);
    
	//to get the actual report
    ExtentReports extent = new ExtentReports();
	
    extent.attachReporter(reporter);
    
    //to create a test case with testcase details
    ExtentTest testcase1 = extent.createTest("LoginAndLogout", "LeafTaps login and logout");
	testcase1.assignAuthor("Hari");
	testcase1.assignCategory("smoke");
	
	//step level status
	//../ is to give to come out of result folder; ./ to go into 
	testcase1.pass("username demosalesmanager entered successfully", MediaEntityBuilder.createScreenCaptureFromPath(".././snapshot/username.png").build());
	//testcase1.pass("username demosalesmanager entered successfully");
	
	//testcase1.pass("password crmsfa entered successfully", MediaEntityBuilder.createScreenCaptureFromPath(".././snapshot/username.png").build());
	testcase1.pass("password crmsfa entered successfully");
	
	
	//testcase1.pass("login button clicked successfully");
	testcase1.fail("login button not clicked successfully");
	
	//MANDATORY
	//to have all the information in report
	extent.flush();
	
	
	
	}

}
