package com.LoginGuru999;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import junit.framework.Assert;

public class Guru999login {

	public static void main(String[] args) {
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://www.demo.guru99.com/V4/");
		driver.findElementByName("uid").sendKeys("mngr139353");
		driver.findElementByName("password").sendKeys("ytybEsY");
		driver.findElementByName("btnLogin").click();
	String Login = driver.findElementByXPath("html/body/table/tbody/tr/td").getText();
	String expected = "mngr139353";
	//Assert.assertEquals(Login,expected);
	if(Login.contains(expected))
	{
		System.out.println("Login Successful");
	}
	else
	{
		System.out.println("Login Failed");
	}
		driver.close();
		

	}

	
	}


