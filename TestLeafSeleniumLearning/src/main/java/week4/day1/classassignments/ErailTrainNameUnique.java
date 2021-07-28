package week4.day1.classassignments;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ErailTrainNameUnique {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://erail.in/");
		driver.manage().window().maximize();	
		
		//to uncheck sort on date
		driver.findElementById("chkSelectDateOnly").click();
		
		//clear the existing text from station text field
		driver.findElementById("txtStationFrom").clear();
		
		//type "ms"in the from station text field
		driver.findElementById("txtStationFrom").sendKeys("ms");
		
		//tab in the from station text field. Keys.TAB is to select first option
		driver.findElementById("txtStationFrom").sendKeys(Keys.TAB);
		
      //clear the existing text in the to station text field
		driver.findElementById("txtStationTo").clear();
		
//		type "mdu" in the to station text field
		driver.findElementById("txtStationTo").sendKeys("mdu");
		
//		tab in the to station text field
		driver.findElementById("txtStationTo").sendKeys(Keys.TAB);
		
//		Add a java sleep for 2 seconds
		Thread.sleep(2000);
		
//		Store all the train names in a list
        int rowsCount = driver.findElementsByXPath("//table[@class='DataTable TrainList TrainListHeader']//tr").size();
		
		
		List<String> listTrainNames = new ArrayList<String>();
		
		
		for (int i = 1; i <= rowsCount; i++) {
			
			String text = driver.findElementByXPath("//table[@class='DataTable TrainList TrainListHeader']//tr["+i+"]/td[2]/a").getText();
			System.out.println(text);
			//listTrainNames.add(text);
			
		}
		
//		Get the size of list
		int listSize = listTrainNames.size();
		
//		Add the list into a new Set
		Set<String> setTrainNames = new HashSet<String>(listTrainNames);
		
//		Get the size of set
		int setSize = setTrainNames.size();

//		Compare the Size of list and Set to verify the names are unique
		if(listSize == setSize) {
			System.out.println("no duplicates");
		}else {
			System.out.println("duplicates are available");
		}

		
	
	}

}
