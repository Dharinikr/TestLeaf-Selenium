package week2.day2;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectClass {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		
        //to enter text in username
		driver.findElementById("username").sendKeys("demosalesmanager");
		
        //to type password
		
		driver.findElementById("password").sendKeys("crmsfa");
		
		//to click on login button
		driver.findElementByClassName("decorativeSubmit").click();
		
		//to click the link-use linktext locator and take only black text
		driver.findElementByLinkText("CRM/SFA").click();
		
		//to click on create lead tab on lest side
		driver.findElementByLinkText("Create Lead").click();
		
		/*to select a value from dropdown using select class. If the values in the dropdown changes
		frequently it is better to use select class else we need to change scripts everytime the value changes
		selectByVisibleText;selectByValue;selectByIndex-visible text and value in dropdown changes regularly.
		 so use index for dropdown selection.
		 SELECT CLASS IS USED TO SELECT MULTIPLE THINGS IN DROPDOWN. IF WE WANT TO SELECT ONE ITEM
		WE CAN USE SENDKEYS*/
		
		WebElement source = driver.findElementById("createLeadForm_dataSourceId");
		Select dropDown = new Select(source);
		
		//to select using visible text
		//dropDown.selectByVisibleText("Employee");
		
		//dropDown.selectByValue("LEAD_CONFERENCE");
		
		//dropDown.selectByIndex(1);
		
		//WebElement marketingCampaign = driver.findElementById("createLeadForm_marketingCampaignId");
		//Select dropDown1 = new Select(marketingCampaign);
		//dropDown1.selectByIndex(3);
		
		//TO SELECT AN OPTION IN DROPDOWN USING SENDKEYS
		
		//driver.findElementById("createLeadForm_dataSourceId").sendKeys("Conference");
		
		//SELECT one ITEM FROM DROP DOWN
		
		List<WebElement> options = dropDown.getOptions();
		
		int size = options.size();
	//in this example,first space is empty, if we give i=0, empty space will be printed; so if we want we can give i=1
		
		for(int i=0; i<options.size()-1;i++) {
			
		   String text = options.get(i).getText();
		   System.out.println(text);
			
		   //options.get(i).click();
			//Thread.sleep(2000);
		}
		
		
		
		//WebElement oneElement = options.get(1);
		//oneElement.click();

	}

}
