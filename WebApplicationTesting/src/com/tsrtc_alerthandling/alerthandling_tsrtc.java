package com.tsrtc_alerthandling;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class alerthandling_tsrtc {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://tsrtconline.in");
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElementById("searchBtn").click();
		//Thread.sleep(10000);
		//Sleeper.sleepTightInSeconds(8);
		Alert alt = driver.switchTo().alert();
		System.out.println(alt.getText());
		alt.accept();
		//alt.dismiss();
		//alt.sendKeys("Hello");
		
		Sleeper.sleepTightInSeconds(3);
		
		driver.close();
		

	}

}
