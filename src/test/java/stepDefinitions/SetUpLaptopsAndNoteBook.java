package stepDefinitions;

import java.io.IOException;

import org.junit.Assert;

import Utilites.Screenshot;
import core.Base;
import io.cucumber.java.en.*;
import pageobjects.LaptopsNoteBooksPageObject;

public class SetUpLaptopsAndNoteBook extends Base {
	LaptopsNoteBooksPageObject laptopNotbooks = new LaptopsNoteBooksPageObject();
	
	

	@When("^User click on Laptop & NoteBook tab$")
	public void user_click_on_Laptop_NoteBook_tab() {
		laptopNotbooks.clickOnlaptopAndNotebook();
	}

	@When("^User click on Show all Laptop & NoteBook option$")
	public void user_click_on_Show_all_Laptop_NoteBook_option() {
		laptopNotbooks.clickshowAllLaptops();
	}

	@Given("^User click on MacBook  item$")
	public void user_click_on_MacBook_item() {
		laptopNotbooks.clickonmacbook();
	}

	@Then("^User click add to Cart button one$")
	public void user_click_add_to_Cart_button() {
		laptopNotbooks.clickaddtothecart();
	}
// Success: You have added MacBook to your shopping cart!
	@Then("User should see a message 'Success: You have added MacBook to your shopping cart!'")
	public void user_should_see_a_message_Success_You_have_added_MacBook_to_your_shopping_cart() throws IOException   {
		laptopNotbooks.verifySuccesstext();
		Screenshot.takeScreenShot("verifySuccesstext");
	}
	
	@Then("User should see {string} showed to the cart")
	public void user_should_see_item_s_$_showed_to_the_cart(String cart) throws IOException{
		laptopNotbooks.showcartTotalprice(cart);
		Screenshot.takeScreenShot("item should see item price from cart");
	}

	@Then("^User click on cart option$")
	public void user_click_on_cart_option(){
		laptopNotbooks.cartOption();
	}

	@Then("^user click on red X button to remove the item from cart$")
	public void user_click_on_red_X_button_to_remove_the_item_from_cart(){
		laptopNotbooks.clickonRedXbutton();
	}
	
	@Then("item should be removed and cart should show {string}")
	public void item_should_be_removed_and_cart_should_show_item_s_$(String remove) throws IOException, InterruptedException {
	laptopNotbooks.emtyCartZero(remove);
	Screenshot.takeScreenShot("item should be removed from cart");
	
	}

	@Given("^User click on product comparison icon on ‘MacBook’$")
	public void user_click_on_product_comparison_icon_on_MacBook() {
		laptopNotbooks.clickcomparisonIconMackBook();
	}

	@When("^User click on product comparison icon on ‘MacBook Air$")
	public void user_click_on_product_comparison_icon_on_MacBook_Air() throws InterruptedException  {
		Thread.sleep(2000);
		laptopNotbooks.clikcomparisonIconMackBookAir();
	}

	@Then("^User should see a message 'Success: You have added MacBook Air to your product comparison!'$")
	public void user_should_see_a_message_Success_You_have_added_MacBook_Air_to_your_product_comparison() throws InterruptedException, IOException  {
		Thread.sleep(3000);
		Assert.assertTrue(laptopNotbooks.succdssYouhaveaddToTheCartText());
		logger.info("Succesfully print the text ");
	}

	@Then("^User click on Product comparison link$")
	public void user_click_on_Product_comparison_link() throws InterruptedException {
		Thread.sleep(3000);
		laptopNotbooks.clickproductComparelink();
	}

	@Then("^User should see Product Comparison Chart$")
	public void user_should_see_Product_Comparison_Chart() {
		laptopNotbooks.productComparionText();
	}

	@Given("^User click on heart icon to add ‘Sony VaIO’ laptop to wish list$")
	public void user_click_on_heart_icon_to_add_Sony_VaIO_laptop_to_wish_list(){
		laptopNotbooks.clickOnHearVAIOIcon();
		logger.info("click on heart icon to add Sony VAIO Successfull");
	}

	@Then("User should get a message 'You must login or create an account to save Sony VAIO to your wish list!'")
	public void user_should_get_a_message_You_must_login_or_create_an_account_to_save_Sony_VAIO_to_your_wish_list() {
		laptopNotbooks.youMustLogingText72();
	}

	@Given("^User click on ‘MacBook Pro’ item$")
	public void user_click_on_MacBook_Pro_item(){
		laptopNotbooks.ClickOnMackPro();
	}

	@Then("User should see '$2,000.00' price tag is present on UI.")
	public void user_should_see_$_price_tag_is_present_on_UI(){
		laptopNotbooks.MackPropriceTagText();
	}

}
