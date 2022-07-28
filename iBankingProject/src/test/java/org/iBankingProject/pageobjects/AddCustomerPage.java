package org.iBankingProject.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class AddCustomerPage {
	
	WebDriver ldriver;
	
	public AddCustomerPage (WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
		
	}
	
	@FindBy(how = How.XPATH, using = "/html/body/div[3]/div/ul/li[2]/a")
	@CacheLookup
	WebElement clkNewCustomer;
	
	@FindBy(how = How.NAME, using = "name")
	@CacheLookup
	WebElement custname;
	
	@FindBy(how = How.NAME, using = "rad1")
	@CacheLookup
	WebElement selgender;
	
	@CacheLookup
	@FindBy(how = How.ID_OR_NAME, using = "dob")
	WebElement txtdob;
	
	@FindBy(how = How.NAME, using = "addr")
	@CacheLookup
	WebElement entaddr;
	
	@FindBy(how = How.NAME, using = "city")
	@CacheLookup
	WebElement entcity;	
	
	@FindBy(how = How.NAME, using = "state")
	@CacheLookup
	WebElement entstate;
	
	@FindBy(how = How.NAME, using = "pinno")
	@CacheLookup
	WebElement entpinno;
	
	@FindBy(how = How.NAME, using = "telephoneno")
	@CacheLookup
	WebElement enttelephoneno;
	
	@FindBy(how = How.NAME, using = "emailid")
	@CacheLookup
	WebElement entemailid;
	
	@FindBy(how = How.NAME, using = "password")
	@CacheLookup
	WebElement entpassword;
	
	@FindBy(how = How.NAME, using = "sub")
	@CacheLookup
	WebElement clksub;
	
	public void clickNewCustomer() {
		clkNewCustomer.click();
	}
	
	public void enterCustname(String cname ) {
		custname.sendKeys(cname);;
	}
	
	public void selGender(String sgender) {
		selgender.click();
	}
	
	public void custdob(String dd,String mm,String yy) {
		txtdob.sendKeys(dd);
		txtdob.sendKeys(mm);
		txtdob.sendKeys(yy);
	}	
	
	public void cusaddr(String caddr) {
		entaddr.sendKeys(caddr);
	}
	
	public void entcity(String ccity) {
		entcity.sendKeys(ccity);
	}
	
	public void entstate(String cstate) {
		entstate.sendKeys(cstate);
	}
	
	public void entpinno(String cpinno) {
		entpinno.sendKeys(String.valueOf(cpinno));
	}
	
	public void enttelno(String ctelno) {
		enttelephoneno.sendKeys(ctelno);
	}
	
	public void entmailid(String cmail) {
		entemailid.sendKeys(cmail);
	}
	
	public void entpwd(String cpwd) {
		entpassword.sendKeys(cpwd);
	}
	
	public void clicksubmit() {
		clksub.click();
	}

}
