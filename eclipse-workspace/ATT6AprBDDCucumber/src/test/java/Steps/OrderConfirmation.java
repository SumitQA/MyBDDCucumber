package Steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OrderConfirmation {
	PlaceOrderSteps placeOrder;  // here we Globally define Ref Variable
	String prdId;   
	
	public OrderConfirmation(PlaceOrderSteps placeOrder)    //This is Constructor of class and pass arguemnet of another class which consist productID
	{
		this.placeOrder = placeOrder;    //this.placeOrder is globally define variable
	}

	@When("i click on place order button")
	public void i_click_on_place_order_button() {
	    System.out.println("Cliking on place order button");
	}

	@Then("order should get confirm")
	public void order_should_get_confirm() {
		
		   prdId = placeOrder.getProductId(); // prdId is string value need to define class level and getProductId is method of another class to link each other
	   System.out.println("Order confirmed with productId: "+prdId);
	   
	
	}
}
