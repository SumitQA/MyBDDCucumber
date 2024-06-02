package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = {"src\\test\\resources\\AppFeature\\Login.feature"},
		glue = {"Steps"} // link keli stepsDefination file
		
		)

public class LoginRunner extends AbstractTestNGCucumberTests
{
	
}

	

  
  
  
