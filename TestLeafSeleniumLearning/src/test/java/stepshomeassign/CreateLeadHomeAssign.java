package stepshomeassign;

import org.openqa.selenium.WebElement;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateLeadHomeAssign extends BaseClassHomeAssign {

		public String leadStatus;
		public String res = "Assigned";

		@Given("Click on the leads link")
		public void leadsLink(){
			driver.findElementByLinkText("Leads").click();
		}
		
		@And("Click on the create lead")
			public void createLead(){
			driver.findElementByLinkText("Create Lead").click();
		}
		
		@And("Enter the company name")
		public void companyName(){
			driver.findElementById("createLeadForm_companyName").sendKeys("TestLeaf");
	}
		
		@And("Enter the first name")
		public void firstName() {
			driver.findElementById("createLeadForm_firstName").sendKeys("Hari");
		}
		
		@And("Enter the last name")
		public void lastName() {
			driver.findElementById("createLeadForm_lastName").sendKeys("RKrishnan");
		}
		@And("Click on create lead submit button")
		public void createLeadSubmitButton() {
			driver.findElementByName("submitButton").click();
		}
		
		@When("Status is assigned")
		public void statusCheck() {
			WebElement status = driver.findElementById("viewLead_statusId_sp");
			leadStatus = status.getText();
			System.out.println(leadStatus);
							
	}
		
		@Then("Lead is created successfully")
		public void statusMessage() {
		
			if(leadStatus.equalsIgnoreCase(res)) {
				System.out.println("Lead details created successfully");
				
			}
			else {
				System.out.println("Lead creation is not successful");
			
			}
	
	}	
}
		


