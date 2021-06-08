package com.crm.qa.testclass;

import java.io.IOException;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.crm.qa.base.BaseClass;
import com.crm.qa.pages.LoginPage;


public class LoginTest extends BaseClass {

	public LoginTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Test (priority=1)
	public void RefreshPage() throws IOException {
		
		Reporter.log("Refresh Start");
		LoginPage lp=new LoginPage(driver);
		
		Reporter.log("Refresh End");
		
	}
	
	@Test (priority=2)
	public void  login () throws IOException, InterruptedException {
		
		
		LoginPage lp1=new LoginPage(driver);
		
        lp1.navToPage();
        
        Thread.sleep(4000);
	
		Reporter.log("Enter Cred");
		lp1.enterCred();
		
		Thread.sleep(4000);
		Reporter.log("Submit");
		lp1.submit();
		
	} 
	
	
	
	
}
