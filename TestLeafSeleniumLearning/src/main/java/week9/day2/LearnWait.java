package week9.day2;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnWait {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
driver.get("http://leafground.com/pages/disappear.html");
		
		
	}
		
		
		
		
		
		
		/*driver.get("http://leafground.com/pages/appear.html");
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		
		String text = wait.until(ExpectedConditions.visibilityOf(driver.findElementByXPath("//b[contains(text(),'here Guys']"))).getText();
	
		System.out.println(text);*/
	}


