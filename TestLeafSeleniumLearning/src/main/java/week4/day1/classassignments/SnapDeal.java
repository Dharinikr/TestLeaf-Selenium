package week4.day1.classassignments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SnapDeal {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
        ChromeOptions option = new ChromeOptions();
        option.addArguments("--disable-notifications");
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		
		Actions builder = new Actions(driver);
		
		//to go to men tab and mouse over
		//WebElement men = driver.findElementByClassName("catText");//xpath-(//span[@class='catText'])[6];
		WebElement men = driver.findElementByLinkText("Men's Fashion");
		builder.moveToElement(men).perform();
		
		Thread.sleep(2000);
		
		//to click on shirts
		WebElement shirts = driver.findElementByXPath("(//span[text()='Shirts'])[2]");
		shirts.click();
		
		Thread.sleep(3000);
		
		//to mouse hover on first product
		WebElement firstProduct = driver.findElementByXPath("//p[@title='vee bee collection Cotton Blend Blue Shirt']");
		 builder.moveToElement(firstProduct).perform();
		
		//to click on quick view
		WebElement quickView = driver.findElementByXPath("//img[@title='vee bee collection Cotton Blend Blue Shirt']/following::div[2]");
		quickView.click();
		
		//driver.close();
		
	}

}
	
		
				
				
				//driver.findElementByXPath("//a[text()='Men']");
		//driver.findElementById("pushDenied").click();
		//div[text()[normalize-space()='Quick View']]
//builder.moveToElement(men).moveToElement(firstProduct).click(quickView).perform();
		
//div[@class='col-xs-6  favDp product-tuple-listing js-tuple '])[2]");
		//div[@class='clearfix rating av-rating'])[2]");
		//img[@title='Vibe Linen Peach Shirt']");	
		
//a[@class=dp-widget-link hashAdded]/following-sibling::
//img[@title='vee bee collection Cotton Blend Blue Shirt']/following::div
		
		
		

