package testrunner;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\Lenovo\\eclipse-workspace\\main_project\\src\\test\\resources\\com\\Features\\product.feature",glue={"testdefinition"})     


public class productandpaymentrun {

}
