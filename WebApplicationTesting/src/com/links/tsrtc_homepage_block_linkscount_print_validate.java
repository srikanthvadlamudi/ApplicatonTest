package com.links;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class tsrtc_homepage_block_linkscount_print_validate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://tsrtconline.in");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.findElementsByClassName("menu-wrap");
		List<WebElement> links = driver.findElementsByTagName("a");
		
		
		
		for (int i=0;i<links.size();i++)
		{
		links.get(i).click();
		String linkname = links.get(i).getText();
		System.out.println(i +"  "+linkname);
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		System.out.println();
		driver.navigate().back();
		driver.findElementsByClassName("menu-wrap");
				links = driver.findElementsByTagName("a");
				
		
		
		
		}

		
		driver.close();

	}

}
	
