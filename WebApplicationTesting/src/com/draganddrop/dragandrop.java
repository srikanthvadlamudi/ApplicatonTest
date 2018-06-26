package com.draganddrop;

import java.lang.annotation.Target;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class dragandrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
FirefoxDriver driver = new FirefoxDriver();
driver.get("http://jqueryui.com/droppable");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
driver.switchTo().frame(driver.findElementByClassName("demo-frame"));
WebElement source =driver.findElementById("draggable");
WebElement target = driver.findElementById("droppable");
Actions act = new Actions(driver);
act.dragAndDrop(source,target).build().perform();
driver.close();


	}

}
