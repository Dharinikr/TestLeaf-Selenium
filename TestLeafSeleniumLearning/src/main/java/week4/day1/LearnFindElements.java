package week4.day1;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnFindElements {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		
		//driver.findElementByXPath("//input").sendKeys("demosalesmanager");
		//driver.findElementByTagName("input").sendKeys("demosalesmanager");
		
		List<WebElement> input= driver.findElementsByTagName("input");
		
		//to find how many elements with same locator value
		//System.out.println(input.size());
		
		// this foreach is to get the value of webelement which has same attribute. eg:here getting 'name' attribute value
		//tagname 'input' has 3 matches 
		
		for (WebElement eachElement : input) {
			String nameValue = eachElement.getAttribute("name");
			System.out.println(nameValue);
		}
					
			//---//* when you put in DOM in xpath- it checks in all tags
					//forEach example also take
				
			
		List<WebElement> inputLogin = driver.findElementsByClassName("inputLogin");
		
		for (WebElement eachElement1 : inputLogin) {
			String idValue = eachElement1.getAttribute("ID");
			System.out.println(idValue);
			
		}
		
		
		
	}

}
