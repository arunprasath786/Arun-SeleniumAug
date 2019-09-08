package com.leafBot.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.leafBot.selenium.api.base.SeleniumBase;

public class ViewLeadPage extends SeleniumBase{
	public ViewLeadPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//a[text() = 'Delete']") WebElement Delete;
	public MyLeads ClickDelete() {
		click(Delete);
		return new MyLeads();
	}
	

}
