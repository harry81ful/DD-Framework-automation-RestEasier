package testCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import assertions.Compare;
import base.DriverInstances;
import pages.NavigateToLogInPage;
import pages.ProfilePage;
import utilities.ReadProperties;

public class TC_04_LoginAndLogout extends DriverInstances {
	

	@Test
	public void TC01_Login_Logout() throws Exception
	{
		
		boolean result;
		ProfilePage profile= new ProfilePage(driver);
		NavigateToLogInPage navi= new NavigateToLogInPage(driver);
		navi.loginclick();
		navi.loginhereclick();
		navi.EnterLoginEmail(ReadProperties.fetchPropertyValue("login_email"));
		navi.EnterLoginPassword(ReadProperties.fetchPropertyValue("login_password"));
		navi.clicksignin();
		result=Compare.ValidatePageTitle(driver, "edit profile");
		Assert.assertTrue(result, "!!!ALERT. Failure at page title validation");
		profile.logout();
		result=Compare.LogoutConfirmation(driver, ReadProperties.fetchElementLocators("Logout_element_xpath"));
		Assert.assertTrue(result);
		
	}

}
