package com.bbc;

import org.openqa.selenium.firefox.FirefoxDriver;

public class bbc_access {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://bbc.co.uk");
		driver.findElementByLinkText("News").click();
	//	driver.findElementsByXPath(".//*[@id='orb-search-q']");
	String title = 	driver.getTitle();
	System.out.println(title);
		
		driver.close();

	}

}
  