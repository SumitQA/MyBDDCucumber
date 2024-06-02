package uiappfeature;

import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import qa.DriverFactory;
import utility.PropertyRead;

public class ApplicatonHooks {
	WebDriver driver;
    @Before
    public void launchBrowser() throws IOException  // This is the Browser launch code
    {
	   DriverFactory df = new   DriverFactory (); // here we create object of DriverFactory class for call driver
	    String browserName = PropertyRead.readPropData("browser");// here we call readPropData method from PropertyRead class and give parametr
	    
	    String CmdBroswerName = System.getProperty("cliBrowser");// browser value give from CMD it will come to this cliBrowservariable
	   if(CmdBroswerName !=null) // if not null
	   {
		   browserName = CmdBroswerName;// then it will store in browserName Variable, it update here
	   }
	   
	    driver = df.initBrowser(browserName); // pass variable in it
	   
	  
	    driver.manage().window().maximize();
    }   
    //takescreenshot code
    @After(order = 2) // Graeter order execute first in case of AfterHook
    public void tearDown(Scenario scenario)// whenever create scenario class cucumber create object automatically no need to create manually
    {
    	boolean isScenarioFailed = scenario.isFailed();// Here we call isFailed method
    	if(isScenarioFailed)
    	{
    		String scenarioName = scenario.getName(); // here we wnat to know failed method name thats why call getName method by using ref.Varible
    		TakesScreenshot ts = (TakesScreenshot)driver;// here we did casting takescreenshot interface with driver
    		byte[] source = ts.getScreenshotAs(OutputType.BYTES);// here we store SS in byte fromat by using getScreenshot method
    		scenario.attach(source, "image/png", scenarioName);	 // here we attach SS by using scenrio varibale
    	}
    
    }
    @After(order = 1)// Lower order excute last in case of After
    public void closeBrowser()  // here we close the browser by quit method
    {
    	driver.quit();
    }
}
