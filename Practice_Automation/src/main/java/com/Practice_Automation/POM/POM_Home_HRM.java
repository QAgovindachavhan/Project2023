package com.Practice_Automation.POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class POM_Home_HRM {
	@FindBy(xpath="//input[@id='txtUsername']")
	private WebElement txt_uName;
	
	@FindBy(xpath="//input[@id='txtPassword']")
	private WebElement txt_uPass;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement btn_Login;
	
	@FindBy(xpath="//a[@class='top-level-menu-item active']")
	private WebElement btn_EmployeeList;
	
	@FindBy(xpath="//i[text()='add']")
	private WebElement btn_addEmployee;
	
	@FindBy(xpath="//input[@id='first-name-box']")
	private WebElement txt_Fname;
	
	@FindBy(xpath="//input[@id='middle-name-box']")
	private WebElement txt_Mname ;
	
	@FindBy(xpath="//input[@id='last-name-box']")
	private WebElement txt_Lname ;
	
	@FindBy(xpath="//input[@id='employeeId']")
	private WebElement txt_EmpID ;
	
	@FindBy(xpath="//button[@class='btn date-picker-button']")
	private WebElement btn_DateLogo ;
	
	@FindBy(xpath="//div[@id='bs-select-41']")
	private WebElement btn_datePicker ;

	public WebElement getTxt_uName() {
		return txt_uName;
	}

	public WebElement getTxt_uPass() {
		return txt_uPass;
	}

	public WebElement getBtn_Login() {
		return btn_Login;
	}

	public WebElement getBtn_EmployeeList() {
		return btn_EmployeeList;
	}

	public WebElement getBtn_addEmployee() {
		return btn_addEmployee;
	}

	public WebElement getTxt_Fname() {
		return txt_Fname;
	}

	public WebElement getTxt_Mname() {
		return txt_Mname;
	}

	public WebElement getTxt_Lname() {
		return txt_Lname;
	}

	public WebElement getTxt_EmpID() {
		return txt_EmpID;
	}

	public WebElement getBtn_DateLogo() {
		return btn_DateLogo;
	}

	public WebElement getBtn_datePicker() {
		return  btn_datePicker ;
	}
	
	//@FindBy(xpath="")
	//private WebElement ;
	
	
	

}
