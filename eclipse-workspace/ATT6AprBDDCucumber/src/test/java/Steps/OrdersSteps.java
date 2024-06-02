package Steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OrdersSteps {

	@Given("User Should Be Logged Into Application")
	public void user_should_be_logged_into_application() {
	    
		System.out.println("GivenSteps");
	}

	@When("User Clicks On Order Link")
	public void user_clicks_on_order_link() {
	    System.out.println("Click On Order");
	}

	@Then("User Redirect to the Order Page")
	public void user_redirect_to_the_order_page() {
	   System.out.println("Redirected to order page");
	}

	@When("User Clicks on Currently Placed Order button")
	public void user_clicks_on_currently_placed_order_button() {
	   
		System.out.println("Currently Placed oreder");
	}

	@Then("User Should See Current Order infromation")
	public void user_should_see_current_order_infromation() {
	   
		System.out.println("should see current order info");
	}

	@When("User Clicks on past Order button")
	public void user_clicks_on_past_order_button() {
	  
		System.out.println("Click on past order info");
	}

	@Then("User Should See past Order infromation")
	public void user_should_see_past_order_infromation() {
		
	   System.out.println("Should see past order info");
	}

	@When("User Clicks cancel Order button")
	public void user_clicks_cancel_order_button() {
	    
		System.out.println("Click on cancel order button");
	}

	@Then("User Should cancel Order infromation")
	public void user_should_cancel_order_infromation() {
	   
		System.out.println("should see cancel order info");
	}

}
