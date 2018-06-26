package com.links;

import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByTagName;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.thoughtworks.selenium.webdriven.commands.GetAlert;

public class links_tsrct_block {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://tsrtconline.in");
		WebElement HeaderBlock=driver.findElement(By.className("menu-wrap"));
	    
	    java.util.List<WebElement>HeaderBlockLinks=HeaderBlock.findElements(By.tagName("a"));
	    
	    for(int i=0;i<HeaderBlockLinks.size();i++)
	        {
	        
	            String HeaderLinkName=HeaderBlockLinks.get(i).getText();
	            System.out.println(HeaderLinkName);
	            
	            HeaderBlockLinks.get(i).click();
	            
	            System.out.println(driver.getTitle());
	            System.out.println(driver.getCurrentUrl());
	            System.out.println();
	            
	            driver.navigate().back();
	            
	            HeaderBlock=driver.findElement(By.className("menu-wrap"));
	            HeaderBlockLinks=HeaderBlock.findElements(By.tagName("a"));
	            
	            
	        }
	    driver.close();
	}

	}


