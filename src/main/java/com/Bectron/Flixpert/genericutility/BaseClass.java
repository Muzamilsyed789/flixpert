package com.Bectron.Flixpert.genericutility;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


public class BaseClass {
	public static  WebDriver driver;
	public static WebDriverUtility webdriverutils=new WebDriverUtility();
	public static FileUtility fileutils=new FileUtility();
	@BeforeMethod
public void preCondition() throws IOException {
		String browser=fileutils.readTheDataFromPropertyFile("browser");
	if(browser.equals("chrome")) {
		driver=new ChromeDriver();
	}else if(browser.equals("firefox")){
			driver=new FirefoxDriver();
	}else if(browser.equals("edge")) {
		driver=new EdgeDriver();
	}
	driver.manage().window().maximize();
	webdriverutils.implicitWait(driver);
	driver.get(fileutils.readTheDataFromPropertyFile("url"));
}
	@AfterMethod
	public void postCondition() {
		
		
		
		driver.manage().window().minimize();
		driver.quit();
		
		
		
		
	}
}

