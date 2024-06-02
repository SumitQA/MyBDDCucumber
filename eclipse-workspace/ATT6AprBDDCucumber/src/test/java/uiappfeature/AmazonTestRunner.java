package uiappfeature;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions
(
        features = {"src\\test\\resources\\uiappfeature"},
        glue = {"uiappfeature"},
        plugin = {"pretty","html:target/cucumber-reports/reports.html"}
       
        
        )
public class AmazonTestRunner extends AbstractTestNGCucumberTests{

}
