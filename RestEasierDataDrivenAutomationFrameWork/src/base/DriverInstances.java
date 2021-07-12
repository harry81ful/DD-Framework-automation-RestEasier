package base;

import java.io.IOException;

import javax.imageio.event.IIOReadProgressListener;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverInfo;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import utilities.ReadProperties;

public class DriverInstances {
	
	
	public WebDriver driver;
	
	@BeforeMethod
	public void LaunchDriver() throws IOException
	{
		if(ReadProperties.fetchPropertyValue("app_browser").equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			driver= new ChromeDriver();
		}
		
		else if (ReadProperties.fetchPropertyValue("app_browser").equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
			driver= new FirefoxDriver(); 
					
		}
		
		else if (ReadProperties.fetchPropertyValue("app_browser").equalsIgnoreCase("edge"))
		{
			System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");
			driver= new EdgeDriver();
		}
		
		else
		{
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			driver= new ChromeDriver();
		}
		
		driver.get(ReadProperties.fetchPropertyValue("app_url"));
		driver.manage().window().maximize();
		
		
	}
	
	@AfterMethod
	public void CloseDriver() throws InterruptedException
	{
		
		driver.close();
	}

}
