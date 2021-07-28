package week4.day1.classassignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JquerySelectable {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/selectable/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		Actions act = new Actions(driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("window.scrollBy(0,500)");
		driver.switchTo().frame(0);
		WebElement Item1 = driver.findElementByXPath("(//ol[@id='selectable']/li)[1]");
		WebElement Item3 = driver.findElementByXPath("(//ol[@id='selectable']/li)[3]");
		WebElement Item5 = driver.findElementByXPath("(//ol[@id='selectable']/li)[5]");
		WebElement Item7 = driver.findElementByXPath("(//ol[@id='selectable']/li)[7]");
		Actions builder = new Actions(driver);
		builder.keyDown(Keys.CONTROL).click(Item1).click(Item3).click(Item5).click(Item7).keyUp(Keys.CONTROL).perform();

	}

}
