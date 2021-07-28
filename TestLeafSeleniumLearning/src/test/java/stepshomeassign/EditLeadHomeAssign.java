package stepshomeassign;

import org.openqa.selenium.WebElement;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class EditLeadHomeAssign extends BaseClassHomeAssign {
	
	
	@Given(("click on leads link"))
	public void leadsLink() {
		driver.findElementByLinkText("Leads").click();
	}
	
	@And("click on find leads")
	public void findLeads() {
		driver.findElementByLinkText("Find Leads").click();
	}
		
	@And("click on phone tab")
	public void phoneTab() {
		driver.findElementByXPath("//span[text()='Phone']").click();
	}
	
	@And("enter phone number")
	public void phoneNumber() {
		driver.findElementByXPath("//input[@name='phoneNumber']").sendKeys("99");
	}
	
	@And("click on find leads1")
	public void findLeads1() throws InterruptedException {
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(2000);
	}
	
	
	
	@And("click on first result")
	public void firstResult() {
		driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]").click();
		
	}
	
	@And("click on edit")
	public void editClick() {
		driver.findElementByLinkText("Edit").click();
	}
	
	@And("get the existing company name")
    public void existingCompName() {
		WebElement oldCompName = driver.findElementById("updateLeadForm_companyName");
		String oldCompanyName = oldCompName.getAttribute("value");
		System.out.println("The old company name is " + oldCompanyName);
		
	}
	
	@And("delete the existing company name")
	public void deleteCompName() throws InterruptedException {
		driver.findElementById("updateLeadForm_companyName").clear();
		Thread.sleep(2000);
	}
	
	@And("give the new company name")
	public void newCompName() {
		driver.findElementById("updateLeadForm_companyName").sendKeys("TestLeafChennaiTN");
		
	}
	
	@And("click update")
	public void clickUpdate() {
	   driver.findElementByName("submitButton").click();
	}
	
	@Then("print the updated company name")
	public void updtdCompName() {
		WebElement updatedCompName = driver.findElementById("viewLead_companyName_sp");
		String newCompanyName = updatedCompName.getText();
		System.out.println("The new company name is " + newCompanyName);
	}

}
	
	
	
	

