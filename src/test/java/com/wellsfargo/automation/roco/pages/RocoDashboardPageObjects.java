package com.wellsfargo.automation.roco.pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RocoDashboardPageObjects {

	@FindBy(locator ="xpath=//input[@name='USERID']")
	private WebElement txtbox_username;
	public WebElement getUsernameTextBox() {
		return txtbox_username;
	}
	@FindBy (locator ="xpath=//input[@name=' PASSWORD' ]")
	private WebElement txtbox_password;
	public WebElement getPasswordTextBox() {
		return txtbox_password;
	}
	@FindBy(locator ="xpath=//input[Qid='submitButton']")
	private WebElement btn_signon;
	public WebElement getSignOnButton() {
		return btn_signon;
	}
	@FindBy (locator ="xpath=//a[Qid='10gOut]")
	private WebElement btn_signout;
	public WebElement getSignOutButton() {
		return btn_signout;
	}
	@FindBy (locator ="xpath=//h2[text ()= 'Successfully signed off']")
	private WebElement label_SuccessfullySignedOff;
	public WebElement getSuccessfullySignedOffLabel() {
		return label_SuccessfullySignedOff;
	}
	@FindBy (locator = "xpath=//div[@id='content']/div/h2")
	private WebElement label_WelcomeSignOnToViewYourAccounts;
	public WebElement getWelcomeSignOnToViewYourAccounts(){
		return label_WelcomeSignOnToViewYourAccounts;
	}
	@FindBy (locator = "xpath=//*[@id='tblORSQueue']/tbody")
	private WebElement tableBody_PendingRecords;
	public WebElement getPendingRecordsTableBody () {
		return tableBody_PendingRecords;
	}

}
