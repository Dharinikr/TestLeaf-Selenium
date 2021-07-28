package week5.day2.classassignments;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DynamicParaCreateLead extends DynamicPara {


	@DataProvider(name = "Lead")
	public String[][] getData(){
	
		String[][] data =new String[3][3];
		//row 1 
		data[0][0] = "TestLeaf";
		data[0][1] = "Gopi";
		data[0][2] = "J";
		
		//row 2 
				data[1][0] = "TestLeaf";
				data[1][1] = "Babu";
				data[1][2] = "M";
				
		//row 3
				data[2][0] = "TestLeaf";
				data[2][1] = "Sarath";
				data[2][2] = "M";
				
		return data;
	}
	
	@Test(dataProvider = "Lead")
		
	public  void createLead2(String cName,String fName,String lName) {
			
					driver.findElementByLinkText("Leads").click();
					driver.findElementByLinkText("Create Lead").click();
					driver.findElementById("createLeadForm_companyName").sendKeys(cName);
					driver.findElementById("createLeadForm_firstName").sendKeys(fName);
					driver.findElementById("createLeadForm_lastName").sendKeys(lName);
					driver.findElementByName("submitButton").click();
							

		}


}
