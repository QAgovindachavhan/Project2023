package test_Cases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.Practice_Automation.POM.POM_Home_HRM;
import com.Practice_Automation.Utility.BaseClass;

public class CreateUser extends BaseClass {
	
	@Test
	public void create_User() throws InterruptedException
	{
		POM_Home_HRM phh= PageFactory.initElements(driver, POM_Home_HRM.class);
		
		phh.getTxt_uName().sendKeys(config.getUser());
		phh.getTxt_uPass().sendKeys(config.getPass());
		phh.getBtn_Login().click();
//		Thread.sleep(50000);
		phh.getBtn_EmployeeList().click();
		phh.getBtn_addEmployee().click();
		phh.getTxt_Fname().sendKeys("sachin");
		phh.getTxt_Mname().sendKeys("ramesh");
		phh.getTxt_Lname().sendKeys("tendulkar");
		phh.getTxt_EmpID().sendKeys("001");
		phh.getBtn_DateLogo().click();
	   
		
		
		
	}
	
	
	
	

}
