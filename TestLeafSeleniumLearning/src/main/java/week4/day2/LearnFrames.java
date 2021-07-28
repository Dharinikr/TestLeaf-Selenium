package week4.day2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnFrames {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://dev68594.service-now.com/");
		driver.manage().window().maximize(); 	
		
		//switch to frame using ID/name
		driver.switchTo().frame("gsft_main");
		driver.findElementById("user_name").sendKeys("admin");
		
		//switch to frame using webelement
		WebElement elementFrame = driver.findElementById("gsft_main");
		driver.switchTo().frame(elementFrame);
		
		//switch to frame using index 
		//driver.switchTo().frame(0);
		
		
		//FRAME ANOTHER EXAMPLE
		 driver.get("http://leafground.com/pages/frame.html");
		  
		  //getting inside the outer frame driver.switchTo().frame(1);
		  
		 /* switch to frame using id-driver.switchTo().frame(ID or name of web element)
		 driver.switchTo().frame("frame2");*/
	 
		  /*switch to frame using index; index starts with 0 in java and 1 in DOM
		  driver.switchTo().frame(1);
		 driver.findElementById("Click1").click();*/
		 
		 /*getting inside the inner frame (Nested frame).sometimes there is frame inside frame. it is called nested frame.
		 in that case get into the outer frame first and then the inner frame.*/
		 //getting into outer frame using index; in dom it is second frame so giving index 1 here
		 driver.switchTo().frame(1);
		 //now getting in to the inner frame
		 driver.switchTo().frame("frame2");
		 
		 
		  
		  //to get into the main dom / html web page
		  driver.switchTo().defaultContent();
		  
		  String text = driver.findElementByTagName("h1").getText();
		  
		  System.out.println(text);
		  
		  
		  //to go to the immediate parent frame
		  driver.switchTo().parentFrame();
		  
		  driver.switchTo().parentFrame();
		  
		  driver.switchTo().parentFrame();
		  			
		
		
	}

}
