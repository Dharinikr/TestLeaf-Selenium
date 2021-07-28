package week4.day2.homeassignments;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DoNotCloseMeWindowsAssign {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();

		driver.get("http://leafground.com/pages/Window.html");

		driver.manage().window().maximize();
	
		
		//Close all except this window
		
		driver.findElementById("color").click();
	    /*Set<String> winhandles1 = driver.getWindowHandles();
		List<String> listhandles1=new ArrayList<String>(winhandles1);
		String secwinref2=listhandles1.get(1);
		//String firstwinref1=listhandles1.get(0);
		driver.switchTo().window(secwinref2);
		driver.close();*/
		
		Set<String> noOfWindows = driver.getWindowHandles();

		List<String> noOfWindowsList = new ArrayList<String>(noOfWindows);
		
		System.out.println("Number of open windows : "+ noOfWindowsList.size());
		System.out.println(noOfWindowsList);
		
for (int i = 1; i < noOfWindowsList.size(); i++) {
			
			driver.switchTo().window(noOfWindowsList.get(i));
			driver.close();
		
	}

}
}
