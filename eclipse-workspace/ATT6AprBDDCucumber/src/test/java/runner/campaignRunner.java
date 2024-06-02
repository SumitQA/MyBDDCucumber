package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions
(
        features = {"src\\test\\resources\\AppFeature\\Campaigns.feature"},
        glue = {"Steps","Apphooks"},
        
       plugin = {"pretty", "html:target/cucumber-reports/reports.html"},
       
       tags =       "@functional" and @sanity"
                   //  "@functional or @sanity"
                  //   "not @sanity"
                 //  "not (@sanity or @functional)"
                       // "@sumit"
       
       

       
          
                      
       
        
        )

public class campaignRunner extends AbstractTestNGCucumberTests{

}
