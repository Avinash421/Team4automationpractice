package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class testngpriorities {
	WebDriver driver;
	   Loginpage log;
	   product_search prod;
	   Registerpage reg; 
	   @BeforeSuite
		public void initDriver() {
			System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		}  
	   // lauching browser
	   @Test
	   public void OpenBrowser() throws InterruptedException  {
			driver = new ChromeDriver();
			driver.get(" http://automationpractice.com/index.php");
			log =new Loginpage(driver);
			prod=new product_search(driver);
			reg =new Registerpage(driver);
			Thread.sleep(5000);
		} 
	   //registration process
	   @Test(dependsOnMethods={"OpenBrowser"})
	   public void registerpage() throws InterruptedException {
			reg.enterSign();
			reg.enterCtEmail("prabhas247@gmail.com");
			reg.enterCreate();
			Thread.sleep(5000);
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
			 reg.entersubmit();
			 Thread.sleep(10000);
			 prod.signout();
		}
		 
	   //user signin
	   @Test(dependsOnMethods={"registerpage"})
		public void loginpage() throws InterruptedException {
			 log.enterSign();
			 Thread.sleep(2000);
			 log.enter_user_Name("indupriyapasupuleti26@gmail.com");
			 log.enterpass("Indu#2626");
			 log.entersub();
		}
         //product search and payment process
	   @Test(dependsOnMethods={"loginpage"})
			public void productsearch() throws InterruptedException {
				prod.searchtheproduct();
				prod.clickonbutton();
				prod.clickonitem();
				prod.selectsize();
				prod.selectcolour();
				prod.addtocart();
				prod.proceedtocart();
				prod.proceedtoclick();
				prod.proceedtocheckout();
				prod.agree();
				prod.proceed_to_checkout();
				prod.enterPayment();
				prod.submitPayment();
				Thread.sleep(2000);
				prod.signout();
			}		
	}


