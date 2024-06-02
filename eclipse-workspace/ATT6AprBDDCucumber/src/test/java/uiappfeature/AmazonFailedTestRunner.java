package uiappfeature;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions
(
        features = {"src\\test\\resources\\uiappfeature"},
        		// features = {"@target/failedrun.txt"}, //Here we run only fail Tc's give only fail file path
        glue = {"uiappfeature"},
        plugin = {"pretty","html:target/cucumber-reports/reports.html","rerun:target/failedrun.txt"}
        	//	plugin = {"rerun:target/failedrun.txt"}
       // features = { "@target/failedrun.txt"}
        
        	//	dryRun = true
       
        
        )
public class AmazonFailedTestRunner extends AbstractTestNGCucumberTests{

}
