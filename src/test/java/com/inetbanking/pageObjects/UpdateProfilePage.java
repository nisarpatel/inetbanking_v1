package com.inetbanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UpdateProfilePage {
	WebDriver ldriver;
	public UpdateProfilePage(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);	
	}
	
	@FindBy(xpath = "//*[@id=\"root\"]/div/div/span/div/div/div/div[2]/div/div[2]/div[1]/div/div[1]/div[2]/div")
	@CacheLookup
	WebElement btnUpdate;
	
	@FindBy(xpath = "//*[@id=\"root\"]/div/div/span/div/div/div/div/div/div[2]/div[2]/div/div/ul/li[6]")
	@CacheLookup
	WebElement lnkITskill;
	
	@FindBy(linkText = "ADD DETAILS")
	@CacheLookup
	WebElement clkAddITskill;
	
	@FindBy(xpath = "//*[@id=\"itSkillSugg\"]")
	@CacheLookup
	WebElement txtSkill;
	
	@FindBy(xpath = "//*[@id=\"version\"]")
	@CacheLookup
	WebElement txtVersion;
	
	@FindBy(xpath = "//*[@id=\"lastUsedDroopeFor\"]")
	@CacheLookup
	WebElement listLastUse;

	@FindBy(xpath = "//*[@id=\"expYearDroopeFor\"]")
	@CacheLookup
	WebElement listExpYear;
	
	@FindBy(xpath = "//*[@id=\"expMonthDroopeFor\"]")
	@CacheLookup
	WebElement listExpMonth;
	
	@FindBy(xpath = "//*[@id=\"saveITSkills\"]")
	@CacheLookup
	WebElement btnSaveITSkill;
	
	public void update(){
		btnUpdate.click();
	}
	public void lnkITskill(){
		lnkITskill.click();
	}
	
	public void addITskills(){
		clkAddITskill.click();
	}
	
	public void addSkills(String skill) {
		txtSkill.sendKeys(skill);
	}
	
	public void version(int vr) {
		txtSkill.sendKeys(String.valueOf(vr));
	}
	
	public void lastUse(int yyyy) {
		txtSkill.sendKeys(String.valueOf(yyyy));
	}
	
	public void expYear(int year) {
		txtSkill.sendKeys(String.valueOf(year));
	}
	
	public void expMonth(int month) {
		txtSkill.sendKeys(String.valueOf(month));
	}
	
	public void save(){
		btnSaveITSkill.click();
	}
}