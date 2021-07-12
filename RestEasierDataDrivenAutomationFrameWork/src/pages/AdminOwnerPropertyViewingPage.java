package pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import base.DriverInstances;
import utilities.ReadProperties;

public class AdminOwnerPropertyViewingPage extends DriverInstances {

	WebDriver driver;
	public AdminOwnerPropertyViewingPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void adminApplications() throws IOException
	{
		driver.findElement(By.xpath(ReadProperties.fetchElementLocators("Viewing_applications_xpath"))).click();
	}
	
	public void adminGetReports() throws IOException
	{
		driver.findElement(By.xpath(ReadProperties.fetchElementLocators("Viewing_getreport_xpath"))).click();
	}
	
	public void adminEdit() throws IOException
	{
		driver.findElement(By.xpath(ReadProperties.fetchElementLocators("Viewing_edit_xpath"))).click();
		
	}
}
