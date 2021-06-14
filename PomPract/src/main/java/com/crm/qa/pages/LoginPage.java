package com.crm.qa.pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.BaseClass;

public class LoginPage extends BaseClass {
	
	WebDriver driver;
	//First web Element
	@FindBy (xpath="//input[@placeholder='E-mail address']")
	private WebElement username;
	
	//Second web Element
	@FindBy (xpath="//input[@placeholder='Password']")
	private WebElement password;
	
	//css("#txtPassword")
	//Third web Element
	@FindBy (xpath="//div[@class='ui fluid large blue submit button']")
	private WebElement button;

	public LoginPage(WebDriver driver) throws IOException {
		super();
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
		//This is Object Repo
		//Page Factory Class
	}
	
public void navToPage() {
	
	WebElement we=driver.findElement(By.xpath("//a[@class='btn btn-primary btn-xs-2 btn-shadow btn-rect btn-icon btn-icon-left']"));
	
	we.click();	
		
	}
	
	public void enterCred() {
		
		username.sendKeys(prop.getProperty("uname"));
		password.sendKeys(prop.getProperty("pass"));
		
		
	}
	
	public void submit() {
		
		button.click();
	}

}
