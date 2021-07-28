package week8.day1.classassignment;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenshotLeafground {
	public static void main(String[] args) throws InterruptedException, IOException {
		
		      WebDriverManager.chromedriver().setup();
				
			  ChromeDriver driver = new ChromeDriver();
			
				driver.get("http://leafground.com/pages/Window.html");
				
				driver.manage().window().maximize();
				
			Thread.sleep(3000);
				
				WebElement homepageButton = driver.findElementById("home");
				
				homepageButton.click();
				
				driver.manage().window().maximize();
				
				Thread.sleep(2000);
				
				Set<String> setOfHandles = driver.getWindowHandles();
				List<String> listOfHandles = new ArrayList<String>(setOfHandles);
				
				String secondWinRef = listOfHandles.get(1);

				driver.switchTo().window(secondWinRef);
				
				File source=driver.getScreenshotAs(OutputType.FILE);
				
				File target=new File("./snapshot/leafground.png");

				   FileUtils.copyFile(source, target);
}
}
