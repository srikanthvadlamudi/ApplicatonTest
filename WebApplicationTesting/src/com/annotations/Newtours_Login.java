package com.annotations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
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
	public void Login()
	{
		driver.findElementByName("userName").sendKeys("tutorial");
		driver.findElement(By.name("password")).sendKeys("tutorial");
		driver.findElementByName("login").click();
		/*Actions act = new Actions(driver);
		act.sendKeys(Keys.ENTER);*/
		String expected_text = "lowest";
		String actual_text = driver.findElementByXPath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/font").getText();
		if(actual_text.contains(expected_text))
		{
			System.out.println("Loggedin - Passed");
		}
			else
			{	
				System.out.println("Fail");
		}
	
	}
@AfterTest
public void teardown()
{
	driver.close();
}

}
