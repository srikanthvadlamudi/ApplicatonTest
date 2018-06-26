package com.gmailpractice;

import org.openqa.selenium.Keys;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.server.handler.SendKeys;

public class gmail_createaccountpractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FirefoxDriver driver = new FirefoxDriver();
		Actions act = new Actions(driver);
		driver.get("https://www.google.com/gmail/about/");
		driver.findElementByXPath("html/body/nav/div/a[3]").click();	
		driver.switchTo().window("2");
		//act.sendKeys(Keys.CONTROL+"t");
		
		//driver.get("https://accounts.google.com/signup/v2/webcreateaccount?service=mail&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F%3Fpc%3Dtopnav-about-en&flowName=GlifWebSignIn&flowEntry=SignUp");
	
		driver.findElementById("firstName").sendKeys("selenium");
		act.sendKeys(Keys.TAB);
	act.sendKeys("practice");	
		act.sendKeys(Keys.TAB,"selenium.practice1").build().perform();
		act.sendKeys(Keys.TAB,"Practice@123").build().perform();
		act.sendKeys(Keys.TAB,"Practice@123").build().perform();
		act.sendKeys(Keys.ENTER).build().perform();
	driver.close();

	}

}
