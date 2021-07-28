package Week2HomeAssignments;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class A1EditPage {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Edit.html");
		driver.manage().window().maximize();
		driver.findElementById("email").sendKeys("demosalesmanager");
		
		driver.findElementByXPath("//input[@id='email']").sendKeys("demosales@yahoo.com");
        driver.findElementByXPath("(//input[@type='text'])[2]").sendKeys("Name");
        driver.findElementByXPath("(//input[@type='text'])[2]").sendKeys(Keys.TAB);
        String Text=driver.findElementByXPath("//input[@name='username']").getText();
       	System.out.println(Text);
         driver.findElementByXPath("(//input[@name='username'])[2]").clear();
         Thread.sleep(1000);
        
         boolean field= driver.findElementByXPath("(//input[@type='text'])[5]").isEnabled();
        if (field == true) {
        	System.out.println("Field enabled");}
        	else {
        		System.out.println("Field Disabled");
        	}
        		driver.close();
        		
		
        		/*boolean enabled = driver.findElementByXPath("(//br)[15]").isEnabled();
		if(enabled == true) {
			System.out.println("Edit field is disabled");
		}
		else {
			System.out.println("Edit field is enabled");
		}
		EXample;
		driver.findElementById("email").sendKeys("praveen.avin@test.com");
		driver.findElementByXPath("(//input[@type='text'])[2]").sendKeys(Keys.TAB);
		String text = driver.findElementByXPath("(//input[@type='text'])[3]").getText();
		System.out.println("default text :"+text);
		driver.findElementByXPath("(//input[@type='text'])[4]").clear();
		boolean displayed = driver.findElementByXPath("(//input[@type='text'])[5]").isDisplayed();
		System.out.println("check the boolean value "+displayed);
		driver.close();*/
	
	
		
	}

}
