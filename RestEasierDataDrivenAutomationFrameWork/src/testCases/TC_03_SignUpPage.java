package testCases;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Test;

import assertions.Compare;
import base.DriverInstances;
import pages.NavigateToLogInPage;

public class TC_03_SignUpPage extends DriverInstances {

	@Test
	public void SignUpForm() throws Exception
	{
		boolean result;
		NavigateToLogInPage navi= new NavigateToLogInPage(driver);
		navi.ClickSignUp();
		navi.EnterFname("harry");
		navi.EnterLname("kay");
		navi.EnterRegistrationEmail("harry@gmail.com");
		navi.EnterRegPassword("password");
		navi.EnterconfPassword("password");
		navi.EnterRegButton();
		result= Compare.ValidatePageTitle(driver, "edit profile");
		Assert.assertTrue(result);
		
	}
}
