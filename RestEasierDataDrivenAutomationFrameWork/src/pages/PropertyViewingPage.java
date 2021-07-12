package pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import base.DriverInstances;
import utilities.ReadProperties;

public class PropertyViewingPage extends DriverInstances{
	
	WebDriver driver;
	
	public PropertyViewingPage (WebDriver driver)
	{
		this.driver= driver;
	}
	
	public void viewingApply() throws IOException
	{
		driver.findElement(By.name(ReadProperties.fetchElementLocators("viewing_applybutton_name"))).click();
	}
	
	public void viewingBook() throws IOException
	{
		driver.findElement(By.name(ReadProperties.fetchElementLocators("viewing_bookviewingbutton_name"))).click();
	}
	
	public void viewingAddFav() throws IOException
	{
		driver.findElement(By.name(ReadProperties.fetchElementLocators("viewing_favbutton_name"))).click();
	}
	

}
