package stepDefinitions;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;

import Utilites.Screenshot;
import core.Base;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.DeskopsPageObject;

public class  SetUpDestopsPage extends Base {
	
	DeskopsPageObject desktop = new DeskopsPageObject();
	@Given("User is on Retail website")
	public void user_is_test_environment() {
		
	}
	@When("User click on Desktops tab")
	public void user_click_on_desktops_tab() {
		desktop.desktop();
	    
	}

	@When("User click on Show all desktops")
	public void user_click_on_show_all_desktops() {
	   desktop.showalldesktop();
	}

	@Then("User should see all items are present in Desktop page")
	public void user_should_see_all_items_are_present_in_desktop_page() throws IOException {
		desktop.ShowingItems();
		desktop.Allimg();
		desktop.AllITag();
		desktop.AllSpanTag();
		Screenshot.takeScreenShot("Desktop");
		
		
	}
	@When("User click  ADD TO CART option on ‘HP LP3065’ item")
	public void user_click_add_to_cart_option_on_hp_lp3065_item() throws IOException {
		desktop.ClickAddToCart();
		Screenshot.takeScreenShot("AddToCart");
		logger.info("ClickAddToCart: validated successfully");
	}

	@When("User select quantity {int}")
	public void user_select_quantity(Integer int1) throws IOException {
		desktop.selectAddQty();
	
		logger.info("selectAddQty; validated successfully");
	}

	@When("User click add to Cart button")
	public void user_click_add_to_cart_button() {
		desktop.clickAddTocartagin();
	}

	@Then("User should see a message ‘Success: you have added HP LP {int} to your Shopping cart!’")
	public void user_should_see_a_message_success_you_have_added_hp_lp_to_your_shopping_cart(Integer int1) throws IOException {
		
		Screenshot.takeScreenShot("textconfirm");
	Assert.assertTrue(desktop.textConfirm());
	Screenshot.takeScreenShot("5DConfirmationforCamra Text");
	logger.info("Print the text successfully");
	
	}
	@When("User click  ADD TO CART option on ‘Canon EOS 5D’ item")
	public void user_click_add_to_cart_option_on_canon_eos_5d_item() {
		desktop.ClickAddtoCartCanon5D();
		logger.info("Click on canon 5D successfully");
	}

	@When("User select color from dropdown ‘Red’")
	public void user_select_color_from_dropdown_red() {
		desktop.ClickColorOption();
		logger.info("Click in box of color Option successfully");
	}

	@Then("User should see a message ‘Success: You have added Canon EOS 5D to your shopping cart!’")
	public void user_should_see_a_message_success_you_have_added_canon_eos_5d_to_your_shopping_cart() throws IOException {
//		desktop.text5DConfirmationforCamra();
		Assert.assertTrue(desktop.text5DConfirmationforCamra());
		Screenshot.takeScreenShot("5DConfirmationforCamra Text");
		logger.info("Print the text for 5D successfully");
	}
	
	@When("^User click on Canon EOS (\\d+)D item$")
	public void user_click_on_Canon_EOS_D_item(int arg1) {
		desktop.ClickAddtoCartCanon5D();
	}

	@When("^User click on write a review link$")
	public void user_click_on_write_a_review_link(){
		desktop.Reviewsbutton();
	}

	@When("^user fill the review information with below information$")
	public void user_fill_the_review_information_with_below_information(DataTable dataTable){
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
		List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
		desktop.sendkeyNameToReview(data.get(0).get("yourname"));
		desktop.writeyourReview(data.get(0).get("yourReview"));
		desktop.clickRodiobutton();
	}

	@When("^User click on Continue Button$")
	public void user_click_on_Continue_Button()  {
		desktop.clickContinuebutton();
	    
	}

	@Then("^User should see a message with ‘Thank you for your review\\.$")
	public void user_should_see_a_message_with_Thank_you_for_your_review() throws IOException  {
		
	    Assert.assertTrue(desktop.thankyouText());
	    Screenshot.takeScreenShot("Thank you Note");
	}
}
