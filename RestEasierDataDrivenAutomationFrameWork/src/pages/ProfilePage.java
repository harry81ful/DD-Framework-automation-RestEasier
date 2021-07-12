package pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import base.DriverInstances;
import utilities.ReadProperties;

public class ProfilePage extends DriverInstances {
	
	WebDriver driver;
	 public ProfilePage(WebDriver driver)
	 {
		this.driver=driver;
	 }
	
	public void EditProfileFname(String Fname) throws IOException
	{
		driver.findElement(By.name(ReadProperties.fetchElementLocators("profile_fname"))).sendKeys(Fname);;
		
	}
	
	public void EditProfileSname(String Sname) throws IOException
	{
		driver.findElement(By.name(ReadProperties.fetchElementLocators("profile_surname"))).sendKeys(Sname);
	}
	
	public void ChangePassword() throws IOException
	{
		driver.findElement(By.xpath(ReadProperties.fetchElementLocators("profile_changepassword_xpath"))).click();
	}

	public void changeEmail(String changeemail) throws IOException
	{
		driver.findElement(By.name(ReadProperties.fetchElementLocators("profile_email_name"))).sendKeys(changeemail);
	}
	
	public void EnterCard(String num)throws IOException
	{
	
		driver.findElement(By.xpath(ReadProperties.fetchElementLocators("profile_cardnumber_xpath"))).sendKeys(num);
			
	}
	
	public void Save()throws Exception
	{
		driver.findElement(By.name(ReadProperties.fetchElementLocators("profile_save_name"))).click();
	}
	
	public void logout() throws Exception
	{
		driver.findElement(By.xpath(ReadProperties.fetchElementLocators("profile_logout_xpath"))).click();
	}
	
	public void EnterUpgradeAccount() throws Exception
	{
		driver.findElement(By.xpath(ReadProperties.fetchElementLocators("profile_upgrage_xpath"))).click();
	}
	
	public void ClickUpgrade()throws Exception
	{
		driver.findElement(By.name(ReadProperties.fetchElementLocators("Profile_credit_update_name"))).click();
	}
	
	public void ClickFav()throws Exception
	{
		driver.findElement(By.xpath(ReadProperties.fetchElementLocators("profile_fav_xpath"))).click();
	}
	
	public void clickInvite()throws Exception
	{
		driver.findElement(By.xpath(ReadProperties.fetchElementLocators("profile_invites_xpath"))).click();
	}
	
	public void clickApplication()throws Exception
	{
		driver.findElement(By.xpath(ReadProperties.fetchElementLocators("profile_application_xpath"))).click();
	}
	
	public void clickReviews() throws Exception
	{
		driver.findElement(By.xpath(ReadProperties.fetchElementLocators("profile_review_xpath"))).click();
	}
	
	public void clickHome() throws Exception
	{
		driver.findElement(By.xpath(ReadProperties.fetchElementLocators("profile_home_xpath"))).click();
	}
	
	public void clickProfile() throws Exception
	{
		driver.findElement(By.xpath(ReadProperties.fetchElementLocators("profile_profile_xpath"))).click();
	}
	
	public void clickSearch() throws Exception
	{
		driver.findElement(By.xpath(ReadProperties.fetchElementLocators("profile_search_xpath"))).click();
	}
	
	public void clickAddProperties() throws Exception
	{
		driver.findElement(By.xpath(ReadProperties.fetchElementLocators("profile_addproperty_xpath"))).click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
