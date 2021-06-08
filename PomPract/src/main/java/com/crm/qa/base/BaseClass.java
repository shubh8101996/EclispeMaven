package com.crm.qa.base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public  class  BaseClass {

	
	public static  WebDriver driver;

	 public Properties prop;
	 FileInputStream file;
//	 String path = System.getProperty("user.dir")+"/src/main/resources/config.properties";
	String path="C:/Users/LENOVO/eclipse-workspace/PomPract/src/main/resources/config.properties";
	public BaseClass() throws IOException
	{
		prop = new Properties();          //Using this file we read config file
		file = new FileInputStream(path);
		prop.load(file);
		
		
	}
	
	
	@BeforeSuite
	public void initalization() {
		
		WebDriverManager.chromedriver().setup();
		
		driver=new ChromeDriver();
		
	    driver.manage().window().maximize();
	    
	    driver.get("https://freecrm.com/");
		
	}

	@AfterSuite
	public void closing() {
		
//		driver.close();
	
}
}
