package pageobjects;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class DeskopsPageObject extends Base{
	
	public DeskopsPageObject() {
		PageFactory.initElements(driver, this);
		
		}
	@FindBy(xpath = "//a[text()='TEST ENVIRONMENT']")
	private WebElement Homepagetext;
	@FindBy(xpath = "//a[text()='Desktops']")
	private WebElement clickonDesktops;
	@FindBy(xpath = "//a[text()='Show All Desktops']")
	private WebElement clickShowAllDesktops;
	@FindBy(tagName  = "a")
	private List<WebElement> ShingItems;
	@FindBy(tagName  = "img")
	private List<WebElement> Allimg;
	@FindBy(tagName  = "i")
	private List<WebElement> AllITag;
	@FindBy(tagName  = "span")
	private List<WebElement> AllspanTag;
	@FindBy(xpath = "//h2[contains(text(),'Desktops')]")
	private WebElement DesktopTextverification;
	
	@FindBy(xpath = "(//span[text()='Add to Cart'])[3]")//(//div[@class='button-group' and @xpath])//button[1]
	private WebElement clickAddToCart;
	@FindBy(css  = "#input-quantity")
	private WebElement AddQty;
	@FindBy(xpath = "//button[@id='button-cart']")
	private WebElement ClickAddTocartagin;
	@FindBy(xpath = "//div[@id='product-product']/div[1]")
	private WebElement textConfirmation;
	@FindBy(xpath="(//span[text()='Add to Cart'])[2]")
	private WebElement clickAddtoCartCanon5D;
	@FindBy(name  = "option[226]")
	private WebElement clickColorOption;
	@FindBy(xpath  = "//option[contains(text(),'Red')]")
	private WebElement clickRed;
	@FindBy(xpath="//button[@id='button-cart']")
	private WebElement addtocartcamer;
	@FindBy(xpath  = "//input[@id='input-quantity']")
	private WebElement sendkeyQtyCanon;
	@FindBy(xpath = "//div[@id='product-product']/div[1]")
	private WebElement textConfirmationforcamra;
	@FindBy(xpath = "//a[contains(text(),'Reviews')]")
	private WebElement reviewsbutton;
	@FindBy(xpath = "//input[@name='name']")
	private WebElement yourNameToReview;
	@FindBy(xpath = "//textarea[@name='text']")
	private WebElement writeReview;
	@FindBy(xpath = "//input[@name='rating']//following::input[@value='5']")
	private WebElement rodiobutton;
	@FindBy(xpath = "//button[@id='button-review']")
	private WebElement clickContinuebutton;
	@FindBy(xpath = "//child::div//input[@value='5']")
	private WebElement clickradiobutton;
	@FindBy(xpath = "//div[@id='product-product']/div[1]//div[2]/form[1]/div[2]")
	private WebElement thankText;
	
	
	public void desktop() {
		clickonDesktops.click();
}
public void showalldesktop() {
	clickShowAllDesktops.click();
}
public void ShowingItems() {
	List<WebElement>allItems=ShingItems;
	for (int i = 0; i < allItems.size(); i++) {
		String items= allItems.get(i).getText();
		logger.info("This is the list: Tag A "+items);
	}
}
public void Allimg() {
	List<WebElement>allItems2=Allimg;
	for (int i = 0; i < allItems2.size(); i++) {
		String items= allItems2.get(i).getText();
		logger.info("All img are present: "+items);
	}
}
public void AllITag() {
	List<WebElement>allItems3=AllITag;
	for (int i = 0; i < allItems3.size(); i++) {
		String items= allItems3.get(i).getText();
		logger.info("All ITag are present: "+items);
	}
}
public void AllSpanTag() {
	List<WebElement>allItems4=AllspanTag;
	for (int i = 0; i < allItems4.size(); i++) {
		String items= allItems4.get(i).getText();
		logger.info("All img are present: "+items);
	}
}

public void ClickAddToCart() {
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("arguments[0]. click();", clickAddToCart);
}
public void selectAddQty() {
	AddQty.clear();
	AddQty.sendKeys("1");
}
public void clickAddTocartagin() {
	ClickAddTocartagin.click();
}
public boolean textConfirm() {
	if(textConfirmation.isDisplayed()) {
		return true;
		
	}else {
		return false;
	}
}
public void ClickAddtoCartCanon5D() {
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("arguments[0]. click();", clickAddtoCartCanon5D);
}
public void ClickColorOption() {
	
	clickColorOption.click();
	clickRed.click();
}
public void addtocartcamer5D() {
	addtocartcamer.click();
}
public boolean text5DConfirmationforCamra() {
	if(textConfirmationforcamra.isDisplayed()) {
		return true;
		
	}else {
		return false;
	}
}
public void Reviewsbutton() {
	reviewsbutton.click();
}
public void sendkeyNameToReview(String name) {
	yourNameToReview.sendKeys(name);
	
}
public void writeyourReview(String review) {
	writeReview.sendKeys(review);
}
public void clickRodiobutton() {
	rodiobutton.click();
}
public void clickContinuebutton() {
	clickContinuebutton.click();
}
public boolean thankyouText() {
	
	if(thankText.isDisplayed()) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].style.border='2px solid red'",thankText);
		return true;
	}else {
		return false;
	}
	
}
}







