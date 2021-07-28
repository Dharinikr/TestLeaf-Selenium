package week4.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnWaits {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize(); 	
		

		

		driver.get("http://leaftaps.com/opentaps/control/main");
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
			
		driver.findElementById("username").sendKeys("demosalesmanager");
			
		
		driver.findElementById("password123").sendKeys("crmsfa");

	}

}
