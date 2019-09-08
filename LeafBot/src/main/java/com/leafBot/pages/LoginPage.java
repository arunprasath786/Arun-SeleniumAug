package com.leafBot.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.leafBot.selenium.api.base.SeleniumBase;

public class LoginPage extends SeleniumBase {
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	@CacheLookup
	@FindBy(id="username") WebElement eleusername;
	@CacheLookup
	@FindBy(id="password") WebElement elepassword;
	@FindBy(className = "decorativeSubmit") WebElement elelogin;
	
	public LoginPage enterUsername(String username) {
		clearAndType(eleusername,username);
		return this;
	}

	public LoginPage enterPassword(String password) {
		clearAndType(elepassword,password);
		return this;
	}

	public HomePage clickLogin() {
		click(elelogin);
		return new HomePage();
	}

}










