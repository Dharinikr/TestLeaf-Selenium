package Week2HomeAssignments;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SamplePractice {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
        ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		
	
				Thread.sleep(2000);
		
				driver.findElementById("username").sendKeys("demosalesmanager");
				driver.findElementById("password").sendKeys("crmsfa");
				driver.findElementByClassName("decorativeSubmit").click();
				driver.findElementByLinkText("CRM/SFA").click();
				driver.findElementByLinkText("Leads").click();
				driver.findElementByLinkText("Create Lead").click();
				driver.findElementById("createLeadForm_companyName").sendKeys("TestLeafChennai");
				driver.findElementById("createLeadForm_firstName").sendKeys("Hari");
				driver.findElementById("createLeadForm_lastName").sendKeys("RKrishnan");
				driver.findElementByClassName("smallSubmit").click();
				
				/*Thread.sleep(2000);
				JavascriptExecutor js = (JavascriptExecutor) driver;
				 js.executeScript("window.scrollBy(0,500)");*/
				WebElement compName1 = driver.findElementByXPath("//span[@id='viewLead_companyName_sp']");
				String lead1=compName1.getText();
				System.out.println(lead1);
				Thread.sleep(2000);
				
				driver.findElementByLinkText("Leads").click();
				driver.findElementByLinkText("Create Lead").click();
				driver.findElementById("createLeadForm_companyName").sendKeys("TestLeafChennai");
				driver.findElementById("createLeadForm_firstName").sendKeys("Sam");
				driver.findElementById("createLeadForm_lastName").sendKeys("D");
				driver.findElementByClassName("smallSubmit").click();
				Thread.sleep(2000);
				/*JavascriptExecutor js1 = (JavascriptExecutor) driver;
				 js1.executeScript("window.scrollBy(0,500)");*/
				WebElement compName2 = driver.findElementByXPath("//span[@id='viewLead_companyName_sp']");
				String lead2=compName2.getText();
				System.out.println(lead2);
				
	}

}
