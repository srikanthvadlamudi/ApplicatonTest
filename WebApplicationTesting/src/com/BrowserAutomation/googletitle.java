package com.BrowserAutomation;

import org.openqa.selenium.firefox.FirefoxDriver;

public class googletitle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
FirefoxDriver driver = new FirefoxDriver();

driver.get("http://google.com");
String google_Title = driver.getTitle();
System.out.println(google_Title);
driver.get("http://appeasee.co.uk");
String title = driver.getTitle();


System.out.println(title);

	}

}
