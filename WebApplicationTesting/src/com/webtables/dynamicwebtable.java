package com.webtables;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class dynamicwebtable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.timeanddate.com/worldclock/");
		WebElement table = driver.findElementByXPath("html/body/div[1]/div[9]/section[2]/div[1]/table");
		List<WebElement> rows =table.findElements(By.tagName("tr"));
		for(int i =0;i<rows.size();i++)
		{
			List<WebElement> columns =rows.get(i).findElements(By.tagName("td"));
			for(int x =0 ;x<columns.size();x++)
			{
				String data = columns.get(x).getText();
				System.out.print(data);
				
			}
			System.out.println();
			
		}
		
driver.close();
	}

}
