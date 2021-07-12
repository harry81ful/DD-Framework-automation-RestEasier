package pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import base.DriverInstances;
import utilities.ReadProperties;

public class SearchPage extends DriverInstances {
	
	WebDriver driver;
	 public SearchPage(WebDriver driver)
	 {
		this.driver=driver;
	 }
	 
	 public void searchLocation(String locationname) throws IOException
	 {
		 driver.findElement(By.name(ReadProperties.fetchElementLocators("search_location_name"))).sendKeys(locationname);
	 }
	 
	 public void searchBedrooms(String nrooms) throws IOException
	 {
		 driver.findElement(By.name(ReadProperties.fetchElementLocators("search_bedrooms_name"))).sendKeys(nrooms);
	 }
	 
	 public void searchButton() throws IOException
	 {
		 driver.findElement(By.xpath(ReadProperties.fetchElementLocators("search_searchbutton_name"))).click();
	 }
	 
	 public void searchPageTwo() throws IOException
	 {
		 driver.findElement(By.xpath(ReadProperties.fetchElementLocators("search_page2_xpath"))).click();
	 }
	 
	 public void searchPageThree() throws IOException
	 {
		 driver.findElement(By.xpath(ReadProperties.fetchElementLocators("search_page3_xpath"))).click();
	 }
	 
	 public void searchNextPage() throws IOException
	 {
		 driver.findElement(By.xpath(ReadProperties.fetchElementLocators("search_nexpage_xpath"))).click();
	 }
	 
	 public void searchClickProperty() throws IOException
	 {
		 driver.findElement(By.xpath(ReadProperties.fetchElementLocators("serach_firstlisting_xpath"))).click();
	 }
	 

}
