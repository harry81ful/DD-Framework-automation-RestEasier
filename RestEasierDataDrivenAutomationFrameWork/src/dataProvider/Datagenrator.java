package dataProvider;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class Datagenrator {
	
	@DataProvider(name="excel")
	public static Object[][] testdata() throws IOException
	{
		FileInputStream file= new FileInputStream("./test data/test data.xlsx");
		XSSFWorkbook wkbook= new XSSFWorkbook(file);
		XSSFSheet loginsheet= wkbook.getSheet("login data");
		int nodata= loginsheet.getPhysicalNumberOfRows();
		Object	[][] data= new Object [nodata][2];
		for (int i=0;i<nodata;i++)
		{
			XSSFRow row= loginsheet.getRow(i);
			XSSFCell email=row.getCell(0);
			XSSFCell password= row.getCell(1);
			data[i][0]= email.getStringCellValue();
			data[i][1]=password.getStringCellValue();
		}
		
		return data;
	}

	@DataProvider(name="excel1")
	public static Object[][] testMultipleAttemptData() throws IOException
	{
		FileInputStream file= new FileInputStream("./test data/test data.xlsx");
		XSSFWorkbook wkbook= new XSSFWorkbook(file);
		XSSFSheet loginsheet= wkbook.getSheet("mutiple attempts");
		int nodata= loginsheet.getPhysicalNumberOfRows();
		Object	[][] data= new Object [nodata][2];
		for (int i=0;i<nodata;i++)
		{
			XSSFRow row= loginsheet.getRow(i);
			XSSFCell email=row.getCell(0);
			XSSFCell password= row.getCell(1);
			data[i][0]= email.getStringCellValue();
			data[i][1]=password.getStringCellValue();
		}
		
		return data;
	}
	
	@DataProvider(name="excel2")
	public static Object[][] PasswordFailureData() throws IOException
	{
		FileInputStream file= new FileInputStream("./test data/test data.xlsx");
		XSSFWorkbook wkbook= new XSSFWorkbook(file);
		XSSFSheet loginsheet= wkbook.getSheet("signup_data1");
		int nodata= loginsheet.getPhysicalNumberOfRows();
		Object	[][] data= new Object [nodata][5];
		for (int i=0;i<nodata;i++)
		{
			XSSFRow row= loginsheet.getRow(i);
			XSSFCell fname=row.getCell(0);
			XSSFCell sname= row.getCell(1);
			XSSFCell email=row.getCell(2);
			XSSFCell password=row.getCell(3, org.apache.poi.ss.usermodel.Row.MissingCellPolicy.CREATE_NULL_AS_BLANK);
			XSSFCell cpassword=row.getCell(4, org.apache.poi.ss.usermodel.Row.MissingCellPolicy.CREATE_NULL_AS_BLANK);
			data[i][0]=fname.getStringCellValue();
			data[i][1]=sname.getStringCellValue();
			data[i][2]=email.getStringCellValue();
			data[i][3]=password.getStringCellValue();
			data[i][4]=cpassword.getStringCellValue();		
		}
		
		return data;
	}
}
