package week9.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selenium4Features1 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		
		//relative locator-- this is to work we need to change selenium version
		driver.findElement(RelativeLocator.withTagName("input").toRightOf(By.xpath("//label[text()='Username']"))).sendKeys("demosalesmanager");

		String text =driver.findElement(RelativeLocator.withTagName("label").toLeftOf(By.id("username"))).getText();
	
	//methods avaible = toRightOf,toLeftOf, above, below
		
		//System.setProperty("webdriver.chrome.silentOutput", "true");
		//taskkill /F /IM chromedriver.exe
	
	}
}
