package com.crm.qa.testclass;

import java.io.IOException;

import org.testng.annotations.Test;

import com.crm.qa.base.BaseClass;
import com.crm.qa.pages.LogOut;

public class LogOutTest  extends BaseClass {

	public LogOutTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
   @Test 
   public void LogOutFunc() throws IOException, InterruptedException {
	   
	   LogOut lt=new LogOut(driver);
	   System.out.println("this is logout test");
	   
	   lt.LogOutClick();
	   
	   
	   
	   
   }
	

}
