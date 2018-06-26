package com.BrowserAutomation;

import org.openqa.selenium.firefox.FirefoxDriver;

public class google_title_valiadation {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
FirefoxDriver driver = new FirefoxDriver();
driver.get("http://google.com");
String expected_Title = "google";

String actual_Title=driver.getTitle();
System.out.println(expected_Title+"   "+"expected");
System.out.println(actual_Title+"    "+"actual");

if(actual_Title.equalsIgnoreCase(expected_Title))
{

	System.out.println("Title Matched-- pass");
}
else
{
	System.out.println("Title_NotMatched --FAIL");
		
	}
driver.close();
	}
}
