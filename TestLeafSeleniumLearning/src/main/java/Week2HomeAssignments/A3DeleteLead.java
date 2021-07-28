package Week2HomeAssignments;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class A3DeleteLead {

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
		
		driver.findElementByLinkText("Create Lead").click();
		driver.findElementById("createLeadForm_companyName").sendKeys("TestLeafChennai");
		driver.findElementById("createLeadForm_firstName").sendKeys("TL");
		driver.findElementById("createLeadForm_lastName").sendKeys("Chennai");
		
		String number="9988998899";
	    WebElement phone = driver.findElementById("createLeadForm_primaryPhoneNumber");
		phone.sendKeys("number");
		driver.findElementByXPath("//input[@class='smallSubmit']").click();
		driver.findElementByLinkText("Find Leads").click();
		Thread.sleep(2000);
		driver.findElementByLinkText("Phone").click();
		Thread.sleep(2000);
		driver.findElementByXPath("//input[@name='phoneNumber']").sendKeys(number);
		driver.findElementByXPath("(//button[@type='button'])[7]").click();
		 Thread.sleep(3000);
		WebElement LeadID = driver.findElementByXPath(("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a[1]"));
	    Thread.sleep(3000);
	
		System.out.println(LeadID.getText());
	}
}
	
		
		/*to capture first lead ID
	    //driver.findElementByLinkText("10253").getAttribue("LinkText");
	//System.out.println(leadId);
	//driver.getValue();
		
		
		//to click on first lead
		driver.findElementByLinkText("10253").click();
		
		//to delete
		driver.findElementByLinkText("Delete").click();
		
		//to open find lead
		driver.findElementByLinkText("Find Leads").click();
		
		//enter captured lead ID
		driver.findElementByXPath("//input[@name='id']").sendKeys("10253");
		
		//to click on Find Lead button after entering phone number
		driver.findElementByXPath("(//button[@type='button'])[7]").click();
		driver.findElementByXPath("//input[@name='phoneNumber']").sendKeys("9884946200");
		Thread.sleep(2000);
		
		//to click on Find Lead button after entering phone number
		driver.findElementByXPath("(//button[@type='button'])[7]").click();
		//driver.findElementByXPath("//button[@class='x-btn-text'])[7]").click();
	   //driver.findElementByClassName("x-btn-text").click();*/
		
		/*Ex1:p
		driver.findElementByXPath("//input[@id='username']").sendKeys("demosalesmanager");
		driver.findElementByXPath("//input[@id='password']").sendKeys("crmsfa");
		driver.findElementByXPath("//input[@class='decorativeSubmit']").click();
		driver.findElementByXPath("//a[contains(text(),'SFA')]").click();
        driver.findElementByXPath("//a[@href='/crmsfa/control/leadsMain']").click();
        driver.findElementByXPath("//a[@href='/crmsfa/control/findLeads']").click();
        driver.findElementByXPath("(//span[@class='x-tab-strip-text '])[2]").click();
        driver.findElementByXPath("//input[@name='phoneNumber']").sendKeys("99");
        driver.findElementByXPath("(//button[@class='x-btn-text'])[7]").click();
        Thread.sleep(1000);
         WebElement Lead=driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/child::a");
         String ID=Lead.getText();
        driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/child::a").click();
   		driver.findElementByXPath("//a[@class='subMenuButtonDangerous']").click();
        driver.findElementByXPath("//a[@href='/crmsfa/control/findLeads']").click();
        Thread.sleep(2000);
        driver.findElementByXPath("//input[@name='id']").sendKeys(ID);
        driver.findElementByXPath("(//button[@class='x-btn-text'])[7]").click();
        Thread.sleep(1000);
       boolean display=driver.getPageSource().contains("No records to display");
    		   if (display== true) {
        System.out.println("No records to display");
      }
        else
        {
        	System.out.println("REcords found");
}
            driver.close();
            
            EX2:A
            driver.get("http://leaftaps.com/opentaps/control/main");
    		
    		driver.findElementByXPath("//input[@id='username']").sendKeys("demosalesmanager");
    		driver.findElementByXPath("//input[@id='password'][@class='inputLogin']").sendKeys("crmsfa");
    		driver.findElementByClassName("decorativeSubmit").click();
    		
    		//next page crmsfa
    		driver.findElementByXPath("//div[@id='label']").click();
    		// next page click Lead
    		driver.findElementByXPath("//a[text()='Leads']").click();
    		
    		//next page click in FindLead
    		driver.findElementByXPath("//a[text()='Find Leads']").click();
    		driver.findElementByXPath("//span[text()='Phone']/..").click();
    		//Enter the phone number 99 not Country code and area code
    		driver.findElementByXPath("//input[@name='phoneNumber']").sendKeys("99");
    		//click on FindLead Button before that sleep with 3sec
    		 //driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a");
    		 Thread.sleep(3000);
    	    WebElement leadid= driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a");
    	    String BeforeDeleted=leadid.getText(); 
    	    System.out.println("the before deletion the value of id is : "+BeforeDeleted);
    	    driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a").click();
    	    
    	    
    	    //Click DELETE BUTTON
    	    driver.findElementByXPath("//a[@class='subMenuButtonDangerous']").click();
    	    
    	    //Click on Find Lead Tag
    	    driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a");
    	    // click on leadId to check the Deleted Lead
    	    driver.findElementByXPath("//input[@name='id']").sendKeys(BeforeDeleted);
    	    driver.findElementByXPath("//button[text()='Find Leads']").click();
    	    
    	    //vertified the message " No RECORD IS DISPLAY" USE getPagesource()
    	    
    	    boolean msg=driver.getPageSource().contains("No records to display");
    	    
    	    // now check;
    	    if(msg==true)
    	    {
    	    	System.out.println("No records is display in PageSource Scree");
    	    	
    	    }
    	    else
    	    {
    	    	System.out.println("Record is display Deletion is not successfully");
    	    }
    	    driver.close();*/

		
		

