package com.Bectron.Flixpert.pomRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlixpertLoginPage {
WebDriver driver;
public FlixpertLoginPage(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
	@FindBy(id="username")
	private WebElement Untbx;
	public WebDriver getDriver() {
		return driver;
	}
	public WebElement getUntbx() {
		return Untbx;
	}
	public WebElement getContinueButton() {
		return ContinueButton;
	}
	public WebElement getPwtbx() {
		return pwtbx;
	}
	public WebElement getLgbtn() {
		return lgbtn;
	}
	@FindBy(id="login-submit")
	private WebElement ContinueButton;
	@FindBy(id="password")
	private WebElement pwtbx;
	@FindBy(id="login-submit")
	private WebElement lgbtn;
	
}

