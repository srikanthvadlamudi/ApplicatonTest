package com.links;

import org.openqa.selenium.firefox.FirefoxDriver;

public class linksexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FirefoxDriver driver =  new FirefoxDriver();
		driver.get("http://facebook.com");
driver.findElementByClassName("inputtext").sendKeys("vadlamudi.srikanth06@gmail.com");
		String title = driver.getTitle();
System.out.println(title);

	  
driver.close();
	}

}
