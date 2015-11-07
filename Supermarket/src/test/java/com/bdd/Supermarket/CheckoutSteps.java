package com.bdd.Supermarket;

import org.junit.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CheckoutSteps {
	int bananaPrice = 0;
	int applePrice = 0;
	Checkout checkout = new Checkout();
	
	@Given("^the price of a \"([^\"]*)\" is (\\d+)c$")
	public void thePriceOfAIsC(String name, int price) throws Throwable {
		if (name.equals("banana"))
			bananaPrice = price;
		else if (name.equals("apple"))
			applePrice = price;
		else
			throw new UnknownError("Unknown grocery type");
	}

	@When("^I checkout (\\d+) \"([^\"]*)\"$")
	public void iCheckout(int itemCount, String itemName) throws Throwable {
	    if (itemName.equals("banana"))
	    	checkout.add(itemCount, bananaPrice);
	    else if (itemName.equals("apple"))
	    	checkout.add(itemCount, applePrice);
	    else
	    	throw new UnknownError("Unknown grocery price");
	}

	@Then("^the total price should be (\\d+)c$")
	public void theTotalPriceShouldBeC(int total) throws Throwable {
	    Assert.assertEquals(total, checkout.total());
	}
}
