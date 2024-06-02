 package Steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PlaceOrderSteps {
    private String productId; // Define globally here that product ID
     
    public String getProductId()   // here we call getProductId   method because product id is private and not able to access to other class
     {
    	 return productId;
     }
     
	@Given("I should be at product page")
	public void i_should_be_at_product_page() {
	   System.out.println("Given Statement");
	}

	@When("i click on add to cart button")
	public void i_click_on_add_to_cart_button() {
	   System.out.println("Clicking on add to cart");
	}

	@Then("Product should get added")
	public void product_should_get_added() {
	    System.out.println("Product got added");
	    
	     productId = "Galaxy@12345";    // not need to write string before productId because we declared globally above
	}

	



}
