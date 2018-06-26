package com.DataDriven;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Newtours_Newuser {
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
	public void userregistration()
	{
		driver.findElementByName("firstName").sendKeys("Srikanth");;
				Actions act = new  Actions(driver);
		act.sendKeys(Keys.TAB).sendKeys("Vadlamudi").build().perform();
		act.sendKeys(Keys.TAB).sendKeys("07502261580").build().perform();
		act.sendKeys(Keys.TAB).sendKeys("srikanth@gmail.com").build().perform();
		act.sendKeys(Keys.TAB).sendKeys("327 academy").build().perform();
		act.sendKeys(Keys.TAB).sendKeys("court").build().perform();
		act.sendKeys(Keys.TAB).sendKeys("london").build().perform();
		act.sendKeys(Keys.TAB).sendKeys("london").build().perform();
		act.sendKeys(Keys.TAB).sendKeys("rm8 2ff").build().perform();
		act.sendKeys(Keys.TAB).sendKeys("UNITED KINGDOM").build().perform();
		act.sendKeys(Keys.TAB).sendKeys("sree").build().perform();
		act.sendKeys(Keys.TAB).sendKeys("password123").build().perform();
		act.sendKeys(Keys.TAB).sendKeys("password123").build().perform();
		driver.findElementByName("register").click();
		String expected_username = "sree";
		String actual_username = driver.findElementByXPath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[3]/a/font/b").getText();
		if(actual_username.contains(expected_username))
				
		{
			System.out.println("User Registered Successfull - Pass");
			
		}
		else
		{
			System.out.println("User Registration faile - fail");
		}
	     				
	}
@AfterTest
public void tearDown() {
	driver.close();
}
}
