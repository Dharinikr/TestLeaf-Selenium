package week4.day2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnWindowHandling {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Window.html");
		driver.manage().window().maximize(); 	
		
		//to get reference of window. to move from one window to other window. it changes everytime when you run the program
		// to get the reference of the current window
				/*
				 * String firstWinRef = driver.getWindowHandle();
				 * System.out.println(firstWinRef);
				 * 
				 * System.out.println("********************************************");
				 */

				driver.findElementById("home").click();

				// It will print first window

				String title = driver.getTitle();

				System.out.println(title);
				
				//to get window reference of all windows using getWindowHandles();
		

				Set<String> setOfHandles = driver.getWindowHandles();
				for (String eachHandle : setOfHandles) {
					 
					 System.out.println(eachHandle);
				}
				
				
				//to get second window handle using index
				
				Set<String> setOfHandles1 = driver.getWindowHandles();
				List<String> listOfHandles = new ArrayList<String>(setOfHandles1);

				String secondWinRef = listOfHandles.get(1);

				driver.switchTo().window(secondWinRef);
				String title1 = driver.getTitle();

				System.out.println(title1);
				driver.close();
				

				// to go back to the first window
				String firstWinRef = listOfHandles.get(0);

				driver.switchTo().window(firstWinRef);

				String title2 = driver.getTitle();
				System.out.println(title2);

				

				// driver.quit();
	}

}
