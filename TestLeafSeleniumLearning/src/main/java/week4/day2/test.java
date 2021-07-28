package week4.day2;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class test {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Alert.html");
		driver.manage().window().maximize();
		
		
		//click on alert box button
		driver.findElementByXPath("//button[text()='Alert Box']").click();
		Thread.sleep(2000);
		
		//accept the alert
		driver.switchTo().alert().accept();
	}

}
