package week4.day1.homeassignments;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragandDrop {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/droppable/");
		 driver.switchTo().frame(0);
		 WebElement drag = driver.findElementById("draggable");
		 WebElement drop = driver.findElementById("droppable");
		 Actions builder=new Actions(driver);
		 builder.dragAndDrop(drag, drop).perform();
		 
		 
		 
	}
	

}
