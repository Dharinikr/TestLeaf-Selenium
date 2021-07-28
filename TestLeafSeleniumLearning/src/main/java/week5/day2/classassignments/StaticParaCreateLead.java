package week5.day2.classassignments;

import org.testng.annotations.Test;

public class StaticParaCreateLead extends StaticPara{
	
//public ChromeDriver driver ;
	@Test
	public void staticParaCreateLead() {
	    //ChromeDriver driver=new ChromeDriver();
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Create Lead").click();
		driver.findElementById("createLeadForm_companyName").sendKeys("TestLeaf");
		driver.findElementById("createLeadForm_firstName").sendKeys("Gopi");
		driver.findElementById("createLeadForm_lastName").sendKeys("J");
		driver.findElementByName("submitButton").click();
		
}
}


