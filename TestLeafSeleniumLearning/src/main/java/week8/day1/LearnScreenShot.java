package week8.day1;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnScreenShot {

	public static void main(String[] args) throws InterruptedException, IOException {
WebDriverManager.chromedriver().setup();
		
		
		ChromeDriver driver = new ChromeDriver();
	
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		
		driver.manage().window().maximize();
		
	
		Thread.sleep(2000);
		
		//to capture the screenshot as file
		File source = driver.getScreenshotAs(OutputType.FILE);
		
		//create a target to sAve the screenshot: snapshot folder will be created automatically
		File target = new File("./snapshot/leaftaps.png");
		
		//method to paste the source into target
       FileUtils.copyFile(source, target);
		
		//TO TAKE SCREENSHOT OF WEBELEMENT
       WebElement userName = driver.findElementById("username");
       userName.sendKeys("demosalesmanager");
		File source1 = userName.getScreenshotAs(OutputType.FILE);
		File target1 = new File("./snapshot/leaftaps1.png");
		 FileUtils.copyFile(source1, target1);
		
		
		driver.close();
		
		
		
		


	}

}
