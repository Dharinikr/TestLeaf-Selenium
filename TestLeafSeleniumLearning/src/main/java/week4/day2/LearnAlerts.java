package week4.day2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnAlerts {

	public static void main(String[] args) throws InterruptedException {
		
			WebDriverManager.chromedriver().setup();
			ChromeDriver driver = new ChromeDriver();
			driver.get("http://leafground.com/pages/Alert.html");
			driver.manage().window().maximize();
			
			//to switch my control to alert
			Alert alert = driver.switchTo().alert();
			
			//click on alert box button
			driver.findElementByXPath("//button[text()='Alert Box']").click();
			Thread.sleep(2000);
			
			//to get text in alert
			String text = alert.getText();
			System.out.println(text);
			
			//to accept the alert
			//alert.accept();
			//to dismiss the alert
			//alert.dismiss();
			//driver.switchTo().alert().accept();
			//click on alert box button
			/*driver.findElementByXPath("//button[text()='Alert Box']").click();
			Thread.sleep(2000);
			driver.switchTo().alert().accept();*/
			
			//to click on confirm box
			driver.findElementByXPath("//button[text()='Confirm Box']").click();
			alert.dismiss();
			
			//to click on prompt button
			driver.findElementByXPath("//button[text()='Prompt Box']").click();
			alert.sendKeys("Test Leaf Solutions");
			alert.accept();
			
			
			
			
			
			

	}
}


