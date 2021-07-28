package week4.day2.homeassignments;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ServiceNow {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(" https://dev68594.service-now.com/");
		driver.switchTo().frame(0);
		driver.findElementByXPath("(//input[@class='form-control'])[1]").sendKeys("admin");	
		driver.findElementById("user_password").sendKeys("India@123");
		driver.findElementById("sysverb_login").click();
		driver.findElementById("filter").sendKeys("incident");
		Thread.sleep(2000);
		
		//Scrolling to click All
				JavascriptExecutor js = (JavascriptExecutor) driver;
			    WebElement Element = driver.findElementByXPath("(//div[text()='All'])[2]");
				js.executeScript("arguments[0].scrollIntoView();", Element);
				Element.click();
				
				//to click New button;
				//switching to frame using index;(using ID:driver.switchTo().frame("gsft_main");)
				driver.switchTo().frame(0);
				driver.findElementByXPath("(//button[@type='submit'])[1]").click();
				driver.findElementByXPath("//span[@class='icon icon-search']").click();
				//driver.findElementById("lookup.incident.caller_id").click();
				
				//after clicking new button, window changes. so to move control to newly opened window
				Set<String> windowHandlesSet = driver.getWindowHandles();
				List<String> windowHandlesList = new ArrayList<String>(windowHandlesSet);
				
				String firstWinRef = windowHandlesList.get(0);
				String secWinRef = windowHandlesList.get(1);
				driver.switchTo().window(secWinRef);
				
				driver.findElementByXPath("//input[@placeholder='Search']").sendKeys("Hari");
				driver.findElementByXPath("//input[@placeholder='Search']").sendKeys(Keys.ENTER);
				Thread.sleep(2000);
				driver.findElementByXPath("//a[text()='Hari Radhakrishnan']").click();
				driver.switchTo().window(firstWinRef);
				driver.switchTo().frame(0);
				Thread.sleep(2000);
				driver.findElementByXPath("//input[@id='incident.short_description']").sendKeys("assignment");
				
				//to capture number and store it in a variable
				
				WebElement number = driver.findElementById("incident.number");
				String numberValue = number.getAttribute("value");
				System.out.println("Incident Number is "  + numberValue);
				
				//to click on submit
				driver.findElementById("sysverb_insert").click();
				
				//search for the same incident number stored in variable
				WebElement search = driver.findElementByXPath("(//input[@class='form-control'])[1]");
				search.sendKeys(numberValue);
				search.sendKeys(Keys.ENTER);
				
				//to verify the incident number added successfully
				WebElement verification = driver.findElementByXPath("//tbody[@class='list2_body']//tr/td[3]");
				String verifiedNumber= verification.getText();
				System.out.println("Verification Number is " + verifiedNumber);
				
				if(verifiedNumber.equalsIgnoreCase(numberValue)) {
					System.out.println("Incident number added");
				}
				else {
					System.out.println("Incident number not added");
				}
	}
	

}
