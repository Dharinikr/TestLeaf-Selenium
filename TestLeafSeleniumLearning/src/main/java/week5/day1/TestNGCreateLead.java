package week5.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNGCreateLead {
	
@Test
	
	public  void testNgCreateLead() {
		
				WebDriverManager.chromedriver().setup();
				ChromeDriver driver=new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("http://leaftaps.com/opentaps/control/main");
				driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
				
						driver.findElementById("username").sendKeys("demosalesmanager");
						driver.findElementById("password").sendKeys("crmsfa");
						driver.findElementByClassName("decorativeSubmit").click();
						driver.findElementByLinkText("CRM/SFA").click();
						driver.findElementByLinkText("Leads").click();
						driver.findElementByLinkText("Create Lead").click();
						driver.findElementById("createLeadForm_companyName").sendKeys("HCL");
						driver.findElementById("createLeadForm_firstName").sendKeys("Hari");
						driver.findElementById("createLeadForm_lastName").sendKeys("Radhakrishnan");
						driver.findElementByName("submitButton").click();
						driver.close();
						

	}

}
