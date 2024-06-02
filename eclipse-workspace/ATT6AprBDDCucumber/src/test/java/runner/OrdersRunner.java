package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions
(
              features = {"src\\test\\resources\\AppFeature\\Orders.feature"},
              glue = {"Steps"}
)
        public class OrdersRunner extends AbstractTestNGCucumberTests {

	
}
