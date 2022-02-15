package stepDefinitions;

import java.io.IOException;

import org.junit.Assert;

import Utilites.Screenshot;
import io.cucumber.java.en.*;
import pageobjects.CurrencyHomepageObject;


public class SetUpcurrencyHompage {
	CurrencyHomepageObject curencyhome= new CurrencyHomepageObject();
	@Given("^User click on Currency$")
	public void user_click_on_Currency()   {
		curencyhome.currencyButton();
	}

	@When("^User Chose Euro from dropdown$")
	public void user_Chose_Euro_from_dropdown()   {
		curencyhome.€Euro();
	}

	@Then("^currency value should change to Euro$")
	public void currency_value_should_change_to_Euro() throws IOException   {
		curencyhome.verifyText€Euro();
		Assert.assertTrue(curencyhome.verifyText€Euro());
		Screenshot.takeScreenShot("verifyText€Euro");
	}
	@When("^User click on shopping cart$")
	public void user_click_on_shopping_cart()   {
		curencyhome.Clickisempty();
	}

	@Then("^“Your shopping cart is empty!” message should display$")
	public void your_shopping_cart_is_empty_message_should_display() throws IOException  {
		curencyhome.Yourshoppingcartisempty();
	
		Screenshot.takeScreenShot("shoppingcartisempty");
		
	}
}
