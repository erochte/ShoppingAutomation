package shopping;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

		
public class Shopautomation {

public WebDriver driver; 

@BeforeClass(alwaysRun=true)
  public void browser() {
	  System.setProperty("webdriver.gecko.driver","C:\\Users\\Evan\\Desktop\\geckodriver-v0.18.0-win64\\geckodriver.exe");
	  driver = new FirefoxDriver();
	  driver.get("http://automationpractice.com/");
	 
 
  }

@Test()
public void search(){
WebElement search=driver.findElement(By.name("search_query"));
search.sendKeys("Faded Short Sleeve T-shirts ");

	
}
@Test()
public void submit1() {
WebElement submit1=driver.findElement(By.name("submit_search"));
	submit1.click();
		
}

@Test
public void tshirt() {
	WebElement tshirt=driver.findElement(By.partialLinkText("Faded Short Sleeve T-shirts"));
	tshirt.click();
}
@Test
public void wishlist() {
WebElement wishlist=driver.findElement(By.linkText("Add to wishlist"));
wishlist.click();
	}
	
}



