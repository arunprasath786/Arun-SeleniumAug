package com.leafBot.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.leafBot.pages.LoginPage;
import com.leafBot.selenium.api.base.SeleniumBase;
import com.leafBot.testng.api.base.ProjectSpecificMethods;
public class TC002_CreateLead extends ProjectSpecificMethods{
	@BeforeTest
	public void setData() {
		excelFileName="CreateLead";
		testcaseName = "CreateLead";
		testcaseDec = "CreateLeadFunction";
		author = "Arun";
		category = "Smoke";
	}
	
	
	@Test(dataProvider="fetchData")
	public void runTC002(String compname,String firstname,String lastname,String mobileno) {
		
		new LoginPage()
		.enterUsername("DemoSalesManager")
		.enterPassword("crmsfa")
		.clickLogin()
		.clickcrmsfa()
		.clickLeads()
		.ClickCreateLead()
		.entercompname(compname)
		.enterfirstname(firstname)
		.enterlastname(lastname)
		.entermobileno(mobileno)
		.clickcreateleadsubmit();
		
	}

}
