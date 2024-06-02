package Steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginWithData {

	@Given("User should be at login page")
	public void user_should_be_at_login_page() {
	   System.out.println("Given Steps");
	}

	@When("I enter Username as {string}")
	public void i_enter_username_as(String Uname) {
		System.out.println("Entered password " +Uname );
	    
	}

	@When("I enter password  as {string}")
	public void i_enter_password_as(String  Pwd) {
		System.out.println("Password is "+ Pwd);
	  
	}

	@When("I click on lgin")
	@When("I click on lgin {int} button")
	public void i_click_on_lgin_button(Integer int1) {
		System.out.println("Entered value For Login is "+int1);
	}
	   
		
	

	@Then("I should be able to Logged in")
	public void i_should_be_able_to_logged_in() {
	    
		System.out.println("Verify login");
	}



}
