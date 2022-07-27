package org.iBankingProject.testcases;

import java.io.IOException;

import org.iBankingProject.pageobjects.loginpage;
import org.iBankingProject.utilities.XLUtils;
import org.junit.Assert;
import org.openqa.selenium.NoAlertPresentException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Tc_LoginDDT_002 extends baseclass {
	
	
	@Test(dataProvider = "LoginData")
	public void loginDDT(String user, String pwd) throws InterruptedException {
		
		loginpage lp = new loginpage(driver);
		lp.setusername(user);
		logger.info("Username provided");
		lp.setpassword(pwd);
		logger.info("password provided");
		lp.submit();	
		
		Thread.sleep(3000);
		
		if(isAlertPresent()==true) {
			driver.switchTo().alert().accept(); //CLose alert
			driver.switchTo().defaultContent();
			Assert.assertTrue(false);
			logger.warn("Login Failed");
		}
		else {
			Assert.assertTrue(true);
			logger.info("Login passed");
			lp.logout();
			Thread.sleep(3000);
			driver.switchTo().alert().accept(); //CLose logout alert
			driver.switchTo().defaultContent();
		}
	}
	
	
	public boolean isAlertPresent(){  //User defined method to check alert is present or not
		
		try {
			driver.switchTo().alert();
			return true;
		}
		catch(NoAlertPresentException e) {
			return false;
		}
		
	}
	
	@DataProvider(name="LoginData")
	String [][] getdata() throws IOException{
		
		String path = System.getProperty("user.dir")+ "/src/test/java/org/iBankingProject/testdata/LoginData.xlsx"; 
		
		int rownum = XLUtils.getRowCount(path, "sheet1");
		int colcount = XLUtils.getCellCount(path, "sheet1", 1);	
		
		//Calling in 2 dimensional array
		String logindata[][] = new String[rownum][colcount];
		
		for (int i=1;i<=rownum;i++) {
			
			for (int j=0;j<colcount;j++) {
				
				logindata[i-1][j] = XLUtils.getCellData(path, "sheet1", i, j); //1, 0
			}
		}
		return logindata;
		
	}

}
