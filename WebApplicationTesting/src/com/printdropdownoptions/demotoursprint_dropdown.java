package com.printdropdownoptions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class demotoursprint_dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
FirefoxDriver driver = new FirefoxDriver();
driver.get("http://newtours.demoaut.com");
driver.findElementByLinkText("REGISTER").click();
WebElement country = driver.findElementByName("country");
List<WebElement>countrynames = country.findElements(By.tagName("option"));
		for(int i=0;i<countrynames.size();i++)
		{
			String cname = countrynames.get(i).getText();
			System.out.println(i+1 + "  "+ cname);
		}
		driver.close();
	}

}
