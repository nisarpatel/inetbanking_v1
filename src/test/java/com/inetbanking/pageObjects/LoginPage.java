package com.inetbanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {// page object class
	WebDriver ldriver;

	public LoginPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(xpath = "//*[@id=\"usernameField\"]")
	@CacheLookup
	WebElement txtUserName;

	@FindBy(xpath = "//*[@id=\"passwordField\"]")
	@CacheLookup
	WebElement txtPassword;

	@FindBy(xpath = "/html/body/div[2]/div/div/div/div/div/div/div[2]/div/form/div[3]/div[3]/div/button[1]")
	@CacheLookup
	WebElement btnLogin;
	
	@FindBy(xpath = "/html/body/div[1]/div/div/ul[2]/li[2]/div/ul[2]/li[5]/a")
	@CacheLookup
	WebElement lnkLogout  ;

	public void setUserName(String uname) {
		txtUserName.sendKeys(uname);
	}

	public void setPassword(String pwd) {
		txtPassword.sendKeys(pwd);
	}

	public void clickSubmit() {
		btnLogin.click();
	}
	
	public void clickLogout() {
		lnkLogout.click();
	} 

}
