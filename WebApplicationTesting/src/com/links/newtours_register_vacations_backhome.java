package com.links;

import org.openqa.selenium.firefox.FirefoxDriver;

public class newtours_register_vacations_backhome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FirefoxDriver driver =  new FirefoxDriver();
		driver.get("http://newtours.demoaut.com");
		driver.findElementByLinkText("REGISTER").click();
		driver.findElementByLinkText("Vacations").click();
		driver.findElementByXPath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[4]/td/a/img").click();
		driver.close();

	}

}
