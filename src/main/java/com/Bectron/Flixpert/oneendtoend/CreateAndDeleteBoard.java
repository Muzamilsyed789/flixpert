package com.Bectron.Flixpert.oneendtoend;

import org.testng.annotations.Test;

import java.io.IOException;

import org.testng.annotations.Test;

import com.Bectron.Flixpert.genericutility.BaseClass;
import com.Bectron.Flixpert.pomRepo.FlixpertHomePage;
import com.Bectron.Flixpert.pomRepo.FlixpertLoginPage;

public class CreateAndDeleteBoard extends BaseClass{

 @Test
 
public void checkWeatherTheEndUserIsAbleToCreateAndDelete() throws IOException {
FlixpertHomePage homepage=new FlixpertHomePage(driver);
FlixpertLoginPage loginpage=new FlixpertLoginPage(driver);
homepage.getLoginLink().click();
loginpage.getUntbx().sendKeys(fileutils.readTheDataFromPropertyFile("email"));
loginpage.getContinueButton().submit();
loginpage.getPwtbx().sendKeys(fileutils.readTheDataFromPropertyFile("password"));
loginpage.getLgbtn().submit();
}
}