package week9.day1;

import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnSelenium4Features {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		
		//to mimimize window
		driver.manage().window().minimize();
		
		//swtichTo() new window directly
		driver.switchTo().newWindow(WindowType.TAB).get("http://www.google.com/");

		System.out.println(driver.getTitle());
		
		//to go back to leaftaps, we need to use window handles
	}

}
