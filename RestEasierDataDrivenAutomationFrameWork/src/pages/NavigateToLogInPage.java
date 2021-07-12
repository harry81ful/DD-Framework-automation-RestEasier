package pages;

import java.io.IOException;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.annotations.TestInstance;

import base.DriverInstances;
import utilities.ReadProperties;

public class NavigateToLogInPage extends DriverInstances {
	
	 WebDriver driver;
	 public NavigateToLogInPage(WebDriver driver)
	 {
		this.driver=driver;
	 }
	

	public void loginclick() throws IOException
	{
		driver.findElement(By.xpath(ReadProperties.fetchElementLocators("login_button"))).click();
	}
	public void loginhereclick() throws Exception
	{
	
		WebDriverWait wait= new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(ReadProperties.fetchElementLocators("login_here"))));
		driver.findElement(By.xpath(ReadProperties.fetchElementLocators("login_here"))).click();			
	}
	
	
	public void EnterLoginEmail(String email) throws IOException
	{
		driver.findElement(By.name(ReadProperties.fetchElementLocators("login_name"))).sendKeys(email);;
	}
	
	public void EnterLoginPassword(String password) throws IOException
	{
		driver.findElement(By.name(ReadProperties.fetchElementLocators("login_pass_name"))).sendKeys(password);
	}
		
	public void clicksignin() throws IOException

	{
		driver.findElement(By.xpath(ReadProperties.fetchElementLocators("signin_button"))).click();
	}
	
	public void ClickSignUp() throws IOException

	{
		driver.findElement(By.xpath(ReadProperties.fetchElementLocators("signup_button"))).click();
	}
	
	public void EnterFname(String firname) throws IOException

	{
		driver.findElement(By.xpath(ReadProperties.fetchElementLocators("fname"))).sendKeys(firname);
	}
	
	public void EnterLname(String lasname) throws IOException

	{
		driver.findElement(By.xpath(ReadProperties.fetchElementLocators("lname"))).sendKeys(lasname);
	}
	
	public void EnterRegistrationEmail(String Regemail) throws IOException

	{
		driver.findElement(By.xpath(ReadProperties.fetchElementLocators("R_email"))).sendKeys(Regemail);
	}
	
	public void EnterRegPassword(String RegPass) throws IOException

	{
		driver.findElement(By.xpath(ReadProperties.fetchElementLocators("password"))).sendKeys(RegPass);
	}
	
	public void EnterconfPassword(String confPassword) throws Exception

	{
		driver.findElement(By.xpath(ReadProperties.fetchElementLocators("cpassword"))).sendKeys(confPassword);
	}
	
	public void EnterRegButton() throws IOException

	{
		driver.findElement(By.xpath(ReadProperties.fetchElementLocators("register_button"))).click();
	}
}
