package com.Mulitbrowserautomation;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class chrome_browser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\srika\\Desktop\\Selenium course\\WebApplicationTesting\\DriverBrowserFiles\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://facebook.com");
	System.out.println(driver.getTitle());
	driver.close();
	System.setProperty("webdriver.edge.driver", "C:\\Users\\srika\\Desktop\\Selenium course\\WebApplicationTesting\\DriverBrowserFiles\\MicrosoftWebDriver.exe");
	EdgeDriver edge = new EdgeDriver();
	edge.get("http://newtours.demoaut.com");
	System.out.println(edge.getTitle());
		edge.close();
		System.setProperty("webdriver.ie.driver", "C:\\Users\\srika\\Desktop\\Selenium course\\WebApplicationTesting\\DriverBrowserFiles\\IEDriverServer.exe");
		InternetExplorerDriver ie = new InternetExplorerDriver();
		ie.get("http://gmail.com");
		System.out.println(ie.getTitle());
		
		//latest firefox browser version  - selenium server above 3.0
		
		
	}

}
