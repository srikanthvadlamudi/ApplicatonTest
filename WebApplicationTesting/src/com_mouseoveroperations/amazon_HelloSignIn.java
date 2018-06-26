package com_mouseoveroperations;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class amazon_HelloSignIn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirefoxDriver driver =  new FirefoxDriver();
		driver.get("http://amazon.in");
		driver.manage().window().maximize();
		WebElement Hellosignin = driver.findElementById("nav-link-yourAccount");
		Actions act = new Actions(driver);
		act.moveToElement(Hellosignin).build().perform();
		driver.findElementByXPath(".//*[@id='nav_prefetch_yourorders']/span").click();
		driver.close();
 
	}

}
