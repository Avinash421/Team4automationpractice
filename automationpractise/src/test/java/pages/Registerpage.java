package pages;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.Test;

import testdefinition.Register_tc;

public class Registerpage {
	 WebDriver driver;
	   WebElement email,create,password,gender,refaddress,phone,pincode,register,address,city,firstname,lastname;
	   Reporter rep;
	public Registerpage(WebDriver driver) {
		this.driver=driver;
	}
	public void enterSign() {
		create=driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a"));
		create.click();
		rep.log("enterSign");
	}
	@Test
	public void enterCtEmail(String z) {
		email=driver.findElement(By.id("email_create"));
		email.sendKeys(z);
		rep.log("enterCtEmail");
	}
	@Test
	public void enterCreate() {
		create=driver.findElement(By.xpath("//*[@id=\"SubmitCreate\"]/span"));
		create.click();	
		rep.log("enterCreate");
	}
	@Test
	public void entergender() {
		gender=driver.findElement(By.id("id_gender1"));
		gender.click();	
		rep.log("entergender");
	}
	@Test
	public void enterFirstname(String f) {
		firstname=driver.findElement(By.id("customer_firstname"));
		firstname.sendKeys(f);
		rep.log("enterFirstname");
		}
	@Test
	public void enterPassword(String p) {
		password=driver.findElement(By.name("passwd"));
		password.sendKeys(p);
		rep.log("enterpassword");
	}
	@Test
	public void enterAddress(String a) {
		address=driver.findElement(By.name("address1"));
		address.sendKeys(a);
		rep.log("enterAddress");
		
	}
	@Test
	public void enterCity(String t) {
		city=driver.findElement(By.id("city"));
		city.sendKeys(t);
		rep.log("enterCity");
		
	}
	@Test
	public void enterlastname(String l) {
		lastname=driver.findElement(By.name("customer_lastname"));
		lastname.sendKeys(l);
		rep.log("enterlastname");

		
	}
	@Test

	public void enterState() {
		Select state=new Select(driver.findElement(By.name("id_state")));
		state.selectByIndex(3);
		rep.log("enterstate");
	
		}

@Test
	public void enterCountry() {
		Select state=new Select(driver.findElement(By.name("id_country")));
		state.selectByIndex(1);
		rep.log("enterCountry");
	
		}
	
	@Test
	public void enterPincode(String c) {
		pincode=driver.findElement(By.name("postcode"));
		pincode.sendKeys(c);
		rep.log("enterpincode");
	}
	@Test
	public void enterPhone(String m) {
		phone=driver.findElement(By.name("phone_mobile"));
		phone.sendKeys(m);
		rep.log("enterphone");
	}
	@Test
	public void enterRefaddress(String r) {
		refaddress=driver.findElement(By.name("alias"));
		refaddress.sendKeys(r);
		rep.log("enterrefaddress");
	}
	@Test
	public void entersubmit() {
		register=driver.findElement(By.name("submitAccount"));
		register.click();
		rep.log("entersubmit");
	}

  public static void Logger(String msg) {
		Logger Regg=Logger.getLogger(Register_tc.class.getName());
		Regg.setLevel(Level.ALL);
		Regg.info(msg);
	}

}

