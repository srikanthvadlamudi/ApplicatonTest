package com.Chromedriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class Chromedrivertesting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://facebook.com");
		System.out.println(driver.getCurrentUrl()+"    "+driver.getTitle());
		driver.close();

	}

}
