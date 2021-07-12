package assertions;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilities.ReadProperties;

public class Compare {
	
		
	public static boolean validatePageUrl(WebDriver driver,String expurl)
	{
		boolean result= false;
		
		if (driver.getCurrentUrl().equalsIgnoreCase(expurl))
		{
			result= true;
		}
		
		return result;
	}
	
	public static boolean ValidatePageTitle(WebDriver driver, String exptitle)
	{
		boolean result= false;
		if (driver.getTitle().equalsIgnoreCase(exptitle))
		{
			result= true;
		}
		return result;
	}
	
	
	public static boolean loginFailure(WebDriver driver, String id) throws IOException
	{
		boolean result= false;
		if (driver.findElement(By.xpath(ReadProperties.fetchElementLocators("login_failure_xpath"))).isDisplayed())
		{
			result=true;
		}	
		return result;
	}
	
	public static boolean LogoutConfirmation(WebDriver driver, String xpathelement) throws Exception
	{
		boolean result= false;
		if(driver.findElement(By.xpath(ReadProperties.fetchElementLocators("Logout_element_xpath"))).isDisplayed())
		{	
			result= true;
		}
		return result;
	}
	
	public static boolean NumberOfListGenerated(WebDriver driver)
	{
		boolean result= false;
		List<WebElement>  listings= driver.findElements(By.xpath("//li/li"));
		if (listings.size()<=25)
		{
			result=true;
		}
		return result;
	}
	
	public static boolean PasswordDontMatch(WebDriver driver) throws IOException
	{
		boolean result=false;
		
		if (driver.findElement(By.xpath(ReadProperties.fetchElementLocators("register_passwordmatch_xpath"))).isDisplayed())
		{
			result=true;
		}
		return result;
		
	}
	
	
	public static boolean PassLenght(WebDriver driver) throws IOException
	{
		boolean result= false;
		if (driver.findElement(By.xpath(ReadProperties.fetchElementLocators("Register_passlenght_xpath"))).isDisplayed())
		{
			result=true;
		}
		return result;
	}
	
	public static boolean RegisterSucess(WebDriver driver, String epxtext) throws IOException
	{
		boolean result= false;
		if(driver.findElement(By.xpath(ReadProperties.fetchElementLocators("register_success_xpath"))).isDisplayed())
		{
			result=true;
		}
		return result;
	}
	
	public static boolean PassRequired(WebDriver driver) throws IOException
	{
		boolean result= false;
		if (driver.findElement(By.xpath(ReadProperties.fetchElementLocators("Register_passrequired_xpath"))).isDisplayed())
		{
			result=true;
		}
		
		return result;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
