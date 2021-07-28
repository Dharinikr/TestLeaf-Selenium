package week2.day1;


import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchApplication {

	public static void main(String[] args) throws InterruptedException {
		
		/*to open chrome browser
		chromedriver=class; driver is a object; new is the keyword
		to set the path of driver
		System.setProperty("webdriver.chrome.driver",("to give the path of the driver stored in our system"))
         Webdriver Manager*/
	
		//to setup the driver
		WebDriverManager.chromedriver().setup();
		
		//code to open browser
		ChromeDriver driver = new ChromeDriver();
		
		//to load the application URL
		driver.get("https://www.amazon.in/");
		
		//to maximize browser
		driver.manage().window().maximize();
		
		//Java wait
		Thread.sleep(2000);
		
		//to close the current browser
		driver.close();
		
		//to close multiple browser by automation
		
		
	}
}
