package week4.day1;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class LeafGroundExample {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		/*WebDriverManager.firefoxdriver().setup();
		FirefoxDriver driver = new FirefoxDriver();*/
		
		driver.get("http://leafground.com/pages/Link.html");
		driver.manage().window().maximize();
		
		System.out.println(driver.findElementsByTagName("a").size());
		
		List<WebElement> links = driver.findElementsByXPath("//a");
		
		//if i want one element out of many element in the list. in this example going for 2nd element
		WebElement secondElement = links.get(1);
		String text = secondElement.getText();
		System.out.println(text);
		
		
		for (WebElement eachLink : links) {
			System.out.println(eachLink.getAttribute("href"));
			System.out.println(eachLink.getText());
		 }
			
			
			//to get the visible text = eachLink.getText();
			//to get Link we need to use href
		
		//to interact with single element in foreach
		
		for (WebElement eachLink : links) {
			
			if(eachLink.getText().contains("broken")) {
				eachLink.click();
				break;
			}
		 }
			
		
		
		}

	}


