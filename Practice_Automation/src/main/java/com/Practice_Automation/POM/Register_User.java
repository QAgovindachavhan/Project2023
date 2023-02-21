package com.Practice_Automation.POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Register_User {
	
	@FindBy(xpath="//i[@class='fa fa-home']/parent::a")
	private WebElement home;
	
	@FindBy(xpath="//i[@class='fa fa-lock']")
	private WebElement btn_signIn;
	
	
	@FindBy(xpath="//input[@name='name']")
	private WebElement txt_userName;
	
	@FindBy(xpath="//input[@name='name']/following-sibling::input[@name='email']")
	private WebElement txt_Email;
	
	@FindBy(xpath="//button[text()='Signup']")
	private WebElement btn_SignUp;
	
	
	@FindBy(xpath="//b[text()='Enter Account Information']")
	private WebElement verify_Acc_info;
	
	@FindBy(xpath="//input[@value=\"Govinda Chavhan\"]")
	private WebElement verify_NameField;
	
	public WebElement getVerify_NameField() {
		return verify_NameField;
	}

	public WebElement getVerify_EmailField() {
		return verify_EmailField;
	}

	public void setBtn_signIn(WebElement btn_signIn) {
		this.btn_signIn = btn_signIn;
	}

	public void setVerify_NameField(WebElement verify_NameField) {
		this.verify_NameField = verify_NameField;
	}

	public void setVerify_EmailField(WebElement verify_EmailField) {
		this.verify_EmailField = verify_EmailField;
	}

	@FindBy(xpath="//input[@value=\"govindachavhan1506@gmail.com\" and @name='email']")
	private WebElement verify_EmailField;
	
	
	
	@FindBy(xpath="//label[@for=\"id_gender1\"]/parent::div")
	private WebElement radio_Gender;
	
	@FindBy(xpath="//input[@id='password']")
	private WebElement txt_pass;

	
	@FindBy(xpath="//select[@id='days']")
	private WebElement select_Day;
	
	@FindBy(xpath="//select[@id='months']")
	private WebElement select_Months;
	
	@FindBy(xpath="//select[@id='years']")
	private WebElement select_Year;
	
	
	@FindBy(xpath="//input[@name='newsletter']")
	private WebElement checbox_First;
	
	@FindBy(xpath="//input[@id='optin']")
	private WebElement checbox_Second;
	
	
	@FindBy(xpath="//input[@id='first_name']")
	private WebElement txt_Fname;
	
	@FindBy(xpath="//input[@id='last_name']")
	private WebElement txt_Lname;
	
	@FindBy(xpath="//input[@id='company']")
	private WebElement txt_Company;
	
	@FindBy(xpath="//input[@id='address1']")
	private WebElement txt_Address ;
	
	@FindBy(xpath="//select[@id='country']")
	private WebElement select_Country;
	
	@FindBy(xpath="//input[@id='state']")
	private WebElement txt_state ;
	
	@FindBy(xpath="//input[@id='city']")
	private WebElement txt_City;
	
	@FindBy(xpath="//input[@id='zipcode']")
	private WebElement txt_Zip;
	
	@FindBy(xpath="//input[@id='mobile_number']")
	private WebElement txt_Mob;
	
	@FindBy(xpath="//button[text()='Create Account']")
	private WebElement btn_Create;
	
	@FindBy(xpath="//b[text()='Account Created!']")
	private WebElement verify_Txt_Account_Created;
	
	
	@FindBy(xpath="//a[text()='Continue']")
	private WebElement btn_Continue;
	
	@FindBy(xpath="//a[@href='/delete_account']")
	private WebElement link_delete_acc;
	
	@FindBy(xpath="//b[text()='Account Deleted!']")
	private WebElement verify_delete_acc;
	
	
	

	public WebElement getLink_delete_acc() {
		return link_delete_acc;
	}

	public WebElement getVerify_delete_acc() {
		return verify_delete_acc;
	}

	public WebElement getBtn_Continue() {
		return btn_Continue;
	}

	public WebElement getVerify_Txt_Account_Created() {
		return verify_Txt_Account_Created;
	}

	

	public WebElement getHome() {
		return home;
	}

	public WebElement getBtn_signIn() {
		return btn_signIn;
	}

	public WebElement getTxt_userName() {
		return txt_userName;
	}

	public WebElement getTxt_Email() {
		return txt_Email;
	}

	public WebElement getBtn_SignUp() {
		return btn_SignUp;
	}

	public WebElement getVerify_Acc_info() {
		return verify_Acc_info;
	}

	public WebElement getRadio_Gender() {
		return radio_Gender;
	}

	public WebElement getTxt_pass() {
		return txt_pass;
	}

	public WebElement getSelect_Day() {
		return select_Day;
	}

	public WebElement getSelect_Months() {
		return select_Months;
	}

	public WebElement getSelect_Year() {
		return select_Year;
	}

	public WebElement getChecbox_First() {
		return checbox_First;
	}

	public WebElement getChecbox_Second() {
		return checbox_Second;
	}

	public WebElement getTxt_Fname() {
		return txt_Fname;
	}

	public WebElement getTxt_Lname() {
		return txt_Lname;
	}

	public WebElement getTxt_Company() {
		return txt_Company;
	}

	public WebElement getTxt_Address() {
		return txt_Address;
	}

	public WebElement getSelect_Country() {
		return select_Country;
	}

	public WebElement getTxt_state() {
		return txt_state;
	}

	public WebElement getTxt_City() {
		return txt_City;
	}

	public WebElement getTxt_Zip() {
		return txt_Zip;
	}

	public WebElement getTxt_Mob() {
		return txt_Mob;
	}

	public WebElement getBtn_Create() {
		return btn_Create;
	}

	public void setHome(WebElement home) {
		this.home = home;
	}

	
	public void setTxt_userName(WebElement txt_userName) {
		this.txt_userName = txt_userName;
	}

	public void setTxt_Email(WebElement txt_Email) {
		this.txt_Email = txt_Email;
	}

	public void setBtn_SignUp(WebElement btn_SignUp) {
		this.btn_SignUp = btn_SignUp;
	}

	public void setVerify_Acc_info(WebElement verify_Acc_info) {
		this.verify_Acc_info = verify_Acc_info;
	}

	public void setRadio_Gender(WebElement radio_Gender) {
		this.radio_Gender = radio_Gender;
	}

	public void setTxt_pass(WebElement txt_pass) {
		this.txt_pass = txt_pass;
	}

	public void setSelect_Day(WebElement select_Day) {
		this.select_Day = select_Day;
	}

	public void setSelect_Months(WebElement select_Months) {
		this.select_Months = select_Months;
	}

	public void setSelect_Year(WebElement select_Year) {
		this.select_Year = select_Year;
	}

	public void setChecbox_First(WebElement checbox_First) {
		this.checbox_First = checbox_First;
	}

	public void setChecbox_Second(WebElement checbox_Second) {
		this.checbox_Second = checbox_Second;
	}

	public void setTxt_Fname(WebElement txt_Fname) {
		this.txt_Fname = txt_Fname;
	}

	public void setTxt_Lname(WebElement txt_Lname) {
		this.txt_Lname = txt_Lname;
	}

	public void setTxt_Company(WebElement txt_Company) {
		this.txt_Company = txt_Company;
	}

	public void setTxt_Address(WebElement txt_Address) {
		this.txt_Address = txt_Address;
	}

	public void setSelect_Country(WebElement select_Country) {
		this.select_Country = select_Country;
	}

	public void setTxt_state(WebElement txt_state) {
		this.txt_state = txt_state;
	}

	public void setTxt_City(WebElement txt_City) {
		this.txt_City = txt_City;
	}

	public void setTxt_Zip(WebElement txt_Zip) {
		this.txt_Zip = txt_Zip;
	}

	public void setTxt_Mob(WebElement txt_Mob) {
		this.txt_Mob = txt_Mob;
	}

	public void setBtn_Create(WebElement btn_Create) {
		this.btn_Create = btn_Create;
	}
	
}
