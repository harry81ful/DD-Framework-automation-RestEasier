package testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import assertions.Compare;
import base.DriverInstances;
import pages.NavigateToLogInPage;

public class TC_02_loginSucess extends DriverInstances {

	@Test
	public void Tc_02_loginFunction_sucess() throws Exception
	{
		boolean result;
		NavigateToLogInPage login= new NavigateToLogInPage(driver);
		login.loginclick();
		login.loginhereclick();
		login.EnterLoginEmail("harry@gmail.com");
		login.EnterLoginPassword("password");
		login.clicksignin();
		result= Compare.ValidatePageTitle(driver, "edit profile");
		Assert.assertTrue(result);
	}
}
