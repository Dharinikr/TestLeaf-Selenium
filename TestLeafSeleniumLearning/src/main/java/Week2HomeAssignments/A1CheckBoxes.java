package Week2HomeAssignments;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class A1CheckBoxes {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/checkbox.html");
		driver.manage().window().maximize();
		driver.findElementByXPath("(//input)[1]").click();
		
		//Confirm Selenium is checked
	       boolean check= driver.findElementByXPath("(//label[text()='Select the languages that you know?']/following::input)[6]").isSelected();
	       
	       if (check==true) {
	        	System.out.println("IT is checked");}
	        	else
	        	{
	        		System.out.println("Not Checked");
	        	}
	       
	     
	       //Deselect if the checkbox is selected
	     // WebElement NotSelected= driver.findElementByXPath("(//label[text()='Select the languages that you know?']/following::input)[7]");
	      WebElement Selected= driver.findElementByXPath("(//label[text()='Select the languages that you know?']/following::input)[8]");
	      boolean check2=Selected.isSelected(); 
	       	      if (check2== true) {
	    	  	    	   Selected.click();	    	      	  
	       }
	      
	       	
	       	//Select all the checkbox options
	    WebElement driver1= driver.findElementByXPath("(//input[@type='checkbox'])[9]");
	    WebElement driver2=  driver.findElementByXPath("(//input[@type='checkbox'])[10]");
	    WebElement driver3= driver.findElementByXPath("(//input[@type='checkbox'])[11]");
	    WebElement driver4= driver.findElementByXPath("(//input[@type='checkbox'])[12]");
	    WebElement driver5=  driver.findElementByXPath("(//input[@type='checkbox'])[13]");
     driver1.click();
	    driver2.click();
	    driver3.click();
	    driver4.click();
	    driver5.click();
	    Thread.sleep(1000);
	     			
	     driver.close();
	     
	     /*boolean b = driver.findElementByXPath("//label[text()='Confirm Selenium is checked']/following::input").isSelected();
		  System.out.println("True is selected: "+b);
		  
		  WebElement desel = driver.findElementByXPath("(//label[text()='DeSelect only checked']/following::input)[2]");
		  boolean selected = desel.isSelected();
		  if(selected==true)
		  {
			  desel.click();
			  System.out.println("Now its deselected the check box");
		  }
		  
		  //WebElement driver1= driver.findElementByXPath("(//input[@type='checkbox'])[9]").click();
		  WebElement driver1= driver.findElementByXPath("(//input[@type='checkbox'])[9]");
		  driver1.click();
		  Thread.sleep(1000);
		    WebElement driver2=driver.findElementByXPath("(//input[@type='checkbox'])[10]");
		    driver2.click();
		    Thread.sleep(1000);
		    WebElement driver3= driver.findElementByXPath("(//input[@type='checkbox'])[11]");
		    driver3.click();
		    Thread.sleep(1000);
		    WebElement driver4= driver.findElementByXPath("(//input[@type='checkbox'])[12]");
		    driver4.click();
		    Thread.sleep(1000);
		    
		    WebElement driver5=  driver.findElementByXPath("(//input[@type='checkbox'])[13]");
		    driver5.click();
		    Thread.sleep(1000);
		    System.out.println("All check box is selected");
		    driver.close();*/

}
}