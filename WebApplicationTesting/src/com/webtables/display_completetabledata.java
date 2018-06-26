package com.webtables;

import org.openqa.selenium.firefox.FirefoxDriver;

public class display_completetabledata {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.timeanddate.com/worldclock/");
		//html/body/div[1]/div[9]/section[2]/div[1]/table/tbody/tr[1]/td[1]
		//html/body/div[1]/div[9]/section[2]/div[1]/table/tbody/tr[36]/td[8]
		for(int i=1;i<=36;i++)
		{
			for(int x=1;x<=8;x++)
			{
				String city = driver.findElementByXPath("html/body/div[1]/div[9]/section[2]/div[1]/table/tbody/tr["+i+"]/td["+x+"]").getText();
				System.out.print(city+"   ");
			}
			System.out.println();
		}
driver.close();
	}

}
