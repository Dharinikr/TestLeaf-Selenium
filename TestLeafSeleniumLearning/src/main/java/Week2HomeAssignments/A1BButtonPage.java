package Week2HomeAssignments;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class A1BButtonPage {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Button.html");
		driver.findElementById("home").click();
		driver.navigate().back();
		System.out.println(driver.findElementById("position").getLocation());
		System.out.println(driver.findElementById("color").getAttribute("style"));
		
		Dimension size = driver.findElementById("size").getSize();
		System.out.println("Height is"+ size.getHeight());
		System.out.println("Width is" + size.getWidth());
		
		
		//System.out.println(driver.findElementById("size").getSize());
	
		/*Example
		 //Home button
	        driver.findElementByXPath("//button[@id='home']").click();
	        driver.findElementByXPath("//h5[@class='wp-categories-title'][text()='Button']").click();
	        
	        //XY Location
	        WebElement xy=driver.findElementByXPath("//button[@id='position']");
	        Point Location=xy.getLocation();
	        int x= Location.getX();
	        int Y= Location.getY();
	        System.out.println("X is:"+x);
	        System.out.println("Y is:"+Y);
	        
	        //Color
	        String Color=driver.findElementByXPath("//button[@id='color']").getCssValue("color");
	        System.out.println("Color is:"+Color);
	        
	        //Height and Width
	                
	        WebElement position=driver.findElementByXPath("//button[@id='size']");    
	        int PositionX=position.getSize().getWidth();
	        int PositionY=position.getSize().getHeight();
	        System.out.println("X is:"+PositionX);
	        System.out.println("Y is:"+PositionY);
	        driver.close();*/
		
		
	}
	


}
