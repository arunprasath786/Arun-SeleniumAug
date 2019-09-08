package com.leafBot.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.leafBot.selenium.api.base.SeleniumBase;

public class HomePage extends SeleniumBase {
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(className = "decorativeSubmit") WebElement elelogout;
	@FindBy(linkText = "CRM/SFA") WebElement crmsfaClick;
public LoginPage clickLogout() {
	click(elelogout);
	return new LoginPage();
}
	public MyHome clickcrmsfa() {
		click(crmsfaClick);
		return new MyHome();
	}
}












