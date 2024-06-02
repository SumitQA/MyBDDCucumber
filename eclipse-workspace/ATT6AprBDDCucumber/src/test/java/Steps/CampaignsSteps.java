package Steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CampaignsSteps {
	@Given("user is at campaign page")
	public void user_is_at_campaign_page() {
	    System.out.println("Given Statement for Campaign page");
	}

	@When("user click on create campaign button")
	public void user_click_on_create_campaign_button() {
		System.out.println("Clicked on campaign button");
	  
	}

	@When("user enters the details")
	public void user_enters_the_details() {
	    System.out.println("ENtered the details");
	}

	@Then("Campaign get created")
	public void campaign_get_created() {
		System.out.println("Campaign created");
	   
	}

	@When("user click on edit  campaign button")
	public void user_click_on_edit_campaign_button() {
	  System.out.println("Editing Campaign");
	}

	@When("user enters the schedule")
	public void user_enters_the_schedule() {
	    System.out.println("scheduling campaign");
	}

	@Then("Campaign get scheduled")
	public void campaign_get_scheduled() {
	   System.out.println("campaign scheduled");
	}

	@Given("user should have sent campaign")
	public void user_should_have_sent_campaign() {
	    System.out.println("Validate sent Campaign");
	}

	@Then("user should have see count of campaign")
	public void user_should_have_see_count_of_campaign() {
	   System.out.println(" Validating count of campaign");
	}




}
