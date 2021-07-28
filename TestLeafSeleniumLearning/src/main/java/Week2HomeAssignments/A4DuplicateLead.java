package Week2HomeAssignments;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class A4DuplicateLead{

	public static void main(String[] args) throws InterruptedException {
		
		
		
		WebDriverManager.chromedriver().setup();
        ChromeDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://leaftaps.com/opentaps/control/main");
        Thread.sleep(2000);
    	driver.findElementByXPath("//input[@id='username']").sendKeys("demosalesmanager");
		driver.findElementByXPath("//input[@id='password']").sendKeys("crmsfa");
		driver.findElementByXPath("//input[@class='decorativeSubmit']").click();
		driver.findElementByXPath("//a[contains(text(),'SFA')]").click();
        driver.findElementByXPath("//a[@href='/crmsfa/control/leadsMain']").click();
        driver.findElementByXPath("//a[@href='/crmsfa/control/findLeads']").click();
        driver.findElementByXPath("//span[text()='Email']").click();
        driver.findElementByXPath("//input[@name='emailAddress']").sendKeys("abc@gmail.com");
        driver.findElementByXPath("(//button[@class='x-btn-text'])[7]").click();
        Thread.sleep(1000);
        WebElement Name=driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/child::a");
         String LeadName=Name.getText();
         System.out.println(LeadName);
         driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/child::a").click();
         driver.findElementByXPath("//a[@class='subMenuButton'][text()='Duplicate Lead']").click();
         String Title=driver.getTitle();
         System.out.println(Title);
         driver.findElementByXPath("//input[@class='smallSubmit']").click();
         String DuplicateName=driver.findElementByXPath("//span[@id='viewLead_firstName_sp']").getText();
         System.out.println(DuplicateName);
         if (DuplicateName.equals(LeadName)) {
        	 System.out.println("Name is same");
         }
         else {
        	 System.out.println("Two names are different");
         }
         driver.close();
         
         /*EX2
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
		
		//next page click on Email button
		driver.findElementByXPath("//span[text()='Email']").click();
		driver.findElementByXPath("//input[@name='emailAddress']").clear();
		Thread.sleep(1000);
		driver.findElementByXPath("//input[@name='emailAddress']").sendKeys("babu@testleaf.com");
		Thread.sleep(2000);
		//click on Find Lead Button
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(2000);
		
        WebElement getFirstname=driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/child::a");
        String firsname=getFirstname.getText();
        System.out.println("The First name first Field : "+firsname);
        driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/child::a").click();
       
    
        WebElement getSeccondname=driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-firstName'])[2]/a");
        String secondname=getSeccondname.getText();
        System.out.println("The Second Field Name as First Name: "+secondname);
		
		 * if(firsname==secondname) { System.out.println("This is Duplicate Value"); }
		 * else { System.out.println("This is not Duplicate Value"); }
		       
     //   driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/child::a").click();
		Thread.sleep(1000);
        //click duplicate button
        
        driver.findElementByXPath("//a[@class='subMenuButton'][text()='Duplicate Lead']").click();
        String Title=driver.getTitle();
        System.out.println(Title);
  WebElement duplicateclick=driver.findElementByXPath("//input[@id='createLeadForm_firstName' and @name='firstName']");
  String duplicatenamecheck=duplicateclick.getText();
  if (firsname==duplicatenamecheck)
  {
	  System.out.println("Duplicate value is same");
  }
  else
  {
	  System.out.println("Not Duplicate value");
  }
  driver.findElementByXPath("//input[@name='submitButton' and @class='smallSubmit']").click();
     System.out.println(driver.getTitle());
     driver.close();
*/
	}
	


}
