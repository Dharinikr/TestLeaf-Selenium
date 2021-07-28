package week5.day2;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestNgAttributesCreateLead extends TestNgAttributesPreandPost {
	
	
	public ChromeDriver driver;
//invocation count attribute executes the test case given number of time
	//threadpoolsize allocates thread for the test to execute
@Test(invocationCount = 2, threadPoolSize = 2)

//@Test(enabled=false)@Test(enabled=true)-if we give false the particular test case wouldn't run and the result doesn't show in xml

//alwaysRun = true, is an option available. when we know parent test case going to fail we still want to run it to check also to see the other dependent test case 


public void invocationCountCreateLead () {
			 
	        driver = new ChromeDriver();
			driver.findElementByLinkText("Leads").click();
			driver.findElementByLinkText("Create Lead").click();
			driver.findElementById("createLeadForm_companyName").sendKeys("TestLeaf");
			driver.findElementById("createLeadForm_firstName").sendKeys("Gopi");
			driver.findElementById("createLeadForm_lastName").sendKeys("J");
			driver.findElementByName("submitButton").click();
			
	
}
}

