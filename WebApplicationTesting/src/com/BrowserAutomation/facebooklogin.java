package com.BrowserAutomation;

import javax.swing.Icon;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.server.handler.FindElement;

import com.thoughtworks.selenium.webdriven.commands.GetTitle;

public class facebooklogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
FirefoxDriver driver = new FirefoxDriver();
driver.get("http://newtours.demoaut.com");




//driver.findElement(By.name("userName")).sendKeys("tutorial");
//driver.findElementByName("userName").sendKeys("tutorial");
WebElement username = driver.findElementByName("userName");
username.sendKeys("tutorial");
driver.findElementByName("password").sendKeys("tutorial");
driver.findElement(By.name("login")).click();

String expected_Title = "Find";
String actual_Title = driver.getTitle();
if(actual_Title.contains(expected_Title))
{
	System.out.println("title matched - pass");
	
}
else
{
	System.out.println("title not matched - fail ");
	
	
}

//<a href="mercuryregister.php">REGISTER</a>
driver.close();

//<input id="pass" class="inputtext" type="password" data-testid="royal_pass" tabindex="2" name="pass">

// id -locator , selector - pass


	}

}
