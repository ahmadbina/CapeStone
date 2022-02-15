package pageobjects;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilites.Screenshot;
import core.Base;

public class LaptopsNoteBooksPageObject extends Base {
	public LaptopsNoteBooksPageObject() {
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//a[text()='TEST ENVIRONMENT']")
	private WebElement Homepagetext;
	@FindBy(xpath = "//a[text()='Laptops & Notebooks']")
	private WebElement clickonLoptopandNotbook;
	@FindBy(xpath = "//a[text()='Show All Laptops & Notebooks']")
	private WebElement showAlllaptop;
	@FindBy(xpath = "//img[@alt='MacBook']")
	private WebElement clickMacbook;
	@FindBy(css = "button#button-cart")
	private WebElement clickaddcart;
	@FindBy(xpath = "//div[text()='Success: You have added ']")
	private WebElement verifySuccesstext;
	@FindBy(xpath = "//span[@id='cart-total']")
	private WebElement cartTotal;
	@FindBy(xpath = "//div[@id='cart']//button[@data-toggle='dropdown']")
	private WebElement clickoncortToremoveItem;
	@FindBy(xpath = "//button[@title='Remove']")
	private WebElement clickredXbutton;
	@FindBy(xpath = "//span[@id='cart-total']/i")
	private WebElement emptycart;
	// ------------------------------------nextScenario--------------------------
	@FindBy(xpath = "(//body/div[@id='product-category'])//div[2]/div[1]/div[2]/div[2]/button[3]")
	private WebElement clickcomparisonIconMackBook;
	@FindBy(xpath = "(//body/div[@id='product-category'])//div[3]//div[2]/div[2]/button[3]")
	private WebElement clikcomparisonIconMackBookAir;
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement succdssYouhaveaddToTheCartText;
	@FindBy(xpath = "//a[@id='compare-total']")
	private WebElement clickproductComparelink;
	@FindBy(xpath = "//h1[text()='Product Comparison']")
	private WebElement productComparionText;
	// ---------------------------------------------
	@FindBy(xpath = "(//div[@id='product-category'])//div[5]//button[2]")
	private WebElement clickOnHearIcon;
	@FindBy(xpath = "//div[text()=' You must ']")
	private WebElement youMustLogingText72;
	// ----------------------------------------------------
	@FindBy(xpath = "//img[@title='MacBook Pro']")
	private WebElement ClickOnMackPro;
	@FindBy(xpath = "//h2[text()='$2,000.00']")
	private WebElement MackPropriceTagText;

	public void Homepagetext() {
		String actualText = Homepagetext.getText();
		String expectedText = "TEST ENVIRONMENT";
		Assert.assertEquals(actualText, expectedText);
		logger.info(Homepagetext.getText());

	}

	public void clickOnlaptopAndNotebook() {
		clickonLoptopandNotbook.click();
		logger.info("Sccessfully clicked ");
	}

	public void clickshowAllLaptops() {
		showAlllaptop.click();
		logger.info("Showing all items");
	}

	public void clickonmacbook() {
		clickMacbook.click();
		logger.info("Sccessfully clicked ");
	}

	public void clickaddtothecart() {
		clickaddcart.click();
		logger.info("Sccessfully clicked ");
	}

	public void verifySuccesstext() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].style.border='2px solid red'", verifySuccesstext);
		String strverifyTextmessage = "Success: You have added MacBook to your shopping cart!";
		String actualText = verifySuccesstext.getText();
		String subString = actualText.substring(0, 54);
		Assert.assertEquals(strverifyTextmessage, subString);
		System.out.println("TamimBian: " + actualText);

//			if(text.equalsIgnoreCase("Success: You have added ")) {
//				logger.info("Text verified!S");
//			}else {
//				logger.info("the \"success\" not matching");
//			}
	}

	public void showcartTotalprice(String strcatTotal) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].style.border='2px solid red'", cartTotal);
		String actualcartTotal = cartTotal.getText();
		Assert.assertEquals(strcatTotal, actualcartTotal);
		System.out.println(actualcartTotal);
	}

	public void cartOption() {
		clickoncortToremoveItem.click();
	}

	public void clickonRedXbutton() {
		clickredXbutton.click();
	}

	public void emtyCartZero(String zeroCart) throws InterruptedException {
		
		Thread.sleep(3000);
		String actualcartTotalZero = cartTotal.getText();
		Assert.assertEquals(zeroCart, actualcartTotalZero);
		System.out.println(actualcartTotalZero);
	}

	public void clickcomparisonIconMackBook() {
		clickcomparisonIconMackBook.click();
		logger.info("click on comparion Icon MacBook");
	}

	public void clikcomparisonIconMackBookAir() {
		clikcomparisonIconMackBookAir.click();
		logger.info("click on comparion Icon MacBook Air");
	}

	public boolean succdssYouhaveaddToTheCartText() {
		System.out.println("TamimBinaCheck: " + succdssYouhaveaddToTheCartText.getText());
		String actualtext = succdssYouhaveaddToTheCartText.getText();
		String expectedText = "Success: You have added MacBook Air to your product comparison!";
		String subString = actualtext.substring(0, 63);

		if (subString.contains(subString)) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].style.border='2px solid red'", succdssYouhaveaddToTheCartText);
			logger.info("this is the real text: " + subString);

		} else {
			logger.info("the text is not matching");
		}
		String text = expectedText;
		int count = 0;
		for (int i = 0; i < text.length(); i++) {
			char success = text.charAt(i);
			count = text.length();
			System.out.print(success);
		}
		System.out.println("\n  The Count Text: " + count);
		return true;
	}

	public void clickproductComparelink() {
		clickproductComparelink.click();
	}

	public void productComparionText() {
		String actualText = productComparionText.getText();
		String expectedText = "Product Comparison";
		if (actualText.equalsIgnoreCase(expectedText)) {
			logger.info("Successull printing text: " + actualText);
		} else {
			logger.info("the text is not matching ");
		}
//		Assert.assertEquals(expectedText, actualText);
//		logger.info("this is comprison text Page:   "+actualText);

	}

	public void clickOnHearVAIOIcon() {
		clickOnHearIcon.click();
	}

	public void youMustLogingText72() {
		System.out.println("Tamim Check: " + youMustLogingText72.getText());
		String actualTextforMack = youMustLogingText72.getText();
		String expectedtext = "You must login or create an account to save Sony VAIO to your wish list!";
		String strVAIO = actualTextforMack.substring(0, 72);
		Assert.assertEquals(expectedtext, strVAIO);
		System.out.println(actualTextforMack);
		System.out.println(strVAIO);
	}

	public void ClickOnMackPro() {
		ClickOnMackPro.click();
	}

	public void MackPropriceTagText() {
		String actualTextMackprice = MackPropriceTagText.getText();
		String expectedTextMackprice = "$2,000.00";
		Assert.assertEquals(expectedTextMackprice, actualTextMackprice);
		logger.info(actualTextMackprice);
	}
}
