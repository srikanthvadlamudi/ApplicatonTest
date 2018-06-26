package com.Keyworddriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Newtours_Login {
	FirefoxDriver driver;
	@BeforeTest
	public void setup()
	{
	driver = new FirefoxDriver();
	driver.get("http://newtours.demoaut.com");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
@Test
public void Login() throws IOException
{
	FileInputStream file = new FileInputStream("C:\\Users\\srika\\Desktop\\Selenium course\\WebApplicationTesting\\newTours.properties");
    Properties properties = new Properties();
    properties.load(file);
    driver.findElementByName(properties.getProperty("Username")).sendKeys("tutorial");
    driver.findElementByName(properties.getProperty("Password")).sendKeys("tutorial");
    driver.findElementByName(properties.getProperty("Signin")).click();
    String expected_title = "Find";
    String actual_title = driver.getTitle();
    if(actual_title.contains(expected_title))
    {
    	System.out.println("Login successful - passed");
    	
    }
    else
    {
    	System.out.println("Loginfailed - failed");
    }
}

@AfterTest
public void TearDown()
{
	driver.close();
}
}
