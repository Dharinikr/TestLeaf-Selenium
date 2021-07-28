package steps1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead1 {
	public ChromeDriver driver;
	public String leadStatus;
	public String res = "Assigned";
	
	
	@Given("open the chrome browser")
	public void openBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
	}
	
	@And("load the application url")
		public void loadUrl() {
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
}
	
	@And("enter username as demosalesmanager")
	public void username() {
		driver.findElementById("username").sendKeys("demosalesmanager");
	}
	
	@And("enter password as crmsfa")
	public void password(){
	     driver.findElementById("password").sendKeys("crmsfa");
	}
	
	@And("click on the login button")
	public void clickLogin(){
		driver.findElementByClassName("decorativeSubmit").click();
	}
	
	@And("click on the crmsfa link")
	public void clickCrmsfa(){
		driver.findElementByLinkText("CRM/SFA").click();
}

	@And("click on the leads link")
	public void leadsLink(){
		driver.findElementByLinkText("Leads").click();
	}
	
	@And("click on the create lead")
		public void createLead(){
		driver.findElementByLinkText("Create Lead").click();
	}
	
	@And("enter the company name")
	public void companyName(){
		driver.findElementById("createLeadForm_companyName").sendKeys("TestLeaf");
}
	
	@And("enter the first name")
	public void firstName() {
		driver.findElementById("createLeadForm_firstName").sendKeys("Hari");
	}
	
	@And("enter the last name")
	public void lastName() {
		driver.findElementById("createLeadForm_lastName").sendKeys("RKrishnan");
	}
	@And("click on create lead submit button")
	public void createLeadSubmitButton() {
		driver.findElementByName("submitButton").click();
	}
	
	@When("status is assigned")
	public void statusCheck() {
		WebElement status = driver.findElementById("viewLead_statusId_sp");
		leadStatus = status.getText();
		System.out.println(leadStatus);
		//return leadStatus;				
}
	
	@Then("lead is created successfully")
	public void statusMessage() {
	//public static void main() {
		//CreateLead1 leadCreation = new CreateLead1();
		//String result = leadCreation.statusCheck();
		//String res = "Assigned";
		
		if(leadStatus.equalsIgnoreCase(res)) {
			System.out.println("Lead details created successfully");
			
		}
		else {
			System.out.println("Lead creation is not successful");
		
		}
		
}
	
}	
	
	
	
	
	
	