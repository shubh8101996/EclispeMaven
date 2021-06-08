package com.crm.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.crm.qa.base.BaseClass;

public class LogOut extends BaseClass {
	
	WebDriver driver;
	
	@FindBy (xpath="//div[@class='ui basic button floating item dropdown']")
	private WebElement dropdown;
	
	

	public LogOut(WebDriver driver) throws IOException {
		super();
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	public void LogOutClick() throws InterruptedException {
		
		driver.get("https://ui.cogmento.com/");
		Select sc=new Select(dropdown);
		sc.selectByIndex(4);
		Thread.sleep(2000);
	}

}
