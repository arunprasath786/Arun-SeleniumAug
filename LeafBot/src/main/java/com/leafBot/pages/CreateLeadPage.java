package com.leafBot.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.leafBot.selenium.api.base.SeleniumBase;

public class CreateLeadPage extends SeleniumBase{
	public CreateLeadPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id = "createLeadForm_companyName") WebElement elecompName;
	@FindBy(id = "createLeadForm_firstName") WebElement eleFirstName;
	@FindBy(id = "createLeadForm_lastName") WebElement eleLasttName;
	@FindBy(id = "createLeadForm_primaryPhoneNumber") WebElement eleMobNo;
	@FindBy(name = "submitButton") WebElement submit;
public CreateLeadPage entercompname(String compname) {
	clearAndType(elecompName, compname);
	return this;
}
public CreateLeadPage enterfirstname(String firstname) {
	clearAndType(eleFirstName, firstname);
	return this;
}
public CreateLeadPage enterlastname(String lastname) {
	clearAndType(eleLasttName, lastname);
	return this;
}
public CreateLeadPage entermobileno(String mobileno) {
	clearAndType(eleMobNo, mobileno);
	return this;
}
public ViewLeadPage clickcreateleadsubmit() {
	click(submit);
	return new ViewLeadPage();
}
}
