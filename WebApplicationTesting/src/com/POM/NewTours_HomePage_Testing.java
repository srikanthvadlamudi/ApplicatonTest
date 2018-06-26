package com.POM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTours_HomePage_Testing {
	
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
public void homepage()
{
	WelcomeMercuryTours WMT = PageFactory.initElements(driver, WelcomeMercuryTours.class);
	WMT.Singon();
	System.out.println(driver.getCurrentUrl());
	System.out.println(driver.getTitle());
	driver.navigate().back();
	
	WMT.Contact();
	System.out.println(driver.getCurrentUrl());
	System.out.println(driver.getTitle());
	driver.navigate().back();
	
	WMT.Register();
	System.out.println(driver.getCurrentUrl());
	System.out.println(driver.getTitle());
	driver.navigate().back();
	
	WMT.Support();
	System.out.println(driver.getCurrentUrl());
	System.out.println(driver.getTitle());
	driver.navigate().back();
	
	WMT.findaflight("tutorial","tutorial");
	System.out.println(driver.getCurrentUrl());
	System.out.println(driver.getTitle());
	driver.navigate().back();
	
		
}
@AfterTest
public void TearDown()
{
	driver.close();
}

}
