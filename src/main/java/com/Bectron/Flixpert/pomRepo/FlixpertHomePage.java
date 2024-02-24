package com.Bectron.Flixpert.pomRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlixpertHomePage {
WebDriver driver;
public FlixpertHomePage(WebDriver driver) {
	this.driver =driver;
	PageFactory.initElements(driver, this);
}
	@FindBy(xpath="//div[contains(@class,'Buttonsstyles')]/a[text()='Log in']")
	private WebElement loginLink;
	public WebDriver getDriver() {
		return driver;
	}
	public WebElement getLoginLink() {
		return loginLink;
	}

}
