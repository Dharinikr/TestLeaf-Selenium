package Week2HomeAssignments;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class A1ImagePage {

	public static void main(String[] args) throws InterruptedException {
		 
		    WebDriverManager.chromedriver().setup();
	        ChromeDriver driver=new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.get("http://leafground.com/pages/Image.html");
		    
	        //Home page image
	        driver.findElementByXPath("//img[@src='../images/home.png']").click();
	        String Home=driver.getCurrentUrl();
	        System.out.println("Displayed Current page URL is:" +Home);
	        
	        //Broken Image
	        driver.findElementByXPath("//img[@class='wp-categories-icon svg-image'][@src='images/image.png']").click();
	        driver.findElementByXPath("//img[@src='../images/abcd.jpg']").click();
	        String Error =driver.getCurrentUrl();
	        Thread.sleep(1000);
	        String ExpectedURL = "http://leafground.com/pages/error.html";
	        if (Error .equalsIgnoreCase( ExpectedURL))
	        {
	        	System.out.println("Error page displayed");
	        }
	        else{
	        	System.out.println("Not in error message");
	        }
	        System.out.println(Error);
	        
	        
	        //Using mouse
	        driver.get("http://leafground.com/pages/Image.html");
	        WebElement Image=driver.findElementByXPath("//img[@src='../images/keyboard.png']");
	        Actions action=new Actions(driver);
	        action.moveToElement(Image).perform();
	        action.click(Image).perform();
	        Thread.sleep(2000);
	        String URL= driver.getCurrentUrl();
        System.out.println("Navigated URL using mouse:" +URL);
        driver.close();
        
        /*another example
        driver.get("http://leafground.com/pages/Image.html");
		String currentUrl = driver.getCurrentUrl();
		System.out.println("The current Url of the back"+currentUrl);
		Thread.sleep(1000);
		driver.findElementByXPath("//img[@src='../images/home.png']").click();
		driver.navigate().back();
	
		
		// or 
	//	driver.findElementByXPath("//img[@class='wp-categories-icon svg-image'and @src='images/image.png']").click();
		
		driver.findElementByXPath("//img[@src='../images/abcd.jpg']").click();
		String currentUrl2 = driver.getCurrentUrl();
		System.out.println("The current Url of the back"+currentUrl2);
		if(currentUrl.equals(currentUrl2))
		{System.out.println("Am i broken is true");}
		else {System.out.println("am i broken is false");}
		driver.navigate().refresh();
		
		WebElement clickimge = driver.findElementByXPath("//img[@src='../images/keyboard.png']");
		// for using Mouse or keybord we have to call Class call ACTION
		Actions img=new Actions(driver);
		
		img.moveToElement(clickimge).click(clickimge).perform();
		
		System.out.println("the current page Url: "+driver.getCurrentUrl());
		driver.close();*/
		
	}

}
