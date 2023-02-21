package com.Practice_Automation.POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class POM_Login_HRM {
	
	@FindBy(xpath="//input[@id='txtUsername']")
	private WebElement txt_uName;
	
	@FindBy(xpath="//input[@id='txtPassword']")
	private WebElement txt_uPass;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement btn_Login;
	
	@FindBy(xpath="//li[@id='navbar-logout']/descendant::span")
	private WebElement btn_LogOut;
	

	public WebElement getBtn_LogOut() {
		return btn_LogOut;
	}

	public WebElement getTxt_uName() {
		return txt_uName;
	}

	public WebElement getTxt_uPass() {
		return txt_uPass;
	}

	public WebElement getBtn_Login() {
		return btn_Login;
	}
	
	
}
