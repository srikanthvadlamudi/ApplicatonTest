package com.POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WelcomeMercuryTours {
	
@FindBy(linkText="SIGN-ON")
WebElement signon;
public void Singon()
{
signon.click();
}
@FindBy(linkText="REGISTER")
WebElement register;
public void Register()

{
	register.click();
}
@FindBy(linkText="SUPPORT")
WebElement support;
public void Support()
{
	support.click();
}
@FindBy(linkText="CONTACT")
WebElement contact;
public void Contact()
{
	contact.click();
}
@FindBy(name="userName")
WebElement username;
@FindBy(name="password")
WebElement password;
@FindBy(name="login")
WebElement singin;

public void findaflight(String UserName,String Password)
{
	username.sendKeys(UserName);
	password.sendKeys(Password);
	singin.click();
}

}
