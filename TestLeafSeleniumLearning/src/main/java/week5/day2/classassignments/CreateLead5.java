package week5.day2.classassignments;

import org.testng.annotations.Test;

public class CreateLead5 extends PreandPost {

	
      @Test
  public  void createLead5() {
		
			
						driver.findElementByLinkText("Leads").click();
						driver.findElementByLinkText("Create Lead").click();
						driver.findElementById("createLeadForm_companyName").sendKeys("HCL");
						driver.findElementById("createLeadForm_firstName").sendKeys("Hari");
						driver.findElementById("createLeadForm_lastName").sendKeys("Radhakrishnan");
						driver.findElementByName("submitButton").click();
						

	}


}
