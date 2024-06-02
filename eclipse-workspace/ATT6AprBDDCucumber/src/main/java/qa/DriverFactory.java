package qa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
// In this class we define browser launch code
public class DriverFactory {
	    static WebDriver driver; // Define Globally
	    public WebDriver  initBrowser(String browserName) //  Method 1. here we add parameter in method. Method first letter small and second letter capital
	{
		if (browserName.equals("Chrome"))  // in this Class we define code for open browser
			
		{
			// ChromeOptions options = new ChromeOptions();// we need create object of chromeOptions Class for headless operation
			//options.addArguments("--headless");
			//driver= new ChromeDriver (options);
			driver= new ChromeDriver ();
		
		
	    }
		else
		{
			 driver = new FirefoxDriver ();
	    }
		
		return driver; 
	    }
	    public static WebDriver getdriver() //Method 2
	
	    {
	    	return driver;
	    }
	
    }
		



