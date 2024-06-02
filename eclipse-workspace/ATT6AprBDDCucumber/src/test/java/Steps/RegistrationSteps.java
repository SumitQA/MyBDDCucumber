package Steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;
import java.util.Map;

import io.cucumber.datatable.DataTable;

public class RegistrationSteps {
	@Given("User should be at registration page")
	public void user_should_be_at_registration_page() {
		System.out.println("Given Steps");
	   
	}

	@When("User enters the data in following manner")     // Here we read the data
	public void user_enters_the_data_in_following_manner(DataTable dataTable) {
	  
	          List<List<String>> data = dataTable.asLists(); // all data will Retrive in (dataTable)
	          List<String> firstList = data.get(2);      // Here call one row by get method  giving index            
	           String emailadress = firstList.get(2); // Here we call one by one data in that row which we have call in line 22
	           System.out.println("Email Adress is "+emailadress);   // (as per requirement we retriving data from Table by giving INdex)
	          
	         
	           String lastname = data.get(1).get(2); // This Step is combine of Line 23 only here 
	           System.out.println(lastname);
	           System.out.println("************************************");
	           
	           for (List<String> Value :data)
	           {
	        	   System.out.println(Value);
	           }
	           
	           System.out.println("***************Reading Using Map**************************");
	         
	       List<Map<String, String>> data1 = dataTable.asMaps();
	       String MobileNumber = data1.get(0).get("Mobile"); // Here we call one Row by giving Index (get.(0)and 2nd time get("ColumnName")  use for Column name
	       System.out.println(MobileNumber); // Print Variable which contain data output will be- 8766552567
	}
	

	@When("user click on submit button")
	public void user_click_on_submit_button() {
	   System.out.println("It should click on submit button");
	}

	@Then("account should get created")
	public void account_should_get_created() {
		System.out.println("Account created");
	   
	}

}
