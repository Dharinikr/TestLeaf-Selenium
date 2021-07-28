package week4.day2.homeassignments;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MergeLead1 {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.findElementById("username").sendKeys("demosalesmanager");
		driver.findElementByName("PASSWORD").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByXPath("//a[text()='Create Lead']").click();
		
		//create 1st lead
		WebElement leadCompanyName = driver.findElementById("createLeadForm_companyName");
		String companyName1 = "TL1 Chennai";
		leadCompanyName.sendKeys(companyName1);
		
		WebElement leadFirstName = driver.findElementById("createLeadForm_firstName");
		String firstName1 = "TL1";
		leadFirstName.sendKeys(firstName1);
		
		WebElement leadLastName = driver.findElementById("createLeadForm_lastName");
		String lastName1 = "Chennai";
		leadLastName.sendKeys(lastName1);
		
		//to click on submit button
		WebElement createLeadButton = driver.findElementByXPath("//input[@class='smallSubmit']");
		createLeadButton.click();
		
		Thread.sleep(2000);
		
		//create 2nd lead
		driver.findElementByXPath("//a[text()='Create Lead']").click();
		
		Thread.sleep(2000);
		WebElement leadCompanyName2 = driver.findElementById("createLeadForm_companyName");
		String companyName2 = "TL2 Madras";
		leadCompanyName2.sendKeys(companyName2);
		
		WebElement leadFirstName2 = driver.findElementById("createLeadForm_firstName");
		String firstName2 = "TL2";
		leadFirstName2.sendKeys(firstName2);
		
		WebElement leadLastName2 = driver.findElementById("createLeadForm_lastName");
		String lastName2 = "Madras";
		leadLastName2.sendKeys(lastName2);
		
		//to click on submit button
				WebElement createLeadButton2 = driver.findElementByXPath("//input[@class='smallSubmit']");
				createLeadButton2.click();
				
				Thread.sleep(3000);
				
				//to capture lead ID
				driver.findElementByXPath("//a[text()='Find Leads']").click();
				
				Thread.sleep(2000);
				
				WebElement companyNameBox = driver.findElementByXPath("//input[@type='text'][@name='companyName'][@class=' x-form-text x-form-field ']");
				companyNameBox.sendKeys("TL2 Madras");
				driver.findElementByXPath("//button[text()='Find Leads']").click();
				
				
				WebElement secondLeadID = driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a");
				String lead2ID = secondLeadID.getText();
				System.out.println("The Second Lead ID is  " + lead2ID);
				
				
				//to click on merge lead
				driver.findElementByLinkText("Merge Leads").click();
				
				Thread.sleep(2000);
				driver.findElementByXPath("//img[@src='/images/fieldlookup.gif']").click();
				
				
				
				//to switch to opened window after clicking the image
		        Set<String> windowHandles = driver.getWindowHandles();	
		        List<String> listHandles = new ArrayList<String>(windowHandles);
		        String firstWindRef = listHandles.get(0);
		        String secWindRef = listHandles.get(1);
		        driver.switchTo().window(secWindRef);
		        
		        driver.findElementByName("id").sendKeys();
		        driver.findElementByClassName("x-btn-text").click();
		
		
		

	}

}
