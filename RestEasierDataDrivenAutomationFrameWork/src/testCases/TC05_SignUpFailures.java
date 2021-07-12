package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import assertions.Compare;
import base.DriverInstances;
import dataProvider.Datagenrator;
import pages.NavigateToLogInPage;

public class TC05_SignUpFailures extends DriverInstances{
	
	
	@Test(dataProvider="excel2", dataProviderClass = Datagenrator.class)
	
	public void tC_01registerPasswordFailure(String fname, String sname, String email, String password, String Cpassword) throws Exception
	{
		
		boolean result=false;
		NavigateToLogInPage navi= new NavigateToLogInPage(driver);
		navi.ClickSignUp();
		navi.EnterFname(fname);
		navi.EnterLname(sname);
		navi.EnterRegistrationEmail(email);
		navi.EnterRegPassword(password);
		navi.EnterconfPassword(Cpassword);
		navi.EnterRegButton();
		if (Compare.PassLenght(driver)==true)
		{
			result=true;
		}
		else if (Compare.PassRequired(driver)==true)
		{
			result=true;
		}
		else if (Compare.PasswordDontMatch(driver)==true)
		{
			result=true;
		}
		
		Assert.assertTrue(result);
	}

}
