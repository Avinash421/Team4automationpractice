package pages;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.Test;

import testdefinition.Productsearch_tc;

public class product_search {
	WebDriver driver;
	WebElement search,click,item,size,cart,carted,check,sign,colour;
	Reporter pay;
	public product_search(WebDriver driver) {
			this.driver=driver;		
	}
	@Test           
	public void searchtheproduct() {
		search=driver.findElement(By.name("search_query"));
		search.sendKeys("DRESSES");
		search.click();	
		pay.log("searchtheproduct");
		
	}
@Test
	public void clickonbutton() {
		click=driver.findElement(By.name("submit_search"));
		click.click();
		pay.log("clickonbutton");
		
		}
@Test
public void clickonitem() {
		item=driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[1]/div/div[1]/div/a[1]/img"));
		item.click();
		pay.log("clickonitem");
		}
@Test
	public void selectsize() {
		size=driver.findElement(By.name("group_1"));
		Select select = new Select(size);
		select.selectByIndex(2);
		pay.log("selectsize");
		
}
@Test
public void selectcolour() {
		colour=driver.findElement(By.name("Black"));
		colour.click();
		pay.log("selectcolour");	
	}
@Test
public void addtocart() {
		cart=driver.findElement(By.name("Submit"));
		cart.click();
		pay.log("addtocart");
		}
@Test
public void proceedtocart() {
	carted=driver.findElement(By.xpath("//*[@id=\"header\"]/div[3]/div/div/div[3]/div/a"));
	carted.click();
	pay.log("proceedtocart");
	
}
@Test
public void proceedtoclick() {
	click=driver.findElement(By.xpath("//*[@id=\"center_column\"]/p[2]/a[1]"));
	click.click();
	pay.log("proceedtoclick");
	
}
@Test
public void proceedtocheckout() {
	check=driver.findElement(By.xpath("//*[@id=\"center_column\"]/form/p/button/span"));
	check.click();
	pay.log("proceedtocheckout");
	
}
@Test
public void agree() {
	check=driver.findElement(By.xpath("//*[@id=\"form\"]/div/p[2]/label"));
	check.click();
	pay.log("agree");
	
}
@Test
public void proceed_to_checkout() {
	check=driver.findElement(By.xpath("//*[@id=\"form\"]/p/button/span"));
	check.click();
	pay.log("proceed_to_checkout");
	
}

@Test
	public void enterPayment() {
		cart=driver.findElement(By.xpath("//*[@id=\"HOOK_PAYMENT\"]/div[1]/div/p/a"));
		cart.click();
		pay.log("enterpayment");	
	}
@Test
	public void submitPayment() {
		cart=driver.findElement(By.xpath("//*[@id=\"cart_navigation\"]/button/span"));
		cart.click();
		pay.log("submitpayment");	
	}
@Test
public void signout() {
	sign=driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[2]/a"));
	sign.click();
	pay.log("signout");

	
}
	public static void Logger(String msg) {
		Logger prod=Logger.getLogger(Productsearch_tc.class.getName());
		prod.setLevel(Level.ALL);
		prod.info(msg);
	}


}
