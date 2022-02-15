package stepDefinitions;



import core.Base;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;



public class Iinitializer extends Base {
	@Before
	public void beforeHooks(Scenario scenario) {
		logger.info("Scenario "+ scenario.getName() + " Started");
		multiBrowser(); 
		openBrowser(); 
	}
	@After
	public void afterHooks(Scenario scenario) {
		closeBrowsers();
	logger.info("Scenario " + scenario.getName() + " " + scenario.getStatus());
	}


}
