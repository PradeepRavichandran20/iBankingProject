package org.iBankingProject.testcases;

import java.io.IOException;

import org.iBankingProject.pageobjects.loginpage;
import org.testng.annotations.Test;
import org.testng.Assert;

public class Tc_logintest_001 extends baseclass {
	
	@Test
	public void logintest() throws IOException {
		
		//ObjectCreation
		loginpage lp = new loginpage(driver);
		lp.setusername(username);
		logger.info("Entered Username");
		lp.setpassword(password);
		logger.info("Entered password");
		lp.submit();
	    System.out.println("Page title is : " + driver.getTitle());
		
		if(driver.getTitle().equals("Guru99 Bank Manager HomePage456")) 
		{
			Assert.assertTrue(true);
			logger.info("Title is valid");
		}
		else
		{
			captureScreen(driver, "tname");
		    Assert.assertTrue(false);
		    logger.info("Title is invalid");
		}
			
	}

}
