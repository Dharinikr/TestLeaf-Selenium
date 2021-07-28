package week4.day2.homeassignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FrameHomeAssignment {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();

		driver.get("http://leafground.com/pages/frame.html");

		driver.manage().window().maximize();
		
		//i am inside a frame
		driver.switchTo().frame(0);
		//driver.findElementById("Click");
		WebElement first = driver.findElementById("Click");
		first.click();
		String text = first.getText();
		System.out.println(text);
		
		//to come out of the frame
		driver.switchTo().defaultContent();
		
		Thread.sleep(2000);
		
		//I am inside a nested frame
		//first switching in to the main frame by giving index. 2nd frame in DOM and it is 1 here
		driver.switchTo().frame(1);
		Thread.sleep(2000);
		//to go inside second frame to access inside frame ; here we are using ID
		driver.switchTo().frame("frame2");
		driver.findElementByXPath("//button[text()='Click Me'][@id='Click1']").click();
		driver.switchTo().defaultContent();
		
		/*//another way to go into the innner frame using outer parent frame
		driver.switchTo().parentFrame();

		WebElement nestedParentFrame = driver.findElementByXPath("//iframe[@src='page.html']");

		driver.switchTo().frame(nestedParentFrame);

		driver.switchTo().frame("frame2");

		driver.findElementById("Click1").click();*/
		
		//Find total number of frames.
		//for main frame
		int size = driver.findElementsByTagName("iframe").size();
        System.out.println(size);
	 
        //for nested frame
        int count=0;
	  for(int i=0; i<size; i++){
	  driver.switchTo().frame(i);
            count=count+driver.findElementsByTagName("iframe").size();
	  driver.switchTo().defaultContent();
			    
	}
		System.out.println(count);
		
		int Total=size+count;
		System.out.println("Total  iframe count is:"+Total);
	  
	 	  driver.close();
		
		
		
	}

}
