package com.DataDriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.WriteAbortedException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Keys;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Newtour_UserReg_Exceldata {
	FirefoxDriver driver = new FirefoxDriver();
	@BeforeTest
	public void setup()
	{
		driver.get("http://newtours.demoaut.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	@Test(priority=0)
	public void register()
	{
		driver.findElementByLinkText("REGISTER").click();
		}
	@Test(priority=1)
	public void userregistration() throws IOException
	
	{
		FileInputStream file = new FileInputStream("C:\\Users\\srika\\Desktop\\Selenium course\\WebApplicationTesting\\src\\com\\newtoursdata\\TestFile.xlsx");
		XSSFWorkbook work = new XSSFWorkbook(file);
		XSSFSheet sheet = work.getSheet("Sheet1");
		FileInputStream file1 = new FileInputStream("C:\\Users\\srika\\Desktop\\Selenium course\\WebApplicationTesting\\newTours.properties");
		Properties pr = new Properties();
	
	
		int Rowcount = sheet.getLastRowNum();
		for(int i=1;i<=Rowcount;i++)
		{
			Row r = sheet.getRow(i);
			pr.load(file1);	 
			
		driver.findElementByName(pr.getProperty("FirstName")).sendKeys(r.getCell(0).getStringCellValue());
		driver.findElementByName(pr.getProperty("LastName")).sendKeys(r.getCell(1).getStringCellValue());
		double d = r.getCell(2).getNumericCellValue();
		long y =(long)d;
		String phonenumber = Long.toString(y);
		driver.findElementByName(pr.getProperty("Phone")).sendKeys(phonenumber);
		driver.findElementByName(pr.getProperty("Email")).sendKeys(r.getCell(3).getStringCellValue());
		driver.findElementByName(pr.getProperty("Address1")).sendKeys(r.getCell(4).getStringCellValue());
		driver.findElementByName(pr.getProperty("Address2")).sendKeys(r.getCell(5).getStringCellValue());
		driver.findElementByName(pr.getProperty("City")).sendKeys(r.getCell(6).getStringCellValue());
		driver.findElementByName(pr.getProperty("State")).sendKeys(r.getCell(7).getStringCellValue());
		driver.findElementByName(pr.getProperty("Postalcode")).sendKeys(r.getCell(8).getStringCellValue());
		driver.findElementByName(pr.getProperty("Country")).sendKeys(r.getCell(9).getStringCellValue());
		driver.findElementByName(pr.getProperty("Username1")).sendKeys(r.getCell(10).getStringCellValue());
		driver.findElementByName(pr.getProperty("RegPassword")).sendKeys(r.getCell(11).getStringCellValue());
		driver.findElementByName(pr.getProperty("Confirmpassword")).sendKeys(r.getCell(12).getStringCellValue());	
				driver.findElementByName(pr.getProperty("submit")).click();
		String expected_username = r.getCell(10).getStringCellValue();
		String actual_username = driver.findElementByXPath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[3]/a/font/b").getText();
		if(actual_username.contains(expected_username))
				
		{
			System.out.println("User Registered Successfull - Pass");
			r.createCell(13).setCellValue("User Registered Successfull - Pass");
			
		}
		else
		{
			System.out.println("User Registration faile - fail");
			r.createCell(13).setCellValue("User Registered Successfull - Pass");
		}
		FileOutputStream file2 = new FileOutputStream("C:\\Users\\srika\\Desktop\\Selenium course\\WebApplicationTesting\\src\\com\\Newexceldata\\NewExcedata.xlsx");
		work.write(file2);
		driver.navigate().back();
		}
	}

@AfterTest
public void tearDown() {
	driver.close();
}
}
