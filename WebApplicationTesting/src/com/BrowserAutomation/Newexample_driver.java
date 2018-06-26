package com.BrowserAutomation;

import org.openqa.selenium.firefox.FirefoxDriver;

import com.thoughtworks.selenium.webdriven.commands.GetAlert;

public class Newexample_driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("http://google.com");
		String title = driver.getTitle() ;
		System.out.println(title);
		driver.get("http://veracode.com");
		String onetitle = driver.getTitle() ;
		System.out.println(onetitle);
		driver.get("http://facebook.com");
		String twotitle = driver.getTitle() ;
		System.out.println(twotitle);
		driver.get("http://amazon.com");
		String threetitle = driver.getTitle() ;
		System.out.println(threetitle);
		driver.close();
		
		
		
		
		
		
		


	}

}
