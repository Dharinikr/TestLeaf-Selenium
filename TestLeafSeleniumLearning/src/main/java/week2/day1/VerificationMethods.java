package week2.day1;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VerificationMethods {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElementById("username").sendKeys("demosalesmanager");
		driver.findElementByName("PASSWORD").sendKeys("crmsfa");
		
		//Browser Verification methods
		
				//String title = driver.getTitle();
				//System.out.println(title);
				
				//System.out.println(driver.getCurrentUrl());
				
				//to get DOM- developer's HTML code
				//String pageSource = driver.getPageSource();
				//System.out.println(pageSource);
				
			String text = driver.findElementByTagName("h2").getText();
				System.out.println(text);
				
				//String attribute = driver.findElementById("username").getAttribute("class");
			     //System.out.println(attribute);
				
				//to get size of element
				/*Dimension size = driver.findElementByClassName("decorativeSubmit").getSize();
				System.out.println(size);
				
				size.getHeight();
				size.getWidth();*/
				
				//to get location-location gives x and y
				
				//Point location = driver.findElementByClassName("decorativeSubmit").getLocation();
				//System.out.println(location);
				
				/*if we want x, y location seperately
				location.getX();
				location.getY();*/
				
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
