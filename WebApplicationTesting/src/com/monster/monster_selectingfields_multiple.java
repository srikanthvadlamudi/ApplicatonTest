package com.monster;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class monster_selectingfields_multiple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
FirefoxDriver driver = new FirefoxDriver();
driver.get("http://my.monsterindia.com/sponsered_popup.html");
WebElement currentlocation = driver.findElementByClassName("border_grey1");
Select selection = new  Select(currentlocation);
//selection.selectByIndex(2);
//selection.selectByValue("13");
selection.selectByVisibleText("Chennai");
WebElement industry = driver.findElementById("id_industry");
Select selection1 = new Select(industry);
selection1.selectByIndex(2);
selection1.selectByValue("5");
selection1.selectByVisibleText("Any");
WebElement function = driver.findElementById("id_jobCategory");
Select selection2 = new Select(function);
selection2.selectByIndex(5);
selection2.selectByValue("3");
driver.findElementByClassName("border_grey").sendKeys("sql");


	}

}
