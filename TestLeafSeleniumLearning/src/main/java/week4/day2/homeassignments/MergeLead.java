package week4.day2.homeassignments;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MergeLead {

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
		driver.findElementByLinkText("Merge Leads").click();
		Thread.sleep(2000);
		driver.findElementByXPath("//img[@src='/images/fieldlookup.gif']").click();
		
		//to switch to opened window after clicking the image
        Set<String> windowHandles = driver.getWindowHandles();	
        List<String> listHandles = new ArrayList<String>(windowHandles);
        String firstWindRef = listHandles.get(0);
        String secWindRef = listHandles.get(1);
        driver.switchTo().window(secWindRef);

//ABC- AB C- 10180
//DEF - DE F - 10178

        driver.findElementByName("id").sendKeys("10180");
        driver.findElementByClassName("x-btn-text").click();
        Thread.sleep(2000);
        driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a").click();
       
        driver.switchTo().window(firstWindRef);
		Thread.sleep(2000);
		   //steps to give to merge lead number
        driver.findElementById("ComboBox_partyIdTo").sendKeys("10178");
        driver.findElementByXPath("//a[@class='buttonDangerous']").click();
        
        driver.switchTo().alert().accept();
        driver.findElementByXPath("//a[@class='selected']").click();
        Thread.sleep(2000);
        driver.findElementByName("id").sendKeys("10180");
        driver.findElementByClassName("x-btn-text").click();
        Thread.sleep(2000);
        String text = driver.findElementByXPath("//div[@class='x-paging-info']").getText();
        System.out.println(text);
        
        
        
        
        
        
        
     
        
        
        
        
        



		
		
		
		
		
	}

}
