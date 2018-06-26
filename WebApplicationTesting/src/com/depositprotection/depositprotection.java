package com.depositprotection;

import org.openqa.selenium.firefox.FirefoxDriver;

public class depositprotection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://depositprotection.com");
		driver.findElementByLinkText("Login").click();
		driver.findElementByLinkText("Activate your DPS account").click();
		

	}

}
