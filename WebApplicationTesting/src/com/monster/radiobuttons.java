package com.monster;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class radiobuttons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://www.echoecho.com/htmlforms10.htm");
		driver.manage().window().maximize();
		
		WebElement block = driver.findElementByXPath("html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[3]/tbody/tr/td/table/tbody/tr/td");
	List<WebElement> radio_block = block.findElements(By.name("group1"));
	System.out.println("radioblock"+"   " +radio_block.size());
	for(int i = 0;i<radio_block.size();i++)
	{
		radio_block.get(i).click();
		Sleeper.sleepTightInSeconds(10);
		for(int x =0;x<radio_block.size();x++)
		{
			System.out.println(radio_block.get(x).getAttribute("value")+"  "+radio_block.get(x).getAttribute("checked"));
		}
	}
	
	driver.close();

	}

}
