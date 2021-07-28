package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login extends BaseClass {
	
	
	/*@Given("open the chrome browser")
	public void openBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
		@And("load the application url")
		public void loadUrl() {
		driver.get("http://leaftaps.com/opentaps/");
		
	}*/
		//@And("enter the username as demoslaesmanger")
		//if we need to test login with different username and password use regex (.*)
		
	@Given("enter the username as (.*)")
		public void enterUserName(String uName){
		driver.findElementById("username").sendKeys(uName);

}
		@And("enter the password as (.*)")
		public void enterPassword(String pwd){
		driver.findElementById("password").sendKeys(pwd);
		}
		
		@When("click on login button")
		public void clickLoginButton(){
		driver.findElementByClassName("decorativeSubmit").click();
		
			}
		
		@Then("homepage should be displayed")
		public void VerifyHomePage() {
		boolean displayed = driver.findElementByLinkText("CRM/SFA").isDisplayed();
		if(displayed) {
			System.out.println("Homepage is displayed");
		}
		
		else {
			System.out.println("Homepage is not displayed");
		}
		}
		
		@But("error message should be displayed")
		public void displayErrorMessage() {
			System.out.println("error message is displayed");
			
		}
		
	
		
		
		
}


		

