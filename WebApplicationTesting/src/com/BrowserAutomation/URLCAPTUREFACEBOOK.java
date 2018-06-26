package com.BrowserAutomation;

import org.openqa.selenium.firefox.FirefoxDriver;

public class URLCAPTUREFACEBOOK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://facebook.com");
	String expected_url = "facebook.com";
String actual_url = driver.getCurrentUrl();

System.out.println(actual_url+"   "+"actual");
System.out.println(expected_url+"   "+"expected");
if(actual_url.contains(expected_url))
{
	System.out.println("URL matched -- pass");
	
}
else
{
	System.out.println("URL did not matched -- fail");
}

System.out.println(actual_url);

driver.close();
	}

}
