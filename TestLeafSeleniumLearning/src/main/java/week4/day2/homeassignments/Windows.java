package week4.day2.homeassignments;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Windows {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();

		driver.get("http://leafground.com/pages/Window.html");

		driver.manage().window().maximize();
		
		//Click button to open home page in New Window
		driver.findElementById("home").click();
		
		//Find the number of opened windows
		WebElement openMultiWin = driver.findElementByXPath("//button[text()='Open Multiple Windows']");
		openMultiWin.click();
		
		Set<String> noOfWindows = driver.getWindowHandles();

		List<String> noOfWindowsList = new ArrayList<String>(noOfWindows);
		
		System.out.println("Number of open windows : "+ noOfWindowsList.size());
		System.out.println(noOfWindowsList);
		
		/*//Find the number of opened windows-another method using only Set
		Set<String> winhandles=driver.getWindowHandles();
	    int numberOfWindows=winhandles.size();
	    System.out.println("Opened Windows:"+numberOfWindows);*/
		
		//Close all except this window
		driver.findElementById("color").click();
	    Set<String> winhandles1 = driver.getWindowHandles();
		List<String> listhandles1=new ArrayList<String>(winhandles1);
		String secwinref2=listhandles1.get(1);
		//String firstwinref1=listhandles1.get(0);
		driver.switchTo().window(secwinref2);
		driver.close();
		
/*for (int i = 1; i < noOfWindowsList.size(); i++) {
			
			driver.switchTo().window(noOfWindowsList.get(i));
			driver.close();
	
	}
	*/
		
      driver.switchTo().window(noOfWindowsList.get(0));
		
		driver.findElementByXPath("//button[text()='Wait for 5 seconds']").click();
		
		Thread.sleep(5000);
		
		driver.quit();
	}
	}

