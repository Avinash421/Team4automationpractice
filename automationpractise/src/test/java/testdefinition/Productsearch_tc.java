package testdefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.Loginpage;
import pages.product_search;
import utility.screenshot;

public class Productsearch_tc {
	WebDriver driver;
	product_search prod;
	screenshot shot;
	Loginpage logg;
	// user search for product
	@BeforeTest
	@Given("^open application and click on product searchbar$")
	public void open_application_and_click_on_product_searchbar() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver=new ChromeDriver();
		shot = new screenshot(driver);
		logg=new Loginpage(driver);
		
		driver.get("http://automationpractice.com/index.php?controller=my-account");
		prod = new product_search(driver);
		 prod.Logger("searching the product");
	}
	// product selected and confirming order
	@Test
	@When("^Enter the product to be searched$")
	public void enter_the_product_to_be_searched() throws Throwable {
		prod.Logger("searching the product");
		prod.searchtheproduct();
		prod.clickonbutton();
	    shot.takeSnapShot("C:\\Users\\Lenovo\\eclipse-workspace\\automationpractise\\src\\test\\resources\\com\\screenshot\\ss7");
		prod.clickonitem();
		prod.selectsize();
		prod.selectcolour();
		prod.addtocart();
		prod.Logger("product is successfully added to cart");
	    shot.takeSnapShot("C:\\Users\\Lenovo\\eclipse-workspace\\automationpractise\\src\\test\\resources\\com\\screenshot\\ss8");
		logg.enterSign();
		shot.takeSnapShot("C:\\Users\\Lenovo\\eclipse-workspace\\automationpractise\\src\\test\\resources\\com\\screenshot\\ss8a");
		logg.enter_user_Name("indupriya26@gmail.com");
		logg.enterpass("A4217vin@");
		logg.entersub();
		prod.proceedtocart();
	    shot.takeSnapShot("C:\\Users\\Lenovo\\eclipse-workspace\\automationpractise\\src\\test\\resources\\com\\screenshot\\ss9");
		prod.proceedtoclick();
		prod.proceedtocheckout();
		prod.agree();
		prod.proceed_to_checkout();
		prod.enterPayment();
		prod.submitPayment();
		shot.takeSnapShot("C:\\Users\\Lenovo\\eclipse-workspace\\automationpractise\\src\\test\\resources\\com\\screenshot\\ss9a");
		Thread.sleep(5000);
		prod.signout();
		prod.Logger("successfully loggedout");
		shot.takeSnapShot("C:\\Users\\Lenovo\\eclipse-workspace\\automationpractise\\src\\test\\resources\\com\\screenshot\\ss9b");
		
	}
	@AfterTest
	@Then("^System shows the serched products$")
	public void system_shows_the_serched_products() throws Throwable {
	    
	}
  

}




