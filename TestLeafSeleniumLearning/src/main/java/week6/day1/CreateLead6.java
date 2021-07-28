package week6.day1;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CreateLead6 extends BaseClass {
	
	@BeforeTest
	public void setFileName(){
		excelFileName="CreateLead";
		
	}
	
	@Test(dataProvider = "fetchData")
	public void runCreateLead(String fName, String lName, String company) {
	
	driver.findElementByLinkText("Create Lead").click();
	driver.findElementById("createLeadForm_companyName").sendKeys(company);
	driver.findElementById("createLeadForm_firstName").sendKeys(fName);
	driver.findElementById("createLeadForm_lastName").sendKeys(lName);
	driver.findElementByName("submitButton").click();
	}
	
	/*//as these steps are common for create lead and edit lead, keep it in base class
	@DataProvider(name = "fetchData")
	
   public String[][] sendData() throws IOException {
	ReadExcelData red = new ReadExcelData();
	String[][] data = red.readExcel("CreateLead");
	
	return data;
	}*/

}

