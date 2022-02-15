package stepDefinitions;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utilites.Screenshot;
import core.Base;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import pageobjects.RetailPageObject;

public class SetUpRetailPage extends Base {

	RetailPageObject retailPage = new RetailPageObject();

	@Given("^User click on MyAccount$")
	public void user_click_on_MyAccount() {
		retailPage.myacount();
		logger.info("user click on my account");
	}

	@When("^User click on Login$")
	public void user_click_on_Login() {
		retailPage.loginmyaccout();
		logger.info("user click on on login");

	}

	@When("^User enter username 'userName' and password 'password'$")
	public void user_enter_username_userName_and_password_password() {
		retailPage.usernameoremail("ali_agha@gmail.com");
		retailPage.password("stonegate");
	}

	@When("^User click on Login button$")
	public void user_click_on_Login_button() {
		retailPage.loginbutton();
		logger.info("user click on my logging button");

	}

	@Then("^User should be logged in to MyAccount dashboard$")
	public void user_should_be_logged_in_to_MyAccount_dashboard() throws IOException {

		Assert.assertTrue(retailPage.verifingTextofaccount());
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("arguments[0].style.background='yellow'", retailPage.verifingTextofaccount());
		Screenshot.takeScreenShot("verifingTextofaccount");
		logger.info("user successfuly logged and see dashboard");

	}

	@When("^User click on ‘Register for an Affiliate Account’ link$")
	public void user_click_on_Register_for_an_Affiliate_Account_link() {

		retailPage.Registerforanaffiliateaccount();
		logger.info("user click on Register for an Affiliate account");

	}

	@When("^User fill affiliate form with below information$")
	public void user_fill_affiliate_form_with_below_information(DataTable data) throws InterruptedException {

		List<Map<String, String>> Data = data.asMaps(String.class, String.class);
		retailPage.cleareCompany();
		retailPage.company(Data.get(0).get("company"));
		retailPage.clearwesite();
		retailPage.website(Data.get(0).get("website"));
		retailPage.clearTaxID();
		retailPage.TaxID(Data.get(0).get("taxID"));
		retailPage.clickChequeRadio();
		Thread.sleep(3000);
		retailPage.chequebox(Data.get(0).get("paymentMethod"));

	}

	@When("^User check on About us check box$")
	public void user_check_on_About_us_check_box() throws IOException {
		retailPage.chequeRadio();
		Assert.assertTrue(retailPage.chequeRadio());
		Screenshot.takeScreenShot("chequeRadio");
		logger.info("Cheque Raidio Button selection: " + retailPage.chequeRadio());

	}

	@When("^User click on Continue button$")
	public void user_click_on_Continue_button() {
		retailPage.Continue();
	}

	@Then("^User should see a success message$")
	public void user_should_see_a_success_message() throws IOException {
		Assert.assertTrue(retailPage.SuccessText());

		Screenshot.takeScreenShot("SuccessText");
	}

	@When("^User click on ‘Edit your affiliate informationlink$")
	public void user_click_on_Edit_your_affiliate_informationlink() {
		retailPage.Registerforanaffiliateaccount();
	}

	@When("^user click on Bank Transfer radio button$")
	public void user_click_on_Bank_Transfer_radio_button() {
		retailPage.radioBank();
		logger.info("Radio Button is selected");
	}

	@When("^User fill Bank information with below information$")
	public void user_fill_Bank_information_with_below_information(DataTable Table) {

		List<Map<String, String>> BankInfo = Table.asMaps(String.class, String.class);
		retailPage.bankname(BankInfo.get(0).get("bankName"));
		retailPage.branchNO(BankInfo.get(0).get("abaNumber"));
		retailPage.bankswiftcode(BankInfo.get(0).get("swiftCode"));
		retailPage.bankAccountName(BankInfo.get(0).get("accountName"));
		retailPage.bankAccountNumber(BankInfo.get(0).get("accountNumber"));
	}

	@When("^User click on Continue button to pay$")
	public void user_click_on_Continue_button_to_pay() {
		retailPage.Continue();
	}

	@Then("^User should see a success message for payment$")
	public void user_should_see_a_success_message_for_payment() throws IOException {
		Assert.assertTrue(retailPage.SuccessText());

		Screenshot.takeScreenShot("SuccessText");
	}

	@When("^User click on ‘Edit your account information’ link$")
	public void user_click_on_Edit_your_account_information_link() {
		retailPage.EditAccountInformation();
	}

	@When("^User modify below information$")
	public void user_modify_below_information(DataTable Tabl3) {
		List<Map<String, String>> EditeAcountInfo = Tabl3.asMaps(String.class, String.class);
		retailPage.inputFirstname(EditeAcountInfo.get(0).get("firstname"));
		retailPage.inputLastname(EditeAcountInfo.get(0).get("lastName"));
		retailPage.inputEmailclear();
		retailPage.inputEmail(EditeAcountInfo.get(0).get("email"));
		retailPage.inputTelephoneClear();
		retailPage.inputTelephone(EditeAcountInfo.get(0).get("telephone"));

	}

	@When("^User click on continue button$")
	public void user_click_on_continue_button() {
		retailPage.EditeContinueButton();
	}

	@Then("^User should see a message ‘Success: Your account has been successfully updated\\.’$")
	public void user_should_see_a_message_Success_Your_account_has_been_successfully_updated() throws IOException {
		Assert.assertTrue(retailPage.SuccessText());

		Screenshot.takeScreenShot("SuccessText");
	}

}
