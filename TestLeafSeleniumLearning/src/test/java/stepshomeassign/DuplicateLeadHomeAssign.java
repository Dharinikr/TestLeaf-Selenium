package stepshomeassign;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class DuplicateLeadHomeAssign extends BaseClassHomeAssign {
	
public  String firstname="";
	
	
	
	@Given("Click on FindLead Tags name")
	public void click_FindLead() throws InterruptedException
	{
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElementByXPath("//a[text()='Find Leads']").click();
		Thread.sleep(1000);
	}
	
	@Given("Click on email")
	public void click_email()
	{
		driver.findElementByXPath("//span[text()='Email']").click();
	}
	@Given("set the values as babu")
	public void enter_Email()
	{
		driver.findElementByXPath("//input[@name='emailAddress']").sendKeys("babu@testleaf.com");
	}
	@Then("click find leads")
	public void click_findLeadbutton()
	
	{
		@SuppressWarnings("deprecation")
		WebDriverWait wait=new WebDriverWait(driver, 20);
		
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElementByXPath("//button[text()='Find Leads']")));
		 driver.findElementByXPath("//button[text()='Find Leads']").click();
		
	
	}
	@SuppressWarnings("deprecation")
	@Then("select the first_cell")
	public void save_firstcell() throws InterruptedException
	{
		Thread.sleep(1000);
		WebDriverWait wait=new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/child::a")));

		driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/child::a").click();
	}
	@And("click on Duplicate_Lead Button")
	public void click_Duplicatebutton()
	{
		driver.findElementByXPath("//a[@class='subMenuButton'][text()='Duplicate Lead']").click();
        
	}

	@And("click on Create_button")
	public void click_submit_button()
	{
		driver.findElementByXPath("//input[@class='smallSubmit'and @name='submitButton']").click();
		String Title=driver.getTitle();
        System.out.println(Title);
	}


}
