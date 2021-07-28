package steps;

import io.cucumber.java.en.Given;

public class CreateLead extends BaseClass {
	
	@Given("click on crmsfa link")
	public void clickCrmsfa() {
		//driver.findElementById("label").click();
		//driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByXPath("//div[@id='label']/a").click();
		
	}
	
	@Given("click on Lead link")
	public void clickLeads() {
		driver.findElementByLinkText("Leads").click();
		
	}
}
