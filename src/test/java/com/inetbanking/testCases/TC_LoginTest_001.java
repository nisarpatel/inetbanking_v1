package com.inetbanking.testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetbanking.pageObjects.LoginPage;

public class TC_LoginTest_001 extends BaseClass {
	@Test
	public void loginTest() throws Exception {
		
		driver.get(baseURL);
		logger.info("URL is opened");

		LoginPage lp = new LoginPage(driver);

		lp.setUserName(username);
		logger.info("User name is enterd");

		lp.setPassword(password);
		logger.info("User password is enterd");

		lp.clickSubmit();

		System.out.println(driver.getTitle());
		if (driver.getTitle().equals("Jobseeker's Login: Search the Best Jobs available in India & Abroad - Naukri.com")) {
			Assert.assertTrue(true);
			logger.info("Login test pass");
		} else {
			captureScreen(driver,"loginTest");
			Assert.assertTrue(false);
			logger.info("Login in test fail");
		}

	}
}
