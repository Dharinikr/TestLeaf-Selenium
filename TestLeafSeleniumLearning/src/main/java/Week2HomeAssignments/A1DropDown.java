package Week2HomeAssignments;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class A1DropDown {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Dropdown.html");
		
		//select dropdown option by index
		WebElement trainingProgramIndex = driver.findElementById("dropdown1");
		Select dd1 = new Select(trainingProgramIndex);
		dd1.selectByIndex(1);
		
		//select dropdown option by text
		WebElement trainingProgramText = driver.findElementByName("dropdown2");
		Select dd2 = new Select(trainingProgramText);
		dd2.selectByVisibleText("Selenium");
		Thread.sleep(2000);
	
		//select dropdown option by value
		WebElement trainingProgramValue = driver.findElementById("dropdown3");
		Select dd3 = new Select(trainingProgramValue);
		dd3.selectByValue("1");
		
		//Get no of Dropdown options
	     
		WebElement dropdown4= driver.findElementByXPath("//select[@class='dropdown']");
	       Select index4=new Select(dropdown4);
	       List<WebElement> Options=index4.getOptions();
	       int size2=Options.size();
	       System.out.println(size2);
	       
	       //values selected using send keys
	       driver.findElementByXPath("(//div[@class='example']/child::select)[5]").sendKeys("Appium");
	       driver.findElementByXPath("(//div[@class='example']/child::select)[5]").sendKeys("UFT/QTP");
	       Thread.sleep(1000);
	       driver.findElementByXPath("(//div[@class='example']/child::select)[5]").sendKeys("Loadrunner");

	       //Select a program 
	       WebElement Dropdown5=driver.findElementByXPath("(//select)[6]");
	       Select index5=new Select(Dropdown5);
	       index5.selectByVisibleText("Appium");
	       index5.selectByVisibleText("UFT/QTP");
	       index5.selectByVisibleText("Loadrunner");
	       Thread.sleep(1000);
	       index5.deselectByVisibleText("Loadrunner");
	       driver.close();
		

	}

}
