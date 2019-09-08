package com.leafBot.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.leafBot.selenium.api.base.SeleniumBase;

public class MyHome extends SeleniumBase{
	public MyHome() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(linkText = "Leads") WebElement LeadsClick;
	public MyLeads clickLeads() {
		click(LeadsClick);
		return new MyLeads();
	}

}
