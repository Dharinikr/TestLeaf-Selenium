package week4.day1;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnAdvanceUserInteractions {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		driver.switchTo().frame(0);
		
		//WebElement men = driver.findElementByLinkText("Men");
		WebElement men = driver.findElementByXPath("//a[text()='Men']");
		
		//actions class should end with .perform();
		Actions builder = new Actions(driver);
		builder.moveToElement(men).perform();
		
		//moveToElement() is used for mouse over
		//context click() is used for right click
		//doubleclick() is used for double click
		
		builder.contextClick(men).perform();
		builder.doubleClick(men).perform();
		
		//another example for actions class; to select selenium and appium in the dropdown box using actions class
		
		driver.get("http://leafground.com/pages/Dropdown.html");
		WebElement selenium = driver.findElementByXPath("//option[text()='Select your programs']/following::option[text()='Selenium']");

		WebElement appium = driver.findElementByXPath("//option[text()='Select your programs']/following::option[text()='Appium']");
		
		Actions builder1 = new Actions(driver);
		builder1.keyDown(Keys.CONTROL).click(selenium).click(appium).keyUp(Keys.CONTROL).perform();
	
	//another example in actions class for drag and drop
		driver.get("http://leafground.com/pages/drop.html");
		WebElement source = driver.findElementById("draggable"); 
		  WebElement target = driver.findElementById("droppable");
		  
		  Actions builder2 = new Actions(driver);
		  builder2.dragAndDrop(source, target).perform();
		  
		  //click and hold - mouse action
		  
		 driver.get("http://leafground.com/pages/selectable.html");
		 WebElement item1 = driver.findElementByXPath("//li[text()='Item 1']");
			
			WebElement item4 = driver.findElementByXPath("//li[text()='Item 4']");
			
			Actions builder4 = new Actions(driver);
			builder4.clickAndHold(item1).moveToElement(item4).release().perform();
		
	
	
	}
	
	

}
