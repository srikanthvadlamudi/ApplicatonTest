package com.links;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class findlinks_count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
FirefoxDriver driver = new FirefoxDriver();
driver.get("http://newtours.demoaut.com");
List<WebElement> links = driver.findElementsByTagName("a");

int linkscount = links.size();
System.out.println(linkscount);
driver.close();

	}

}
