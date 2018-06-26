package com.annotations;

import org.testng.annotations.Test;

public class Annotations1

{
	@Test(priority=0)
	public void Browserlaunch()
	{
	System.out.println("Firefoxbrowser");
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
	@Test(enabled=false)
	public void ComposeMain()
	{
		System.out.println("compose_main_message");
	}
	}

