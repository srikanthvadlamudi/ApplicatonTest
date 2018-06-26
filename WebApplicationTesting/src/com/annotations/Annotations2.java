package com.annotations;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations2 {
	@BeforeTest
		public void browserlaunchandopengmail()
		{
		System.out.println("FirefoxBrowserlaunch and open Gmail");
	}
	@Test(priority=1)
	public void Login()
	{
		System.out.println("Login Functionality Test");
	}
	@Test(priority=2)
	public void Inbox()
	{
		System.out.println("Inbox_Testing");
	}
	@Test(priority=3)
	public void ComposeMain()
	{
		System.out.println("compose_main_message");
	}
	@AfterTest
	public void applicationclose()
	{
		System.out.println("closeapplication");
	}
	
}
