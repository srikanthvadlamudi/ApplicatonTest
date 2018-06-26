package com.screenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.firefox.FirefoxDriver;

public class bing_screenshot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://bing.com");
	File srcfile =	((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(srcfile, new File ("C:\\Users\\srika\\Desktop\\Selenium course\\WebApplicationTesting\\Library\\screenshot\\bing.png"));
	driver.close();
}

}
