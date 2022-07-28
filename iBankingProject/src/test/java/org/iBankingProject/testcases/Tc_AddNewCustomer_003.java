package org.iBankingProject.testcases;

import java.io.IOException;

import org.iBankingProject.pageobjects.AddCustomerPage;
import org.iBankingProject.pageobjects.loginpage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Tc_AddNewCustomer_003 extends baseclass {

	
	@Test
	public void addnewcustomer() throws InterruptedException, IOException {

		loginpage lp = new loginpage(driver);
		lp.setusername(username);
		logger.info("Entered username");
		lp.setpassword(password);
		logger.info("Entered password");
		lp.submit();

		Thread.sleep(2000);

		AddCustomerPage anc = new AddCustomerPage(driver);
		
		anc.clickNewCustomer();

		logger.info("Provide Customer Details");

		anc.enterCustname("Pradeep");
		Thread.sleep(2000);
		anc.selGender("male");
		Thread.sleep(5000);
		anc.custdob("10","05","2014");
		Thread.sleep(8000);
		anc.cusaddr("Devaki Nagar");
		Thread.sleep(2000);	
		anc.entcity("Lawspet");
		Thread.sleep(2000);
		anc.entstate("Puducherry");
		Thread.sleep(2000);
		anc.entpinno("605008");
		Thread.sleep(2000);
		anc.enttelno("8870768638");
		Thread.sleep(2000);	

		String email = randomestring()+ "@gmail.com";
		anc.entmailid(email);
		anc.entpwd("pointb");
		anc.clicksubmit();

		Thread.sleep(3000);
		
		logger.info("validation started....");

		boolean res = driver.getPageSource().contains("Customer Registered Sucessfully!!!");

		if (res == true) {
			Assert.assertTrue(true);
			logger.info("test case passed");
		} else {
			logger.info("test case failed");
			captureScreen(driver, "addnewcustomer");
			Assert.assertTrue(false);
		}
	}

}
