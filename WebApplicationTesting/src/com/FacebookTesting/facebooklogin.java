package com.FacebookTesting;

import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class facebooklogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirefoxDriver driver =  new FirefoxDriver();
		driver.get("http://facebook.com");
driver.findElementById("email").sendKeys("vadlamudi.srikanth06@gmail.com");
Actions act = new Actions(driver);
act.sendKeys(Keys.TAB).build().perform();
//driver.findElementById("pass").sendKeys("Tanvita15");
//driver.findElementById("u_0_2").click();
act.sendKeys("tanvita15").build().perform();
act.sendKeys(Keys.ENTER).build().perform();
System.out.println(driver.getTitle());
/*Alert alt = driver.switchTo().alert();
System.out.println(alt.getText());*/
driver.close();

	}

}
