package uiappfeature;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import qa.DriverFactory;

    public class HomePageSteps {
    HomePage homepage = new HomePage (DriverFactory.getdriver()); // here we import getdriver method from DriverFactory calss and store in homppage variable. then we can sue homepage everywhere

	@Given("User is at landing page")
	public void user_is_at_landing_page() {
	
		  WebDriver driver = DriverFactory.getdriver(); // here we call 'getdriver' static method from DriverFactory by using class name
		  driver.get("https://www.amazon.in/");
	      }

	@Then("Page title should contain {string}")
	public void page_title_should_contain(String string) {
	  String title = homepage.getTtileOfPage(); // in ,homepage, driver present thats why it able to call gettitlePage method  & able to get title of webapplication here
	             boolean isPresent = title.contains(string); // "Shopping" stored in this string variable
	        Assert.assertEquals(isPresent, true);
	       }

	@Then("cart icon should get display")
	public void cart_icon_should_get_display() {
	               boolean Cart = homepage.isCartIconDisplayed();
	               Assert.assertEquals(Cart, true);
	}
    
	@When("User clciks on deals section")
	public void user_clciks_on_deals_section() {
	   homepage.checkoutDealSection(); // this method call from HomePage class
	}

	@Then("User should redirect to home decor section")
	public void user_should_redirect_to_home_decor_section() {
	    boolean isDisplay = homepage.KitchenSection();
	    Assert.assertEquals(isDisplay, true);
	}
}
