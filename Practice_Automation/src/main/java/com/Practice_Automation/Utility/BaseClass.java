package com.Practice_Automation.Utility;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass 
{
	public WebDriver driver;
	public static ConfigDataProvider config;
	@BeforeSuite
	public void configSet() throws IOException
	{
		 config= new ConfigDataProvider();
	}
	@BeforeMethod
	
	public void setUp()
	{
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.get(config.geturl());
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	}
	
	@AfterMethod(enabled=false)
	
 	public void tearDown()
 	{
	driver.close();
 	}
	

}
