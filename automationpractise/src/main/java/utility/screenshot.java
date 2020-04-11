package utility;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class screenshot {
	WebDriver driver;
	public screenshot(WebDriver driver) {
		this.driver = driver;
	}
	// To take screenshot
	
	

	public void takeSnapShot(String path) {
		 TakesScreenshot screenshot=(TakesScreenshot)driver;
		 File Source = screenshot.getScreenshotAs(OutputType.FILE);
		 
		 try {
			 FileUtils.copyFile(Source,new File(path));
		 }
		 catch(IOException e) {
			 e.printStackTrace();
		 }
	 }

}
