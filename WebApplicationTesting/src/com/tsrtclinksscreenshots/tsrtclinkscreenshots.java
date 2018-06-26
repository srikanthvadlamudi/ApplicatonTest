package com.tsrtclinksscreenshots;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class tsrtclinkscreenshots {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
FirefoxDriver driver = new FirefoxDriver();
driver.get("http://tsrtconline.in");
driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
WebElement headerblock = driver.findElementByClassName("menu-wrap");
List<WebElement> links = headerblock.findElements(By.tagName("a"));

for(int i=0;i<links.size();i++) {
	links.get(i).click();
	String linkname = driver.getCurrentUrl();
	String title = driver.getTitle();
	System.out.println( i + " " + linkname + title);
	File srcfile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	//File srcfile =	((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(srcfile, new File ("C:\\Users\\srika\\Desktop\\Selenium course\\WebApplicationTesting\\Library\\tsrtcprints1\\"+title+".png"));
	driver.get("http://tsrtconline.in");
	headerblock = driver.findElementByClassName("menu-wrap");
	links = headerblock.findElements(By.tagName("a"));
	

}
driver.close();
	}
	}


