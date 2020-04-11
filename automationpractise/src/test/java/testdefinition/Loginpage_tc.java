package testdefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.Loginpage;
import utility.screenshot;

public class Loginpage_tc {
	 public WebDriver driver;
	   Loginpage log;
	   screenshot shot;
	   Reporter ref;
	   // launching browser
	@BeforeTest
	@Given("^open application and click on login link$")
	public void open_application_and_click_on_login_link() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	     driver=new ChromeDriver();
	     ref=new Reporter();
	     shot=new screenshot(driver);
	     Loginpage.Logger("opening browser");
	      driver.get("http://automationpractice.com/index.php");
	        log=new Loginpage(driver);
	        shot.takeSnapShot("C:\\Users\\Lenovo\\eclipse-workspace\\automationpractise\\src\\test\\resources\\com\\screenshot\\ss");
	        log.enterSign(); 
	        Thread.sleep(5000);
	}
	// user signin
	@Test
	@When("^the user enter the valid username and valid password and click on the submit$")
	public void the_user_enter_the_valid_username_and_valid_password_and_click_on_the_submit() throws Throwable {
		 log.enter_user_Name("indupriya26@gmail.com");
		  
		 log.enterpass("A4217vin@");
		 shot.takeSnapShot("C:\\Users\\Lenovo\\eclipse-workspace\\automationpractise\\src\\test\\resources\\com\\screenshot\\ss1");
			
		 log.entersub();
		 ref.log("login is sucessfull");
		 log.Logger("entered login details");
		 shot.takeSnapShot("C:\\Users\\Lenovo\\eclipse-workspace\\automationpractise\\src\\test\\resources\\com\\screenshot\\ss2");
	}
	// navigates to homepage
@AfterTest
	@Then("^the system navigates to homepage\\.$")
	public void the_system_navigates_to_homepage() throws Throwable {
		if(driver.getTitle().equals("Login - My Store")) {
			log.Logger("login credentials is valid");
		}
		else {
			log.Logger("login credentials is invalid");
			}
	}
}
