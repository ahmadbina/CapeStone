package pageobjects;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class RetailPageObject extends Base {
	public RetailPageObject() {
		PageFactory.initElements(driver, this);
		
		
		}
	@FindBy(xpath = "//span[contains(text(),'My Account')]")
	private WebElement myacount;
	@FindBy(xpath = "//a[contains(text(),'Login')]")
	private WebElement loginmyaccout;
	@FindBy(css = "#input-email")
	private WebElement usernameoremail;
	@FindBy(css = "#input-password")
	private WebElement password;
	@FindBy(xpath = "//input[@value='Login']")
	private WebElement loginbutton;
	@FindBy(xpath = "//h2[text()='My Account']")
	private WebElement verifingTextofaccount;
	@FindBy(xpath = "//a[contains(text(),'Edit your affiliate information')]")
	private WebElement Registerforanaffiliateaccount;
	@FindBy(xpath = "//input[@id='input-company']")
	private WebElement company;
	@FindBy(xpath = "//input[@id='input-website']")
	private WebElement website;
	@FindBy(xpath = "//input[@id='input-tax']")
	private WebElement TaxID;
	@FindBy(xpath = "//input[@value='cheque']")
	private WebElement chequeRadio;
	@FindBy(xpath = "//input[@id='input-cheque']")
	private WebElement chequebox;
	@FindBy(xpath = "//input[@value='bank']")
	private WebElement radioBank;
	@FindBy(xpath = "//input[@id='input-bank-name']")
	private WebElement bankname;
	@FindBy(xpath = "//input[@id='input-bank-branch-number']")
	private WebElement bankbranchnumber;
	@FindBy(xpath = "//input[@id='input-bank-swift-code']")
	private WebElement bankswiftcode;
	@FindBy(xpath = "//input[@id='input-bank-account-name']")
	private WebElement bankAccountName;
	@FindBy(xpath = "//input[@id='input-bank-account-number']")
	private WebElement bankAccountNumber;
	@FindBy(xpath = "//input[@type='checkbox']")
	private WebElement checkbox;
	@FindBy(xpath = "//input[@value='Continue']")
	private WebElement Continue;
	@FindBy(xpath = "//div[contains(text(),' Success: Your account has been successfully updated.')]")
	private WebElement SuccessText;
	@FindBy(xpath = "//a[contains(text(),'Edit Account')]")
	private WebElement EditAccount;
	@FindBy(xpath = "//input[@id='input-firstname']")
	private WebElement inputFirstname;
	@FindBy(xpath = "//input[@id='input-lastname']")
	private WebElement inputLastname;
	@FindBy(xpath = "//input[@id='input-email']")
	private WebElement inputEmail;
	@FindBy(xpath = "//input[@id='input-telephone']")
	private WebElement inputTelephone;
	@FindBy(xpath = "//input[@value='Continue']")
	private WebElement EditeContinueButton;
	/*
	 * -------------------------------****************************------------------------------
	 */
	public void myacount() {
		myacount.click();
	}
	public void loginmyaccout() {
		loginmyaccout.click();
	}
	public void usernameoremail(String username) {
		usernameoremail.sendKeys(username);
	}
	public void password(String Password) {
		password.sendKeys(Password);
	}
	public void loginbutton() {
		loginbutton.click();
	}
	public boolean verifingTextofaccount() {
		if(verifingTextofaccount.isDisplayed()) {
			logger.info("Text is present: "+verifingTextofaccount.getText());
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].style.background='yellow'",verifingTextofaccount);
			return true;
		}else {
			return false;
		}
	}
	public void Registerforanaffiliateaccount() {
		Registerforanaffiliateaccount.click();
	}
	public void cleareCompany() {
		company.clear();
	}
	public void company(String Company) {
		company.sendKeys(Company);
	}
	public void clearwesite() {
		website.clear();
	}
	public void website(String Website) {
		website.sendKeys(Website);
	}
	public void clearTaxID() {
		TaxID.clear();
	}
	public void TaxID(String tax) {
		TaxID.sendKeys(tax);
	}
	public void clearchequ() {
		chequeRadio.clear();
	}
	public void clickChequeRadio() {
		chequeRadio.click();
	}
	public boolean chequeRadio() {
		return chequeRadio.isSelected();
	}
	public void chequebox(String Chequebox) {
		chequebox.sendKeys(Chequebox);
	}
	public void radioBank() {
		radioBank.click();
		
	}
	public void bankname(String BankName) {
		bankname.sendKeys(BankName);
	}
	public void branchNO(String BanakNo) {
		bankbranchnumber.sendKeys(BanakNo);
	}
	public void bankswiftcode(String bankcode) {
		bankswiftcode.sendKeys(bankcode);
	}
	public void bankAccountName(String accountName) {
		bankAccountName.sendKeys(accountName);
	}
	public void bankAccountNumber(String AcountNumber) {
		bankAccountNumber.sendKeys(AcountNumber);
	}
	public void checkbox() {
		checkbox.click();
	}
	public void Continue() {
		Continue.click();
	}
	public boolean SuccessText() {
		if(SuccessText.isDisplayed()) {
			logger.info("Text is present: "+SuccessText.getText());
			JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("arguments[0].style.background='yellow'", SuccessText);
			return true;
		}else {
			return false;
		}
	}
	public void EditAccountInformation() {
		EditAccount.click();
	}
	public void inputFirstname(String Fname) {
		inputFirstname.sendKeys(Fname);
	}
	public void inputLastname(String Lname) {
		inputLastname.sendKeys(Lname);
	}
	public void inputEmailclear() {
		inputEmail.clear();
	}
	public void inputEmail(String email) {
		inputEmail.sendKeys(email);
	}
	public void inputTelephoneClear() {
		inputTelephone.clear();
	}
	public void inputTelephone(String phone) {
		inputTelephone.sendKeys(phone);
	}
	public void EditeContinueButton() {
		EditeContinueButton.click();
	}
}
