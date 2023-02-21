package test_Cases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.Practice_Automation.POM.POM_Login_HRM;
import com.Practice_Automation.Utility.BaseClass;

public class LoginTest extends BaseClass {
	
	@Test
	public void  verifyLogin()
	{
		POM_Login_HRM pom=PageFactory.initElements(driver, POM_Login_HRM.class);
		
		pom.getTxt_uName().sendKeys(config.getUser());
		pom.getTxt_uPass().sendKeys(config.getPass());
		pom.getBtn_Login().click();
		if(config.getHomeUrl().equalsIgnoreCase(driver.getCurrentUrl()))
		{
			System.out.println("home page verification is okay");
		}
		else
		{
			System.out.println("home page verification failed");
		}
		pom.getBtn_LogOut().click();
		if(config.geturl().equalsIgnoreCase(driver.getCurrentUrl()))
		{
			System.out.println("LogOut is SuccessFul");
		}
		else
		{
			System.out.println("logOut is Failed");
		}
	}

}
