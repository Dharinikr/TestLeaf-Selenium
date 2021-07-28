package Week2HomeAssignments;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class A2EditLead {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.findElementById("username").sendKeys("demosalesmanager");
		driver.findElementByName("PASSWORD").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Find Leads").click();
		driver.findElementByXPath("(//input[@name='firstName'])[3]").sendKeys("hari");
		driver.findElementByXPath("(//button[@class='x-btn-text'])[7]").click();
		Thread.sleep(2000);
		driver.findElementByLinkText("Hari").click();
		System.out.println(driver.getTitle());
		driver.findElementByLinkText("Edit").click();
		
		driver.findElementById("updateLeadForm_companyName").clear();
		driver.findElementById("updateLeadForm_companyName").sendKeys("abc");
		driver.findElementByClassName("smallSubmit").click();
		//System.out.println(driver.findElementByClassName("tabletext").getText());
		//driver.close();
		
		
		/*Ex1P:
		 driver.get("http://leaftaps.com/opentaps/control/main");
        Thread.sleep(2000);
    	driver.findElementByXPath("//input[@id='username']").sendKeys("demosalesmanager");
		driver.findElementByXPath("//input[@id='password']").sendKeys("crmsfa");
		driver.findElementByXPath("//input[@class='decorativeSubmit']").click();
		driver.findElementByXPath("//a[contains(text(),'SFA')]").click();
        driver.findElementByXPath("//a[@href='/crmsfa/control/leadsMain']").click();
        driver.findElementByXPath("//a[@href='/crmsfa/control/findLeads']").click();
        driver.findElementByXPath("(//input[@name='firstName' and @class=' x-form-text x-form-field'])[3]").sendKeys("Poonguzhali");
        Thread.sleep(2000);
        driver.findElementByXPath("//button[contains(text(),'Find')]").click();
        Thread.sleep(2000);
        
        driver.findElementByXPath("(//td[@class='x-grid3-col x-grid3-cell x-grid3-td-partyId x-grid3-cell-first ']//a)[2]").click();
        System.out.println(driver.getTitle());
        /*String actual=("//div[@class='x-panel-header sectionHeaderTitle'])");
        if(title==actual)
        {System.out.println(title);
                }
        driver.findElementByXPath("//a[contains(text(),'Edit')]").click();
        driver.findElementByXPath("//input[@id='updateLeadForm_companyName']").sendKeys("Microsoft");
        driver.findElementByXPath("//input[@type='submit']").click();
       driver.findElementByXPath("//span[contains (text(),'Microsoft')]").isDisplayed();
        driver.close();
        
        EX2A:
        driver.get("http://leaftaps.com/opentaps/control/main");
			driver.manage().window().maximize();
			driver.findElementByXPath("//input[@id='username']").sendKeys("demosalesmanager");
			driver.findElementByXPath("//input[@id='password'][@class='inputLogin']").sendKeys("crmsfa");
			driver.findElementByClassName("decorativeSubmit").click();
			
			//next page crmsfa
			driver.findElementByXPath("//div[@id='label']").click();
			
			// next page click Lead
			driver.findElementByXPath("//a[text()='Leads']").click();
			
			//next page click in FindLead
			driver.findElementByXPath("//a[text()='Find Leads']").click();
			
			//Enter the name In First name
			
			driver.findElementByXPath("//input[@name='firstName'][@id='ext-gen248']").sendKeys("Praveen");
			//store the value in String variable to compare
			String actual=("//input[@name='firstName'][@id='ext-gen248']");
			
			//Click on Find Lead Button
		    driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a").click();
	            //get the Title of the current page
	 		System.out.println(driver.getTitle());
			// click on Edit button 
			driver.findElementByXPath("//a[text()='Edit']").click();
			//check the company name and sleep for 3sec
			driver.findElementByXPath("//input[@name='companyName' and @id='updateLeadForm_companyName']");
			Thread.sleep(3000);
			//clear the company name to edit it
			driver.findElementByXPath("//input[@name='companyName' and @id='updateLeadForm_companyName']").clear();
			Thread.sleep(2000);
			//enter new value in company name 
			driver.findElementByXPath("//input[@name='companyName' and @id='updateLeadForm_companyName']").sendKeys("TEMENOS");
			//check company name is edited or not to isDisplayed() method to return boolean value
			driver.findElementByXPath("//input[@name='companyName' and @id='updateLeadForm_companyName']").isDisplayed();
			
			
			//store the value in variable to compare to string using if statement
			String Updatevalue=("//input[@name='companyName' and @id='updateLeadForm_companyName']");
			driver.findElementByXPath("//input[@class='smallSubmit'and @name='submitButton']").click();
			
			if(actual==Updatevalue)
			{
				System.out.println("Value is not EDITED");
				
			}
			else
			{
				System.out.println("Value is Edited successfully");
			}
	//just get the title of the page and close the bowser
			String Title=driver.getTitle();
			System.out.println("The Title of Updated Page is : "+Title);
		Thread.sleep(3000);
		driver.close();
        
		 */
			
		
	}	
}
