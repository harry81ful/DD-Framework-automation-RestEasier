package testCases;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import assertions.Compare;
import base.DriverInstances;
import dataProvider.Datagenrator;
import pages.NavigateToLogInPage;
import utilities.ReadProperties;

public class Tc_01_LoginFailure extends DriverInstances {

	/* (dataProvider="excel", dataProviderClass = Datagenrator.class) this is required only when reading form a dataprovider and
	 different package. If data generator method is defined in the same class 
	 dataProviderClass = Datagenrator.class is not required*/
	
	
	@Test(dataProvider="excel", dataProviderClass = Datagenrator.class)
	public void Tc_01_loginFunctions_failure(String email, String password) throws Exception
	{
		
		boolean result;
		NavigateToLogInPage login= new NavigateToLogInPage(driver);
		login.loginclick();
		login.loginhereclick();
		login.EnterLoginEmail(email);
		login.EnterLoginPassword(password);
		login.clicksignin();
		result= Compare.loginFailure(driver, "//p[@id='MemberLoginForm_LoginForm_error']");
		Assert.assertTrue(result);
			
	}
	
	
	@Test(dataProvider="excel1", dataProviderClass = Datagenrator.class)
	public void Tc_01_loginFunctions_failure_multiple(String email, String password) throws Exception
	{
		
		boolean result;
		NavigateToLogInPage login= new NavigateToLogInPage(driver);
		login.loginclick();
		login.loginhereclick();
		login.EnterLoginEmail(email);
		login.EnterLoginPassword(password);
		login.clicksignin();
		result= Compare.loginFailure(driver, ReadProperties.fetchElementLocators("multiple_fail"));
		Assert.assertTrue(result);
			
	}
	
	
	
	/* this method is used in case if the data is input in the same class 
	 
	 
	@DataProvider(name="static")
	public Object [][] GenerateData()
	{
		Object [][] data= {{"requiremail1", "password1"}, {"requiremail2", "password2"}};
		return data;
	}
	 
	*/
}
