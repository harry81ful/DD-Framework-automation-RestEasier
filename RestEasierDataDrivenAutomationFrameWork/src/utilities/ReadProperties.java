package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadProperties {
	
	public static String fetchPropertyValue(String key) throws IOException
	{
		try
		{
			FileInputStream file= new FileInputStream("./files/config.properties");
			Properties property= new Properties();
			property.load(file);
			return property.get(key).toString();
		}
		catch(Exception e)
		{
			e.printStackTrace();
			throw (new RuntimeException("Alert!!!!!! cannot find the key"+key+"and it locator"));
		}
	}
		

	public static String fetchElementLocators(String key) throws IOException
	{
		try
		{
			FileInputStream file= new FileInputStream("./files/elementLocators.properties");
			Properties property= new Properties();
			property.load(file);
		    return property.get(key).toString();
		    
		}
		catch(Exception e)
		{
			e.printStackTrace();
			throw (new RuntimeException("Alert!!!!!! cannot find the key"+key+"and it locator"));
		}
	}
}
 