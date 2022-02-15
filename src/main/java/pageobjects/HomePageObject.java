package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import core.Base;
import junit.framework.Assert;

public class HomePageObject extends Base{
	public HomePageObject() {
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath = "//a[text()='TEST ENVIRONMENT']")
	private WebElement Homepagetext;

	@FindBy(xpath = "//a[text()='Desktops']")
	private WebElement desktops;
	@FindBy(xpath = "//img[@alt='MacBook']")
	private WebElement macbook;
	@FindBy(xpath = "//a[@xpath='1']")
	private WebElement macbooktext;
	@FindBy(xpath = "//a[@xpath='1']")
	private WebElement addtocart;
	@FindBy(xpath = "//button[@data-original-title='Add to Wish List']/i[@xpath='1']")
	private WebElement addtowishlist;
	@FindBy(xpath = "//button[@data-original-title='Compare this Product']/i[@xpath='1']")
	private WebElement compareProduct;
	@FindBy(linkText = "iPhone")
	private WebElement iPhone;
	@FindBy(xpath = "//body/div[@id='common-home']//div[2]/div[1]/div[3]/button[1]")
	private WebElement iPhoneAddtocart;
	@FindBy(css = "img[alt='Apple Cinema 30\"']")
	private WebElement AppleCiname;
	@FindBy(xpath = "//body/div[@id='common-home']//div[3]/div[1]/div[3]/button[1]")
	private WebElement clickonapleCiname;
	@FindBy(xpath = "//a[contains(text(),' 5D')]")
	private WebElement camera;
	@FindBy(xpath = "//body/div[@id='common-home']//following::button[10]/span")
	private WebElement cameraaddtocart;
	@FindBy(xpath = "//a[text()='Show All Desktops']")
	private WebElement showAllDesktops;
	
//	String actulText = Homepagetext.getText();
//	String expectedText="TEST ENVIRONMENT";
	public void validateHomePage() {
		String text = Homepagetext.getText();
		if(text.equalsIgnoreCase("TEST ENVIRONMENT")) {
			logger.info("Text verified!");
		}else {
			logger.info("Text does not match!");
		}

		
		
	}
	public void scrollOnDesktops() {
		
		Actions action = new Actions(driver);
		action.moveToElement(desktops).perform();
	}
	public void scrollOvershowalldesktop() {
	
		Actions action = new Actions(driver);
		action.moveToElement(showAllDesktops).perform();
	}
	
	public void clickOnshowallDesktop() {
		explicitWaith(desktops);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0]. click();", showAllDesktops);
	}
	

	

}
