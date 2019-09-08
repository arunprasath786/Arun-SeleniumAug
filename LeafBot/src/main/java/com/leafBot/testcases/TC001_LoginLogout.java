package com.leafBot.testcases;




import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.leafBot.selenium.api.base.SeleniumBase;

public class TC001_LoginLogout extends SeleniumBase{
	
	@BeforeTest
	
	public void setData() {
		excelFileName="TC001";
		testcaseName = "Login";
		testcaseDec = "LoginFunction";
		author = "Arun";
		category = "Smoke";
	}
	
	
	@Test(dataProvider="fetchData")
	public void runTC001(String username,String password) {
		
	}

}







