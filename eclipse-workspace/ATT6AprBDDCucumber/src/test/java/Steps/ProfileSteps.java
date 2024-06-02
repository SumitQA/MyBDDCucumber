package Steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ProfileSteps {
	@Given("User should present on Home page")
	public void user_should_present_on_home_page() {
		System.out.println("Given Statement");
	}

	@When("User Clicks on add profile button")
	public void user_clicks_on_add_profile_button() {
		System.out.println("Add Profile");
	}
	    
	
	@When("user enters the data")
	public void user_enters_the_data() {
	  System.out.println("Add Data");
	}

	@Then("profile should get created")
	public void profile_should_get_created() {
		System.out.println("Profile Created");
	    
	}

	@When("User Clicks on edit the  profile button")
	public void user_clicks_on_edit_the_profile_button() {
	   System.out.println("Profile Edited");
	}

	@When("user update the data")
	public void user_update_the_data() {
		System.out.println("Profile modification");
	 
	}

	@Then("profile should get modified")
	public void profile_should_get_modified() {
	    System.out.println("Profile Updation");
	}

	@When("User Clicks on Delete the  profile button")
	public void user_clicks_on_delete_the_profile_button() {
	    System.out.println("Delete profile");
	}

	@When("user delete the data")
	public void user_delete_the_data() {
		System.out.println("Delete the profile");
	    
	}

	@Then("profile should get Deleted")
	public void profile_should_get_deleted() {
	   System.out.println("Profile deleted");
	}



}
