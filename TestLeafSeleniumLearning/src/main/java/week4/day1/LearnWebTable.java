package week4.day1;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnWebTable {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/table.html");
		driver.manage().window().maximize();
		
	//to print  text in first cell 'Learn Locators,
		String text = driver.findElementByXPath("//table[@id='table_id']//tr[2]/td[1]").getText();
	    System.out.println(text);
	    System.out.println("---------------------------");
	
	   //to print all text in first column starting from second row.taking DOM index. i is a variable. value changes because of for loop.so it cannot be in double quotes. if it is in double quotes java considers as a variable only
	/*for(int i=2;i<=5;i++) {
		String text = driver.findElementByXPath("//table[@id='table_id']//tr["+i+"]/td[1]").getText();
	    System.out.println(text);
	}*/
		//if the value 5 changes after adding some more content. so its better to get size and give it in for loop
	
	List<WebElement> rows = driver.findElementsByXPath("//table[@id='table_id']//tr");
	int rowsCount = rows.size();
	
	for(int i=2;i<=rowsCount;i++) {
		WebElement text1 = driver.findElementByXPath("//table[@id='table_id']//tr["+i+"]/td[1]");
	    String text2 = text1.getText();
	    System.out.println(text2);
	
	}
	System.out.println("---------------------------");
	
	// nested for loop is used when we deal with rows and coloumns
	List<WebElement> rows1 = driver.findElementsByXPath("//table[@id='table_id']//tr");
	int rowsCount1 = rows1.size();
	
	for(int i=2;i<=rowsCount1;i++) {
		int cellCount = driver.findElementsByXPath("//table[@id='table_id']//tr["+i+"]/td").size();
		
		
		//for(int j=1;j<=6;j++) -if the value of 6 changes later.. so using for loop
		
		for(int j=1;j<=cellCount;j++){
		
			WebElement text3 = driver.findElementByXPath("//table[@id='table_id']//tr["+i+"]/td["+j+"]");
			String text4 = text3.getText();
	    System.out.println(text4);
	
	}
	
	}	
	//to get cell count in 2nd row
	
		
	}
}
