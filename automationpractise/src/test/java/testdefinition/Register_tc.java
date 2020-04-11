package testdefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.Registerpage;
import utility.screenshot;

public class Register_tc {
	 public WebDriver driver;
	   Registerpage reg;
	   screenshot shot;
	   //launching browser
	 @BeforeTest
	@Given("^open application click on signin$") 
	public void open_application_click_on_signin() throws Throwable {
		 System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	     driver=new ChromeDriver();
	     driver.get("http://automationpractice.com/index.php");
	     reg=new Registerpage(driver);
	     shot =new screenshot(driver);
	     Registerpage.Logger("browser opened");	
	     reg.enterSign();
	     Thread.sleep(5000);
	}
	 //user entering registration details and creating account
	@Test
	@When("^the user enters the details and click createaccount$")
	public void the_user_enters_the_details_and_click_createaccount() throws Throwable {
	reg.enterCtEmail("prabhas247@gmail.com");
	reg.enterCreate();
	shot.takeSnapShot("C:\\Users\\Lenovo\\eclipse-workspace\\automationpractise\\src\\test\\resources\\com\\screenshot\\ss4");
	Thread.sleep(5000);
  Registerpage.Logger("user registration");
	 shot.takeSnapShot("C:\\Users\\Lenovo\\eclipse-workspace\\automationpractise\\src\\test\\resources\\com\\screenshot\\ss5"); 
	 reg.entergender();
	 reg.enterFirstname("Abi");
	 reg.enterlastname("Sa");
	 reg.enterPassword("anu2029");
	 reg.enterAddress("navalluru");
	 reg.enterCity("Kvl");
	 reg.enterState();
	 reg.enterCountry();
	 reg.enterPincode("00000");
	 reg.enterPhone("2029071997");
	 reg.enterRefaddress("kavali");
	 Registerpage.Logger("details enetered");
	 shot.takeSnapShot("C:\\Users\\Lenovo\\eclipse-workspace\\automationpractise\\src\\test\\resources\\com\\screenshot\\ss6");
	 reg.entersubmit();
	 reg.Logger("registeredaccount opened");			
}
@AfterTest
@Then("^the system stores the details and automatically logs in$")
public void the_system_stores_the_details_and_automatically_logs_in() throws Throwable {
	
}
}
