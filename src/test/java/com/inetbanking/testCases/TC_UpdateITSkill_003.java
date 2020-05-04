package com.inetbanking.testCases;

import org.testng.annotations.Test;

import com.inetbanking.pageObjects.LoginPage;
import com.inetbanking.pageObjects.UpdateProfilePage;

public class TC_UpdateITSkill_003 extends BaseClass{
	@Test
	public void addITSkill() throws Exception{
		
		LoginPage lp=new LoginPage(driver);
		lp.setUserName(username);
		logger.info("user name provided");
		
		lp.setPassword(password);
		logger.info("password is enterd");
		
		lp.clickSubmit();
		logger.info("login succefully");
		Thread.sleep(3000);
		
		
		UpdateProfilePage additskills=new UpdateProfilePage(driver);
		additskills.update();
		additskills.lnkITskill(); 
		logger.info("clicked on it skill");
		Thread.sleep(10000);
		additskills.addITskills();
		logger.info("clicked on add detail");
		
		String windowHandler=driver.getWindowHandle();
		driver.switchTo().window(windowHandler);
		
		additskills.addSkills("selenium");
		logger.info("skill enterd");
		additskills.version(3);
		logger.info("version enterd");
		additskills.lastUse(2020);
		logger.info("last used");
		additskills.expYear(2);
		logger.info("year of exp");
		additskills.expMonth(0);
		logger.info("month of exp");
		Thread.sleep(5000);
		additskills.save();
		logger.info("saved succesfully");
	}
}
 