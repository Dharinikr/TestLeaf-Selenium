package stepshomeassign;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

public class DeleteLeadHomeAssign extends BaseClassHomeAssign{
	
	@Given("Click on the leads link for delete lead")
	public void leadsLink(){
		driver.findElementByLinkText("Leads").click();
	}
	
	@Given("Click on the Find Lead on leaftaps application")
	public void click_FindLead() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.findElementByXPath("//a[@class='selected']").click();
	}
	
	@Given("Click on PhoneNumber")
	public void click_phonenumber()
	{
		driver.findElementByXPath("//span[text()='Phone']/..").click();
	}
	
	@Given("enter on phonenumber as 88")
	public void enter_number()
	{
		driver.findElementByXPath("//input[@name='phoneNumber']").sendKeys("88");
	}
	@Given("select the first row coloum")
	public void select_firstrow()
	{
		driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a").click();
	}
	
	
	
	
	@And("click on Delete Button")
	public void clickOn_deleteButton()
	{
		 driver.findElementByXPath("//a[text()='Delete']").click();
	}



}
