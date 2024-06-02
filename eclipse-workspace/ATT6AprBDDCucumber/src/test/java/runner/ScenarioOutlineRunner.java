package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions

(
        features = {"src\\test\\resources\\AppFeature\\ScenarioOutline.feature"},
        glue = {"Steps"},
        
       plugin = {"pretty", "html:target/cucumber-reports/reports.html"}
        
        )

public class ScenarioOutlineRunner extends AbstractTestNGCucumberTests {

}
