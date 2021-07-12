package pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import base.DriverInstances;
import utilities.ReadProperties;

public class AddProperties extends DriverInstances{

	WebDriver driver;
	public AddProperties(WebDriver driver)
	{
		this.driver= driver;
	}
	
	public void propertyChooseFile() throws IOException
	{
		driver.findElement(By.xpath(ReadProperties.fetchElementLocators("addprop_choosefilebutton_xpath"))).click();
	}
	
	public void propertyTitle(String key) throws IOException
	{
		driver.findElement(By.name(ReadProperties.fetchElementLocators("addprop_title_name"))).sendKeys(key);
	}
	
	
	public void propertyRegion(String key) throws IOException
	{
		driver.findElement(By.name(ReadProperties.fetchElementLocators("addprop_region_name"))).sendKeys(key);
	}
	
	public void propertyCity(String key) throws IOException
	{
		driver.findElement(By.name(ReadProperties.fetchElementLocators("addprop_city_name"))).sendKeys(key);
	}
	
	public void propertySuburb (String key) throws IOException
	{
		driver.findElement(By.name(ReadProperties.fetchElementLocators("addprop_suburb_name"))).sendKeys(key);
	}
	
	public void propertyStreetName(String key) throws IOException
	{
		driver.findElement(By.name(ReadProperties.fetchElementLocators("addprop_street_name"))).sendKeys(key);
	}
	
	public void propertyRentalRate(String key) throws IOException
	{
		driver.findElement(By.name(ReadProperties.fetchElementLocators("addprop_rentalrate_name"))).sendKeys(key);
		
	}
	
	public void propertySubmit() throws IOException
	{
		driver.findElement(By.xpath(ReadProperties.fetchElementLocators("addprop_submitbutton_xpath"))).click();
	}
	
	
}


