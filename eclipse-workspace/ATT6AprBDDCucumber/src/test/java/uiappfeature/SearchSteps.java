package uiappfeature;

import io.cucumber.java.en.When;
import pages.Searchpage;
import qa.DriverFactory;

public class SearchSteps {
	Searchpage saerchpage = new Searchpage (DriverFactory.getdriver());
	@When("User enters {string} in search field")
	public void user_enters_in_search_field(String string) {
	    
	}
	}

