package week4.day2.classassignments;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class W3Schools {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		// to disable browser notification
       
		ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		driver.findElementById("accept-choices").click();
		Alert alert1 = driver.switchTo().alert();
		driver.findElementByXPath("//div[@class='sn-b-def sn-blue']").click();
		//driver.findElementById("accept-choices").click();
		driver.manage().window().maximize();
		driver.switchTo().frame("iframeResult");
		Thread.sleep(3000);
		driver.findElementByXPath("//button[text()='Try it']").click();
		
		Alert alert = driver.switchTo().alert();
		alert.sendKeys("Hari");
		alert.accept();
       String text = driver.findElementById("demo").getText();
		
		if(text.contains("Hari")) {
			System.out.println("pass");
		}
		else {
			System.out.println("fail");
		}

	}

}
