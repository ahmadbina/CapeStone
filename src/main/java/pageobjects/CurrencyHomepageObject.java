 package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class CurrencyHomepageObject extends Base {
	public CurrencyHomepageObject() {
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//span[text()='Currency']")
	private WebElement currencyButton;
	@FindBy(xpath = "//button[contains(text(),'€ Euro')]")
	private WebElement €Euro;
	@FindBy(xpath = "(//div[@id='common-home'])//p[contains(text(),'472.33')]")
	private WebElement verifyText€Euro;
	@FindBy(xpath = "//span[@id='cart-total']")
	private WebElement Clickisempty;
	@FindBy(xpath = "//p[contains(text(),'Your shopping cart is empty!')]")
	private WebElement Yourshoppingcartisempty;

	public void currencyButton() {
		currencyButton.click();
	}

	public void €Euro() {
		€Euro.click();
	}

	public boolean verifyText€Euro() {
		if (verifyText€Euro.isDisplayed()) {
			logger.info("The Currency Chenged fron $ to €: "+ verifyText€Euro.getText());
			return true;

		} else {
			return false;
		}

	}

	public void Clickisempty() {
		Clickisempty.click();
	}

	public void Yourshoppingcartisempty() {
		String actualText = Yourshoppingcartisempty.getText();
		String expectedText = "Your shopping cart is empty!";
		if (actualText.equalsIgnoreCase(expectedText)) {
			logger.info(expectedText);
		} else {
			logger.info("The Text Message is not Matching");
		}
	}
}