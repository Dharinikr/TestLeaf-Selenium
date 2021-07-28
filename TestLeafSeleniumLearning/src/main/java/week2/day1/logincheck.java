package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class logincheck {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
        ChromeDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://leaftaps.com/opentaps/control/main");
        Thread.sleep(2000);
    	driver.findElementByXPath("//input[@id='username']").sendKeys("demosalesmanager");
		driver.findElementByXPath("//input[@id='password']").sendKeys("crmsfa");
		driver.findElementByXPath("//input[@class='decorativeSubmit']").click();
		String text = driver.findElementByXPath("//h2").getText();
		System.out.println(text);
		
		if(text.contains("Welcome")){
			System.out.println("login passed");
			
		}
		else {
			System.out.println("login failed");
		}
		
driver.close();
	}

}
	
		
		/*String title = driver.getText();
		System.out.println(title);*/
		/*String text = driver.findElementByXPath("(//div[@id='errorDiv']/p)[2]").getText();
		System.out.println(text);
		if(text.contains("error")){
			System.out.println("login failed");
			
		}
		else {
			System.out.println("login passed");
		}*/
		
		/*String title = driver.getTitle();
		System.out.println(title);*/
		
		
		