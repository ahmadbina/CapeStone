package stepDefinitions;

import java.io.IOException;


import javax.swing.text.Utilities;

import Utilites.Screenshot;
import core.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.HomePageObject;

public class SetUpHomePage extends Base {
	HomePageObject homeObject = new HomePageObject();
	
	
@Given("User is test environment")
public void user_is_test_environment() {
	
	homeObject.validateHomePage();
   
}

@When("user scroll over on Destops button")
public void user_scroll_over_on_destops_button() {
	homeObject.scrollOnDesktops();
	
}

@Then("user scroll over on Show all Desktops")
public void user_scroll_over_on_show_all_desktops() {
	homeObject.scrollOvershowalldesktop();
}
@Then("user click on show all Desktops")
public void user_click_on_show_all_desktops() throws IOException {
	
Screenshot.takeScreenShot("clickOnshowallDesktop");
	
}

}
