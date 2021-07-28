package week4.day2.homeassignments;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertHomeAssignment {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();

		driver.get("http://leafground.com/pages/Alert.html");

		driver.manage().window().maximize();
		
		
		//Click the button to display a alert box.
		
		driver.findElementByXPath("//button[text()='Alert Box']").click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		
		//Click the button to display a confirm box.
		WebElement confirmBox = driver.findElementByXPath("//button[text()='Confirm Box']");
		confirmBox.click();
		driver.switchTo().alert().dismiss();
		WebElement alertBoxMessage = driver.findElementById("result");
		String message = alertBoxMessage.getText();
		System.out.println(message);

		//Click the button to display prompt box.
		WebElement promptBox = driver.findElementByXPath("//button[text()='Prompt Box']");
		promptBox.click();
		Alert alert = driver.switchTo().alert();
		alert.sendKeys("Chennai Test Leaf");
		alert.accept();
		WebElement promptBoxMessage = driver.findElementById("result1");
		String promptMessage = promptBoxMessage.getText();
		System.out.println("Prompt Box Message is " + promptMessage);
		
		//Line Breaks
		WebElement lineBreaks = driver.findElementByXPath("//button[text()='Line Breaks?']");
		lineBreaks.click();
		Alert alert2 = driver.switchTo().alert();
		String alertText = alert2.getText();
		System.out.println("Text Message in Alert Box is : " + alertText);
		alert2.accept();
		
		//sweet alert
		driver.findElementByXPath("//button[@onclick='sweetalert()']").click();
		driver.findElementByXPath("//button[text()='OK']").click();

		
		
		//button[@onclick='sweetalert()']
	}

}
