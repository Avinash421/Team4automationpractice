package pages;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Test;

import testdefinition.Loginpage_tc;

public class Loginpage {
	  WebDriver driver;
	   WebElement email,loginlog,password,sub,create;
	   Reporter ref;
	
	public Loginpage(WebDriver driver) {
		  this.driver=driver;
	}
	@Test
	 public void enterSign() {
		    create=driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a"));
		    create.click();
		    ref.log("enterSign");
	 }
	@Test	
	public void enter_user_Name(String s) {
		  email=driver.findElement(By.id("email"));
		   email.sendKeys(s);
		   ref.log("enterusername");
	}
	@Test
	public void enterpass(String p) {
		 password=driver.findElement(By.name("passwd"));
        password.sendKeys(p);
        ref.log("enterpass");
}
	@Test
	public void entersub() {
		  sub=driver.findElement(By.xpath("//*[@id=\"SubmitLogin\"]/span"));
		 sub.click();
		 ref.log("entersub");
}
	public static void Logger(String msg) {
		Logger log=Logger.getLogger(Loginpage_tc.class.getName());
		log.setLevel(Level.ALL);
		log.info(msg);
	}
		
	}
	
