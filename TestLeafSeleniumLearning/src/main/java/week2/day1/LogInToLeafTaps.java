package week2.day1;

import java.awt.List;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LogInToLeafTaps {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		
		/*another method to enter username
		WebElement username = driver.findElementById("username");
		
		//to type text
		username.sendKeys("demosalesmanager");*/
		
		//to enter text in username
		driver.findElementById("username").sendKeys("demosalesmanager");
		
        //to type password
		
		//driver.findElementById("password").sendKeys("crmsfa");
		
		driver.findElementByName("PASSWORD").sendKeys("crmsfa");
		
		//to click on login button
		driver.findElementByClassName("decorativeSubmit").click();
		
		//to click the link-use linktext locator and take only black text
		driver.findElementByLinkText("CRM/SFA").click();
		
		//to click on lead tab
		//driver.findElementByLinkText("Leads").click();
		
		
		//to click on create lead tab on left side
		driver.findElementByLinkText("Create Lead").click();
		
		//if we know only part of the text then use
		//driver.findElementByPartialLinkText("CRM").click();
		
		/*to select a value from dropdown using select class. If the values in the dropdown changes
		frequently it is better to use select class else we need to change scripts everytime the value changes*/
		 
		/*selectByVisibleText;selectByValue;selectByIndex-visible text and value in dropdown changes regularly.
		 * so use index for dropdown selection*/
		WebElement source = driver.findElementById("createLeadForm_dataSourceId");
		Select dropDown = new Select(source);
		
		//to select using visible text
		dropDown.selectByVisibleText("Employee");
		
		//dropDown.selectByValue("LEAD_CONFERENCE");
		
		dropDown.selectByIndex(1);
		
		WebElement marketingCampaign = driver.findElementById("createLeadForm_marketingCampaignId");
		Select dropDown1 = new Select(marketingCampaign);
		dropDown1.selectByIndex(3);
		
		//select last item from dropdown
		
	/*java.util.List<WebElement> options = dropDown.getOptions();
		int Size = options.size();
		
		for(int i=1;i < options.size()-1; i++ ) {
		oneElement.get.click();*/
		
		
		//another method of selecting value in dropdown using sendkeys
		//driver.findElementById("createLeadForm_dataSourceId").sendKeys("Conference");
		
		//driver.close();
		
		
		//Browser Verification methods
		
		String title = driver.getTitle();
		System.out.println(title);
		
		System.out.println(driver.getCurrentUrl());
		
		String pageSource = driver.getPageSource();
		System.out.println(pageSource);
		
		String text = driver.findElementByTagName("h2").getText();
		System.out.println(text);
		
		String attribute = driver.findElementById("username").getAttribute("name");
		System.out.println(attribute);
		
		//to get size of element
		Dimension size = driver.findElementByClassName("decorativeSubmit").getSize();
		System.out.println(size);
		
		size.getHeight();
		size.getWidth();
		
		//to get location-location gives x and y
		
		Point location = driver.findElementByClassName("decorativeSubmit").getLocation();
		System.out.println(location);
		
		//if we want x, y location seperately
		location.getX();
		location.getY();
		
		boolean enabled = driver.findElementByClassName("decorativeSubmit").isEnabled();
if (enabled ==true)
{
	System.out.println("element is enabled");
	
	}
else {
	
	System.out.println("element is disabled");
}
	}
}