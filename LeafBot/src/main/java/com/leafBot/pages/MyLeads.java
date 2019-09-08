package com.leafBot.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.leafBot.selenium.api.base.SeleniumBase;

public class MyLeads extends SeleniumBase{
	public MyLeads() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(linkText = "Create Lead") WebElement CreateLaed;
	public CreateLeadPage ClickCreateLead() {
		click(CreateLaed);
		return new CreateLeadPage();
	}

}
