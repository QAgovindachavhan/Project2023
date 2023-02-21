package test_Cases;

import org.apache.commons.collections4.bag.SynchronizedSortedBag;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.Practice_Automation.POM.POM_Login_HRM;
import com.Practice_Automation.POM.Register_User;
import com.Practice_Automation.Utility.BaseClass;

import junit.framework.Assert;

public class TC_001 extends BaseClass {

	
	@Test
	public void register_user()
	{
		Register_User reg= PageFactory.initElements(driver,Register_User.class );
		String act =reg.getHome().getText();
		String exp="Home";
		if(act.equalsIgnoreCase(exp))
		{
			System.out.println("Home page opened successfully");
		}else
		{
			System.out.println("failed");
		}
		
		reg.getBtn_signIn().click();
		reg.getTxt_userName().sendKeys("Govinda Chavhan");
		reg.getTxt_Email().sendKeys("govindachavhan999@gmail.com");
		reg.getBtn_SignUp().click();
		
		String act1="Enter Account Information";
		String exp1=reg.getVerify_Acc_info().getText();
		if(act1.equalsIgnoreCase(exp1))
		{
			System.out.println("successful");
		}else
		{
			System.out.println("failed");
		}
		
	/*	if(reg.getVerify_NameField().isDisplayed()&& reg.getVerify_EmailField().isDisplayed())
		{
			System.out.println("entered information displayed");
		}else
		{
			System.out.println("Not displaYED entered information displayed");
		}
		*/
		
		reg.getRadio_Gender().click();
		reg.getTxt_pass().sendKeys("pass@123");
		
		Select day =new Select(reg.getSelect_Day());
		day.selectByIndex(14);
		Select m =new Select(reg.getSelect_Months());
		m.selectByIndex(5);
		Select y =new Select(reg.getSelect_Year());
		y.selectByVisibleText("1996");
		
		reg.getChecbox_First();
		reg.getChecbox_Second();
		
//		Address information:
		
		reg.getTxt_Fname().sendKeys("govinda");
		reg.getTxt_Lname().sendKeys("chavhan");
		
		reg.getTxt_Company().sendKeys("ABC");
		reg.getTxt_Address().sendKeys("viman nagar pune");
		
		Select country=new Select(reg.getSelect_Country());
		country.selectByIndex(2);
		reg.getTxt_state().sendKeys("MH");
		reg.getTxt_City().sendKeys("Pune");
		reg.getTxt_Zip().sendKeys("554400");
		reg.getTxt_Mob().sendKeys("9193665588");
		reg.getBtn_Create().click();
		
		String act_Acc_created= "Account Created!";
		String exp_Acc_created=reg.getVerify_Txt_Account_Created().getText();
		
		if(act_Acc_created.equalsIgnoreCase(exp_Acc_created))
		{
			System.out.println("Account has been create successfully");
		}else
		{
			System.out.println("Failed to create Account");
		}
		
		reg.getBtn_Continue().click();
		reg.getLink_delete_acc().click();
		String str=reg.getVerify_delete_acc().getText();
		String str1="ACCOUNT DELETED!";
		Assert.assertEquals(str, str1);
		System.out.println("Account has been deleted successfully");
		
		
		
	}
	

}
