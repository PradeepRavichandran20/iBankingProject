package org.iBankingProject.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginpage {

	WebDriver ldriver;

	// Calling Constructor
	public loginpage(WebDriver rdriver) {

		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(name = "uid")
	@CacheLookup
	WebElement txtusername;

	@FindBy(name = "password")
	@CacheLookup
	WebElement txtpassword;

	@FindBy(name = "btnLogin")
	@CacheLookup
	WebElement login;

	@FindBy(xpath = "//a[contains(text(),'Log out')]")
	@CacheLookup
	WebElement logout;

	public void setusername(String uname) {

		txtusername.sendKeys(uname);
	}

	public void setpassword(String pwd) {

		txtpassword.sendKeys(pwd);
	}

	public void submit() {

		login.click();
	}

	public void logout() {

		logout.click();
	}
}
