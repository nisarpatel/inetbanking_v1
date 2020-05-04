package com.inetbanking.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.inetbanking.pageObjects.LoginPage;
import com.inetbanking.utilities.XLUtils;

public class TC_LoginDDT_002 extends BaseClass {
	@Test(dataProvider="LoginData")
	public void loginDDT(String user,String pwd) throws Exception {
		LoginPage lp=new LoginPage(driver);
		lp.setUserName(user);
		logger.info("user name provided");
		
		lp.setPassword(pwd);
		logger.info("password is enterd");
		
		lp.clickSubmit();
		Thread.sleep(3000);
		
		if (driver.getTitle()
				.equals("Jobseeker's Login: Search the Best Jobs available in India & Abroad - Naukri.com")) {
			Assert.assertTrue(true);
			logger.info("Login test pass");
		} else if(driver.getPageSource().contains("Invalid details. Please check the Email ID - Password combination.")) {
			captureScreen(driver,"loginTest");
			Assert.assertTrue(false);
			logger.info("Login in test fail");
			driver.switchTo().defaultContent();
			
		}
		/*
		if (isAlertPresent()==true ) {
			driver.switchTo().alert().accept();
			driver.switchTo().defaultContent();
			Assert.assertTrue(false);
			logger.warn("login failed");
		}else {
			Assert.assertTrue(true);
			logger.warn("login passed");
			Thread.sleep(20000);
			lp.clickLogout();
			logger.info("logout successful");
			driver.switchTo().alert().accept();//close logout alert
			driver.switchTo().defaultContent();
		}*/
		
		
	}
	

	@DataProvider(name = "LoginData")
	String[][] getdata() throws IOException {
		String path = System.getProperty("user.dir") + "/src/test/java/com/inetbanking/testData/LoginData.xlsx";
		int rowcount = XLUtils.getRowCount(path, "sheet1");
		int colcount = XLUtils.getCellCount(path, "sheet1", 1);
		String logindata[][] = new String[rowcount][colcount];
		for (int i = 1; i <= rowcount; i++) {
			for (int j = 0; j < colcount; j++) {
				logindata[i - 1][j] = XLUtils.getCellData(path, "sheet1", i, j);
			}
		}
		return logindata;
	}
}
