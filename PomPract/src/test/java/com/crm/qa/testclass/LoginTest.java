package com.crm.qa.testclass;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.crm.qa.base.BaseClass;
import com.crm.qa.pages.LoginPage;


public class LoginTest extends BaseClass {
	
	private static Logger logger=LogManager.getLogger(LoginTest.class);


	public LoginTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Test (priority=1)
	public void RefreshPage() throws IOException {
		
		Reporter.log("Refresh Start");
		LoginPage lp=new LoginPage(driver);
		logger.debug("Refresh start");
		
		Reporter.log("Refresh End");
		logger.debug("Refresh End");
		
	}
	
	@Test (priority=2)
	public void  login () throws IOException, InterruptedException {
		
		
		LoginPage lp1=new LoginPage(driver);
		
        lp1.navToPage();
		logger.debug("Method call");

        
        Thread.sleep(4000);
	
		Reporter.log("Enter Cred");
		lp1.enterCred();
		logger.debug("Enter cred");

		
		Thread.sleep(4000);
		Reporter.log("Submit");
		lp1.submit();
		logger.debug("sumbit");

		
	} 
	
	
	
	
}
