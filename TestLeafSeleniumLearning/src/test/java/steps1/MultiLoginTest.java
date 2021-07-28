	package steps1;

import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class MultiLoginTest {
	public ChromeDriver driver;
	
	@Given("Open the chrome browser")
	public void openBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
	}
	
	@And("Load the leaftaps application url")
		public void loadUrl() {
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
}
	
	@And("enter the login username as (.*)")
	public void username(String usName) {
		driver.findElementById("username").sendKeys(usName);
	}
	
	@And("enter the login password as (.*)")
	public void password(String passWord){
	     driver.findElementById("password").sendKeys(passWord);
	}
	
	@When("Click on the leaftaps login button")
	public void clickLogin(){
		driver.findElementByClassName("decorativeSubmit").click();
		/*String pageTitle = driver.getTitle();
		System.out.println(pageTitle);*/
		
	}
	
	@Then("Homepage should be displayed")
	public void VerifyHomePage() {
	boolean displayed = driver.findElementByLinkText("CRM/SFA").isDisplayed();
	
	if(displayed) {
		System.out.println("Homepage is displayed");
	}
	
	else {
		System.out.println("Homepage is not displayed");
	}
	
	
	}
	
	@But("Error message should be displayed")
	public void displayErrorMessage() {
		System.out.println("error message is displayed");
		
	}
	
}

	
	
	
	
	
	
	
	
	/*@Then("Print the login title")
	public void titlePrint() {
		WebElement homePage = driver.findElementByXPath("//h2");
		String text = homePage.getText();
		System.out.println(text);
		}
	Then check whether the title contains Welcome*/


	
	
