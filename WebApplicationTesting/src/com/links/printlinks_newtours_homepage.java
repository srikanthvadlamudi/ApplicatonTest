package com.links;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.thoughtworks.selenium.webdriven.commands.GetTitle;

public class printlinks_newtours_homepage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://www.tsrtconline.in/oprs-web/");
		driver.findElementsByClassName("menu-wrap");
		List<WebElement> links = driver.findElementsByTagName("a");
		System.out.println(links);
		
		
		
		
		driver.close();

	}

}
