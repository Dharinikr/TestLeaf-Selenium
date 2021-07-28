package week7.day2;

import org.apache.commons.collections4.bag.SynchronizedSortedBag;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnTestNGAssertion {
	
	/* IN TESTNG ASSERTION THERE ARE TWO TYPES-SOFT ASSERT AND HARD ASSERT
	//HARD ASSERT--------AssertEquals and AssertTrue
//PROBLEM WITH HARD ASSERT IS --when multiple assertion is used, if the first assert fails it won't execute the rest of the code. the execution stops
	//to overcome this problem we are using soft assert. first create an object for soft assert, then pass the assert equals and assert true.
	//also this is the compulsory in the last line of code. sa.assertAll(); without this there won't be any statement/exception to check the result 
	*/
	
	String expectedTitle = "TestLeaf";
	
	@Test
	public void leafTapslogin() throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver=new ChromeDriver();
     driver.manage().window().maximize();

	driver.get("http://leaftaps.com/opentaps/control/main");
	
			//USING ASSERT EQUALS
			driver.findElementById("username").sendKeys("demosalesmanager");
			driver.findElementById("password").sendKeys("crmsfa");
			driver.findElementByClassName("decorativeSubmit").click();
	
			String actualTitle = driver.getTitle();
			System.out.println(actualTitle);
			Thread.sleep(5000);
			
			 boolean crmsfaLink = driver.findElementByLinkText("CRM/SFA").isDisplayed();
			
			 //HARD ASSERTS:
			//first assertion
         //  Assert.assertEquals(actualTitle, expectedTitle);// Assert.assertEquals(actualTitle, "TESTLEAF")
			
			 //creating object for soft assert
	           
	           SoftAssert sa = new SoftAssert();
	           sa.assertEquals(actualTitle, expectedTitle);
          
	           System.out.println("second assertion starts here-----------");
           
          //Second assertion
          //HARD ASSERT
	     //Assert.assertTrue(crmsfaLink);
          
	           //using soft assert
           sa.assertTrue(crmsfaLink);
           
           //it is mandatory to have assertAll(); at the last line of test case when we use soft assert. it will consolidate and give result. 
           //without this statement, there won't be any condition/exception to check and it doesn't have anything compare and tell the result. by default test case passes and runs
           sa.assertAll();
           
           
           
	}
	
}
			
			//AssertTue  = TO CHECK BOOLEAN VALUES IN TESTNG ASSERTION 
			/*driver.findElementById("username").sendKeys("demosalesmanager");
			driver.findElementById("password").sendKeys("crmsfa");
			driver.findElementByClassName("decorativeSubmit").click();
				
			boolean crmsfaLink = driver.findElementByLinkText("CRM/SFA").isDisplayed();
			
			//IN ASSERTION THERE IS A METHOD TO CHECK BOOLEAN VALUE
			Assert.assertTrue(crmsfaLink);
			*/

			
//USUAL WAY TO CHECK
/*driver.findElementByLinkText("CRM/SFA").click();
	String actualTitle = driver.getTitle();
	System.out.println(actualTitle);
	
	if(actualTitle.equals("TestLeaf")) {
		System.out.println("matching");
	}
	else {
		System.out.println("not matching");
	}
*/

