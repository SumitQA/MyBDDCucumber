package Steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ScenarioOutlineSteps {

	@Given("User is at signup page")
	public void user_is_at_signup_page() {
		System.out.println("Given Steps");
	    }

	
	@When("user enters name as {string} in the form of")
	public void user_enters_name_as_in_the_form_of(String string) {
	    System.out.println("Entered name is "+string);
		}

	@When("user enters the {int}")
	public void user_enters_the(Integer int1) {
		System.out.println("Entered age is "+int1);
		    }

	@When("User confrim gender as {string}")
	public void user_confrim_gender_as(String string) {
	   System.out.println("Confirms gender as "+string);
	}

	@Then("user will get created")
	public void user_will_get_created() {
	    System.out.println("User has been created");
	}
	@Given("User is Logged into application")
	public void prerequiste () {
		System.out.println("user hae been logged in");
	}
}
