package com.ecommerceguru;

import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.swing.text.TabableView;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Keyboard;
import org.openqa.selenium.support.ui.Select;

public class Firsttask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://live.guru99.com/index.php/");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		System.out.println(driver.getTitle());
		driver.findElementByXPath(".//*[@id='nav']/ol/li[1]/a").click();
        System.out.println(driver.getTitle());
        driver.findElementByTagName(option).click();
        		
        			
        			
        			
        	        
        		}


	}


